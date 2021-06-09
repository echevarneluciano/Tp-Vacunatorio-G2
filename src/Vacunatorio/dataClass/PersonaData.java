/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vacunatorio.dataClass;

import Vacunatorio.clases.Patologia;
import Vacunatorio.clases.Persona;
import java.sql.Connection;
import java.sql.Date;
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
public class PersonaData {
    private Connection con;
    
    public PersonaData(Conexion conn){
        try {
            this.con =  conn.getConexion();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion en PersonaData.");
        }
    }
    public void ingresarPersona (Persona pe){
        String sql="INSERT INTO `persona`(`dni`, `nombre`, `apellido`, `fechaNac`, `localidad`, `direccion`, `email`, `telefono`, `idPatologia`, `trabajo`, `estado`, `peso`, `altura`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";       
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pe.getDni());
            ps.setString(2, pe.getNombre());
            ps.setString(3, pe.getApellido());
            ps.setDate(4, Date.valueOf(pe.getFechaNac()));
            ps.setString(5, pe.getLocalidad());
            ps.setString(6, pe.getDireccion());
            ps.setString(7, pe.getEmail());
            ps.setInt(8, pe.getTelefono());
            ps.setInt(9, pe.getPatologias().getIdPatologia());
            ps.setString(10, pe.getTrabajo());
            ps.setBoolean(11, pe.isEstado());
            ps.setFloat(12, pe.getPeso());
            ps.setFloat(13, pe.getAltura());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
            pe.setIdPersona(rs.getInt(1));
            JOptionPane.showMessageDialog(null,"Ingresado con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Verificar dni, el dni ya se encuentra en el sistema");
        }
    }
    public void modificarPersona(Persona pe){
        String sql="UPDATE `persona` SET `dni`=?,`nombre`=?,`apellido`=?,`fechaNac`=?,`localidad`=?,`direccion`=?,`email`=?,`telefono`=?,`idPatologia`=?,`trabajo`=?,`estado`=?,`peso`=?,`altura`=? WHERE persona.dni=?";
    try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pe.getDni());
            ps.setString(2, pe.getNombre());
            ps.setString(3, pe.getApellido());
            ps.setDate(4, Date.valueOf(pe.getFechaNac()));
            ps.setString(5, pe.getLocalidad());
            ps.setString(6, pe.getDireccion());
            ps.setString(7, pe.getEmail());
            ps.setInt(8, pe.getTelefono());
            ps.setInt(9, pe.getPatologias().getIdPatologia());
            ps.setString(10, pe.getTrabajo());
            ps.setBoolean(11, pe.isEstado());
            ps.setFloat(12, pe.getPeso());
            ps.setFloat(13, pe.getAltura());
            ps.setInt(14, pe.getDni());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
            pe.setIdPersona(rs.getInt(1));
            JOptionPane.showMessageDialog(null,"Modificado con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion en metodo ingresarPersona.");
        }
    }
    public Persona buscarPersonaDni(int dni){
        Persona pe=new Persona();
        String sql="SELECT * FROM `persona` WHERE persona.dni=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dni);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                pe.setAltura(rs.getFloat("altura"));
                pe.setApellido(rs.getString("apellido"));
                pe.setDireccion(rs.getString("direccion"));
                pe.setDni(rs.getInt("dni"));
                pe.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                pe.setEmail(rs.getString("email"));
                pe.setEstado(rs.getBoolean("estado"));
                pe.setIdPersona(rs.getInt("idPersona"));
                pe.setLocalidad(rs.getString("localidad"));
                pe.setNombre(rs.getString("nombre"));
                pe.setPatologias(this.BuscarPatologiaPorDni(rs.getInt("dni")));
                pe.setPeso(rs.getFloat("peso"));
                pe.setTelefono(rs.getInt("telefono"));
                pe.setTrabajo(rs.getString("trabajo"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion.");
        }
        return pe;
    }
    
    public Persona buscarPersonaId (int id){
        Persona pe=new Persona();
        String sql="SELECT * FROM `persona` WHERE persona.idPersona=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                pe.setAltura(rs.getFloat("altura"));
                pe.setApellido(rs.getString("apellido"));
                pe.setDireccion(rs.getString("direccion"));
                pe.setDni(rs.getInt("dni"));
                pe.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                pe.setEmail(rs.getString("email"));
                pe.setEstado(rs.getBoolean("estado"));
                pe.setIdPersona(rs.getInt("idPersona"));
                pe.setLocalidad(rs.getString("localidad"));
                pe.setNombre(rs.getString("nombre"));
                pe.setPatologias(this.BuscarPatologiaPorDni(rs.getInt("dni")));
                pe.setPeso(rs.getFloat("peso"));
                pe.setTelefono(rs.getInt("telefono"));
                pe.setTrabajo(rs.getString("trabajo"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion.");
        }
        return pe;
    }
    
    public List<Persona> obtenerPersonas(){
        Persona pe;
        ArrayList<Persona> personas=new ArrayList<>();        
        String sql="SELECT * FROM `persona`";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                pe = new Persona();
                pe.setAltura(rs.getFloat("altura"));
                pe.setApellido(rs.getString("apellido"));
                pe.setDireccion(rs.getString("direccion"));
                pe.setDni(rs.getInt("dni"));
                pe.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                pe.setEmail(rs.getString("email"));
                pe.setEstado(rs.getBoolean("estado"));
                pe.setIdPersona(rs.getInt("idPersona"));
                pe.setLocalidad(rs.getString("localidad"));
                pe.setNombre(rs.getString("nombre"));
                pe.setPatologias(this.BuscarPatologiaPorDni(rs.getInt("dni")));
                pe.setPeso(rs.getFloat("peso"));
                pe.setTelefono(rs.getInt("telefono"));
                pe.setTrabajo(rs.getString("trabajo"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion.");
        }
        return personas;
    }
    public Patologia BuscarPatologia(int id){
        Patologia pato=new Patologia();
        String sql = "SELECT l.* FROM patologia AS l, persona AS per WHERE l.idPatologia=per.idPatologia AND per.idPersona=?";
        try{
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                pato.setEstado(rs.getBoolean("estado"));
                pato.setNombre(rs.getString("Nombre"));
                pato.setIdPatologia(rs.getInt("idPatologia"));
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error de conexion al buscar laboratoratorios desde el registro de vacuna");
        }
    return pato;
    }
    public Patologia BuscarPatologiaPorDni(int dni){
        Patologia pato=new Patologia();
        String sql = "SELECT * FROM patologia AS pa, persona AS per WHERE pa.idPatologia=per.idPatologia AND per.dni=?";
        try{
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                pato.setEstado(rs.getBoolean("estado"));
                pato.setNombre(rs.getString("Nombre"));
                pato.setIdPatologia(rs.getInt("idPatologia"));
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error de conexion al buscar laboratoratorios desde el registro de vacuna");
        }
    return pato;
    }
}
