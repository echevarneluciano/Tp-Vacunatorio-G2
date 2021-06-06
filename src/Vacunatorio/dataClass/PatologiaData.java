/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vacunatorio.dataClass;

import Vacunatorio.clases.Laboratorio;
import Vacunatorio.clases.Patologia;
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
 * @author luciano.echevarne
 */
public class PatologiaData {
    private Connection con; 
    
    public PatologiaData(Conexion conn){
        try {
            this.con =  conn.getConexion();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al conectar con la base de datos");
        }
    }
    
    public void ingresarPatologia(Patologia pat){
        String sql="INSERT INTO patologia (nombre, estado) VALUES (?,?)";       
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pat.getNombre());
            ps.setBoolean(2, pat.isEstado());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                pat.setIdPatologia(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Ingresado con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al guardar patologia en la base de datos, revise su conexion");
        }
    }
    public void actualizarPatologia(Patologia pat){
        String sql="UPDATE patologia SET nombre=?,estado=? where idPatologia=?";       
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pat.getNombre());
            ps.setBoolean(2, pat.isEstado());
            ps.setInt(3, pat.getIdPatologia());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                pat.setIdPatologia(rs.getInt(1));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al intentar actualizar los datos");
        }
    }
    public void modificarEstado(int id){
        String sql="UPDATE `patologia` SET `estado`=? WHERE `idPatologia`=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            Patologia pat = this.buscarPatologia(id);
            ps.setBoolean(1, !pat.isEstado());
            ps.setInt(2, id);
            ps.executeUpdate();
            ps.close();   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al modificar el estado de patologia");
        }
    }
   
    public Patologia buscarPatologia(int id){
        Patologia pat = new Patologia();
        String sql="SELECT * FROM `patologia` WHERE `idPatologia`=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                pat.setNombre(rs.getString("nombre"));
                pat.setEstado(rs.getBoolean("estado"));
                pat.setIdPatologia(rs.getInt("idPatologia"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al buscar patologia ingresada");
        }
        return pat;
    }
    public List<Patologia> obtenerPatologias(){
        ArrayList<Patologia> pats=new ArrayList<>();        
        String sql="SELECT * FROM `patologia`";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Patologia pat = new Patologia();
                pat.setNombre(rs.getString("nombre"));
                pat.setEstado(rs.getBoolean("estado"));
                pat.setIdPatologia(rs.getInt("idPatologia"));
                pats.add(pat);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al intentar obtener el listado de patologias");
        }
        return pats;
    }
}
