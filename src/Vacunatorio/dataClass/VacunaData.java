/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vacunatorio.dataClass;

import Vacunatorio.clases.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Guido Caballero
 */
public class VacunaData {
    private Connection con; 
    
    public VacunaData(Conexion conn){
        try {
            this.con =  conn.getConexion();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al conectar con la base de datos");
        }
    }
    
    public void ingresarVacuna(Vacuna vac){
        String sql="INSERT INTO vacuna (idLaboratorio, nroSerie, estado) VALUES (?,?,?)";       
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, vac.getLaboratorio().getIdLaboratorio());
            ps.setInt(2, vac.getNroSerie());
            ps.setBoolean(3, vac.isEstado());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                vac.setIdVacuna(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Vacuna ingresada con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al guardar la vacuna en la base de datos, puede que el numero de serie esté repetido");
        }
    }
    public void actualizarVacuna(Vacuna vac){
        String sql="UPDATE `vacuna` SET `idLaboratorio`=? ,`nroSerie`=? ,`estado`=? WHERE `nroSerie`=?";       
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,vac.getLaboratorio().getIdLaboratorio());
            ps.setInt(2, vac.getNroSerie());
            ps.setBoolean(3, vac.isEstado());
            ps.setInt(4, vac.getNroSerie());
            ResultSet rs = ps.getGeneratedKeys();
            ps.executeUpdate();
            if(rs.next()){
                vac.setIdVacuna(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Vacuna modificada con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al actualizar la vacuna");
        }
    }
    
    public void modificarEstado(int id){
        String sql="UPDATE `vacuna` SET `estado`=? WHERE `nroSerie`=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            Vacuna vac = this.buscarVacuna(id);
            ps.setBoolean(1, !vac.isEstado());
            ps.setInt(2, vac.getNroSerie());
            ps.executeUpdate();
            ps.close();   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al modificar el estado de la vacuna");
        }
    }
   
    public Laboratorio BuscarLaboratorio(int id){
        Laboratorio lab=new Laboratorio();
        String sql = "SELECT l.* FROM laboratorio AS l, vacuna AS vac WHERE l.idLaboratorio=vac.idLaboratorio AND vac.idLaboratorio=?";
        try{
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                lab.setIdLaboratorio(rs.getInt("idLaboratorio"));
                lab.setNombre(rs.getString("nombre"));
                lab.setPaisOrigen(rs.getString("paisOrigen"));
                lab.setDireccion(rs.getString("direccion"));
                lab.setEstado(rs.getBoolean("estado"));
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error de conexion al buscar laboratoratorios desde el registro de vacuna");
        }
    return lab;
    }
    public Vacuna buscarVacuna(int ns){
        Vacuna vac = new Vacuna();
        String sql="SELECT * FROM vacuna WHERE nroSerie=?";
        try {
            
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ns);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                Laboratorio lab = this.BuscarLaboratorio(rs.getInt("idLaboratorio"));
                vac.setLaboratorio(lab);
                vac.setNroSerie(rs.getInt("nroSerie"));
                vac.setEstado(rs.getBoolean("estado"));
                vac.setIdVacuna(rs.getInt("idVacuna"));
              
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al buscar el laboratorio ingresado");
        }
    return vac;
    }
    
    public List<Vacuna> obtenerVacunas(){
        ArrayList<Vacuna> vacunas=new ArrayList<>();
        String sql="SELECT * FROM `vacuna`";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Vacuna vac = new Vacuna();
                vac.setLaboratorio(this.BuscarLaboratorio(rs.getInt("idLaboratorio")));
                vac.setNroSerie(rs.getInt("nroSerie"));
                vac.setEstado(rs.getBoolean("estado"));
                vac.setIdVacuna(rs.getInt("idVacuna"));
                vacunas.add(vac);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al intentar obtener el listado de vacunas");
        }
        return vacunas;
    } 
    public List<Vacuna> obtenerVacunasxLaboratorio(int idLab){
        ArrayList<Vacuna> vacunas=new ArrayList<>();
        Vacuna vac;
        String sql="SELECT * FROM `vacuna` WHERE `idLaboratorio` = ?";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,idLab);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                vac = new Vacuna();
                Laboratorio lab = BuscarLaboratorio(rs.getInt("idLaboratorio"));
                vac.setLaboratorio(lab);
                vac.setNroSerie(rs.getInt("nroSerie"));
                vac.setEstado(rs.getBoolean("estado"));
                vac.setIdVacuna(rs.getInt("idVacuna"));
                vacunas.add(vac);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al intentar obtener el listado de vacunas");
        }
    return vacunas;
    }
    
}
