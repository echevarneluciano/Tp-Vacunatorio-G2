/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vacunatorio.dataClass;

/**
 *
 * @author Wi7o
 */

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Vacunatorio.clases.Vacunatorio;


public class VacunatorioData {
    private Connection con;
    
    public VacunatorioData(Conexion conn){
        try {
            this.con =  conn.getConexion();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion en VacunatorioData.");
        }
    }
    
    public void ingresarVacunatorio (Vacunatorio vc){
        String sql="INSERT INTO `vacunatorios`(`nombre`, `localidad`, `calle`, `altura`, `estado`) VALUES (?,?,?,?,?)";       
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, vc.getNombre());
            ps.setString(2, vc.getLocalidad());
            ps.setString(3, vc.getCalle());
            ps.setInt(4, vc.getAltura());
            ps.setBoolean(5, vc.isEstado());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
            vc.setIdVacunatorio(rs.getInt(1));
            JOptionPane.showMessageDialog(null,"Ingresado con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion en metodo ingresarVacunatorio.");
        }
    }
    
    public void actualizarVacunatorio(Vacunatorio vc){
        String sql="UPDATE vacunatorios SET nombre=?,localidad=?,calle=?,altura=?,estado=? where idVacunatorio=?";       
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, vc.getNombre());
            ps.setString(2, vc.getLocalidad());
            ps.setString(3, vc.getCalle());
            ps.setInt(4, vc.getAltura());
            ps.setBoolean(5, vc.isEstado());
            ps.setInt(6, vc.getIdVacunatorio());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                vc.setIdVacunatorio(rs.getInt(1));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al intentar actualizar los datos");
        }
    }
    
    public void modificarEstado(int id){
        String sql="UPDATE `vacunatorios` SET `estado`=? WHERE `idLaboratorio`=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            Vacunatorio vc = this.buscarVacunatorio(id);
            ps.setBoolean(1, !vc.isEstado());
            ps.setInt(2, id);
            ps.executeUpdate();
            ps.close();   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al modificar el estado del vacunatorio");
        }
    }
    
    public Vacunatorio buscarVacunatorio(int id){
        Vacunatorio vc = new Vacunatorio();
        String sql="SELECT * FROM `vacunatorios` WHERE `idVacunatorio`=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                vc.setNombre(rs.getString("nombre"));
                vc.setLocalidad(rs.getString("localidad"));
                vc.setCalle(rs.getString("calle"));
                vc.setAltura(rs.getInt("altura"));
                vc.setEstado(rs.getBoolean("estado"));
                vc.setIdVacunatorio(rs.getInt("idVacunatorio"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al buscar el vacunatorio ingresado");
        }
        return vc;
    }
    
    public List<Vacunatorio> obtenerVacunatorios(){
        ArrayList<Vacunatorio> vcs=new ArrayList<>();        
        String sql="SELECT * FROM `vacunatorios`";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Vacunatorio vc = new Vacunatorio();
                vc.setNombre(rs.getString("nombre"));
                vc.setLocalidad(rs.getString("localidad"));
                vc.setCalle(rs.getString("calle"));
                vc.setAltura(rs.getInt("altura"));
                vc.setEstado(rs.getBoolean("estado"));
                vc.setIdVacunatorio(rs.getInt("idVacunatorio"));
                vcs.add(vc);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al intentar obtener el listado de vacunatorios");
        }
        return vcs;
    }
    
    public int cantidadDeDosisAplicadasEnVacunatorio(int id){
        int ctd = 0;
        String sql="SELECT COUNT(idVacunatorio) AS cantidad FROM `citas` WHERE fechYhorTurno < now() AND idVacunatorio=? ";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                ctd = rs.getInt("cantidad");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al intentar obtener la cantidad de dosis");
        }      
        return ctd;
    }
}
