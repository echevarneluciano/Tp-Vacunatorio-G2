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
public class LaboratorioData {
    
    private Connection con; 
    
    public LaboratorioData(Conexion conn){
        try {
            this.con =  conn.getConexion();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion.");
        }
    }
    
    public void ingresarLaboratorio(Laboratorio lab){
        String sql="INSERT INTO laboratorio (nombre, paisOrigen, direccion, estado) VALUES (?,?,?,?)";       
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, lab.getNombre());
            ps.setString(2, lab.getPaisOrigen());
            ps.setString(3, lab.getDireccion());
            ps.setBoolean(4, lab.isEstado());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                lab.setIdLaboratorio(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Ingresado con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al guardar el laboratorio en la base de datos, revise su conexion");
        }
    }
    public void actualizarLaboratorio(Laboratorio lab){
        String sql="UPDATE laboratorio SET nombre=?,paisOrigen=?,direccion=?,estado=? where idLaboratorio=?";       
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, lab.getNombre());
            ps.setString(2, lab.getPaisOrigen());
            ps.setString(3, lab.getDireccion());
            ps.setBoolean(4, lab.isEstado());
            ps.setInt(5, lab.getIdLaboratorio());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                lab.setIdLaboratorio(rs.getInt(1));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al actializar el laboratorio");
        }
    }
    public void modificarEstado(int id){
        String sql="UPDATE `laboratorio` SET `estado`=? WHERE `idLaboratorio`=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            Laboratorio lab = this.buscarLaboratorio(id);
            ps.setBoolean(1, !lab.isEstado());
            ps.setInt(2, id);
            ps.executeUpdate();
            ps.close();   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al modificar el estado del laboratorio");
        }
    }
   
    public Laboratorio buscarLaboratorio(int id){
        Laboratorio lab = new Laboratorio();
        String sql="SELECT * FROM `laboratorio` WHERE `idLaboratorio`=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                lab.setNombre(rs.getString("nombre"));
                lab.setPaisOrigen(rs.getString("paisOrigen"));
                lab.setDireccion(rs.getString("direccion"));
                lab.setEstado(rs.getBoolean("estado"));
                lab.setIdLaboratorio(rs.getInt("idLaboratorio"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al buscar el laboratorio ingresado");
        }
        return lab;
    }
    public List<Laboratorio> obtenerLaboratorios(){
        ArrayList<Laboratorio> labs=new ArrayList<>();        
        String sql="SELECT * FROM `laboratorio`";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Laboratorio lab = new Laboratorio();
                lab.setNombre(rs.getString("nombre"));
                lab.setPaisOrigen(rs.getString("paisOrigen"));
                lab.setDireccion(rs.getString("direccion"));
                lab.setEstado(rs.getBoolean("estado"));
                lab.setIdLaboratorio(rs.getInt("idLaboratorio"));
                labs.add(lab);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al intentar obtener el listado de laboratorios");
        }
        return labs;
    }
}
