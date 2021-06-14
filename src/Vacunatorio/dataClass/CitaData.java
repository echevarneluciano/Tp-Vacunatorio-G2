/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vacunatorio.dataClass;


import java.sql.Connection;
import java.sql.Date;
import java.sql.Timestamp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Vacunatorio.clases.*;
import Vacunatorio.dataClass.*;
import java.sql.Types;
/**
 *
 * @author Wi7o
 */
public class CitaData {
    private Connection con;
    
    PersonaData perData = null;
    VacunatorioData vacuData = null;
    VacunaData vacData = null;
    
    public CitaData(Conexion conn){
        try {
            this.con =  conn.getConexion();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion en CitaData.");
        }
    }
    
    public void Conection (){
            try {
                Conexion cont = new Conexion();
                perData = new PersonaData(cont);
                vacuData = new VacunatorioData(cont);
                vacData = new VacunaData(cont);
            } catch (ClassNotFoundException ex) {
                 JOptionPane.showMessageDialog(null,"Error de conexion en el servidor");
            }
        }
    
    public void ingresarCita (Cita ct){
        String sql="INSERT INTO `citas`(`idPersona`, `idVacunatorio`, `fechYhorTurno`, `motivo`, `estado`, `idVacuna`) VALUES (?,?,?,?,?,?)";       
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ct.getPersona().getIdPersona());
            ps.setInt(2, ct.getVacunatorio().getIdVacunatorio());
            ps.setTimestamp(3, Timestamp.valueOf(ct.getFechayHora()));
            ps.setString(4, ct.getMotivo());
            ps.setBoolean(5, ct.isEstado());
            ps.setInt(6, ct.getVacuna().getIdVacuna());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
            ct.setId(rs.getInt(1));
            JOptionPane.showMessageDialog(null,"Ingresado con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion en metodo ingresarCita." + ex);
        }
    }
    
    public void ingresarCitaConLDT (Cita ct){
        String sql="INSERT INTO `citas`(`idPersona`, `idVacunatorio`, `fechYhorTurno`, `motivo`, `estado`, `idVacuna`) VALUES (?,?,?,?,?,?)";       
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ct.getPersona().getIdPersona());
            ps.setInt(2, ct.getVacunatorio().getIdVacunatorio());
            ps.setTimestamp(3, ct.getDate());
            ps.setString(4, ct.getMotivo());
            ps.setBoolean(5, ct.isEstado());
//            ps.setInt(6, ct.getVacuna().getIdVacuna());
            ps.setNull(6, Types.INTEGER);
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
            ct.setId(rs.getInt(1));
            JOptionPane.showMessageDialog(null,"Ingresado con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion en metodo ingresarCita." + ex);
        }
    }
    public void actualizarCitaConLTD(Cita ct){
        String sql="UPDATE citas SET idPersona=?,idVacunatorio=?,fechYhorTurno=?,motivo=?,estado=?,idVacuna=? where idCita=?";       
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ct.getPersona().getIdPersona());
            ps.setInt(2, ct.getVacunatorio().getIdVacunatorio());
            ps.setTimestamp(3, ct.getDate());
            ps.setString(4, ct.getMotivo());
            ps.setBoolean(5, ct.isEstado());
            ps.setNull(6, Types.INTEGER);
            ps.setInt(7, ct.getId());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                ct.setId(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Reprogramada con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al intentar actualizar los datos");
        }
    }
    
    public void actualizarCita(Cita ct){
        String sql="UPDATE citas SET idPersona=?,idVacunatorio=?,fechYhorTurno=?,motivo=?,estado=?,idVacuna=? where idCita=?";       
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ct.getPersona().getIdPersona());
            ps.setInt(2, ct.getVacunatorio().getIdVacunatorio());
            ps.setTimestamp(3, Timestamp.valueOf(ct.getFechayHora()));
            ps.setString(4, ct.getMotivo());
            ps.setBoolean(5, ct.isEstado());
            ps.setInt(6, ct.getVacuna().getIdVacuna());
            ps.setInt(7, ct.getId());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                ct.setId(rs.getInt(1));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al intentar actualizar los datos");
        }
    }
    
    public void modificarEstado(int id){
        String sql="UPDATE `citas` SET `estado`=? WHERE `idCita`=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            Cita ct = this.buscarCita(id);
            ps.setBoolean(1, !ct.isEstado());
            ps.setInt(2, id);
            ps.executeUpdate();
            ps.close();   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al modificar el estado de la cita");
        }
    }
    
    public Cita buscarCita(int id){
        Cita ct = new Cita();
        Conection();
        String sql="SELECT * FROM `citas` WHERE `idCita`=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                ct.setPersona(perData.buscarPersonaId(rs.getInt("idPersona")));
                ct.setVacunatorio(vacuData.buscarVacunatorio(rs.getInt("idVacunatorio")));
                ct.setVacuna(vacData.buscarVacunaID(rs.getInt("idVacuna")));
                ct.setMotivo(rs.getString("motivo"));
                ct.setFechayHora(rs.getTimestamp("fechYhorTurno").toLocalDateTime());
                ct.setEstado(rs.getBoolean("estado"));
                ct.setId(rs.getInt("idCita"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al buscar la cita ingresada");
        }
        
        return ct;
    }
    
    public List<Cita> obtenerCitas(){
        ArrayList<Cita> cts=new ArrayList<>();  
        Conection();
        String sql="SELECT * FROM `citas`";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Cita ct = new Cita();
                ct.setPersona(perData.buscarPersonaId(rs.getInt("idPersona")));
                ct.setVacunatorio(vacuData.buscarVacunatorio(rs.getInt("idVacunatorio")));
                ct.setVacuna(vacData.buscarVacunaID(rs.getInt("idVacuna")));
                ct.setMotivo(rs.getString("motivo"));
                ct.setFechayHora(rs.getTimestamp("fechYhorTurno").toLocalDateTime());
                ct.setEstado(rs.getBoolean("estado"));
                ct.setId(rs.getInt("idCita"));
                cts.add(ct);System.out.println(ct.getVacuna().getIdVacuna());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al intentar obtener el listado de citas");
        }
        return cts;
    }
    
    public List<Cita> obtenerCitasPorVacunatorioVacunaPersona(int id, int aply){
        ArrayList<Cita> cts=new ArrayList<>(); 
        Conection();
        String sql;
        if (aply == 1)
            sql="SELECT * FROM `citas` where `idVacuna`=?";
        else 
            if (aply == 2)
                sql="SELECT * FROM `citas` where `idVacunatorio`=?";
            else
                sql="SELECT * FROM `citas` where `idPersona`=?";    
        
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Cita ct = new Cita();
                ct.setPersona(perData.buscarPersonaId(rs.getInt("idPersona")));
                ct.setVacunatorio(vacuData.buscarVacunatorio(rs.getInt("idVacunatorio")));
                ct.setVacuna(vacData.buscarVacunaID(rs.getInt("idVacuna")));
                ct.setMotivo(rs.getString("motivo"));
                ct.setFechayHora(rs.getTimestamp("fechYhorTurno").toLocalDateTime());
                ct.setEstado(rs.getBoolean("estado"));
                ct.setId(rs.getInt("idCita"));
                cts.add(ct);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al intentar obtener el listado de Citas");
        }
        
        return cts;
    }
    public List<Cita> obtenerCitasPersonasConDosDosisAplicadas(){
        ArrayList<Cita> cts=new ArrayList<>();  
        Conection();
        String sql="select * from citas group by citas.idPersona having count(citas.idVacuna)>1";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Cita ct = new Cita();
                ct.setPersona(perData.buscarPersonaId(rs.getInt("idPersona")));
                ct.setVacunatorio(vacuData.buscarVacunatorio(rs.getInt("idVacunatorio")));
                ct.setVacuna(vacData.buscarVacunaID(rs.getInt("idVacuna")));
                ct.setMotivo(rs.getString("motivo"));
                ct.setFechayHora(rs.getTimestamp("fechYhorTurno").toLocalDateTime());
                ct.setEstado(rs.getBoolean("estado"));
                ct.setId(rs.getInt("idCita"));
                cts.add(ct);System.out.println(ct.getVacuna().getIdVacuna());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al intentar obtener el listado de citas");
        }
        return cts;
    }
    public List<Cita> obtenerCitasPersonasConUnaDosisAplicadas(){
        ArrayList<Cita> cts=new ArrayList<>();  
        Conection();
        String sql="select * from citas where idPersona in (select citas.idPersona from citas group by citas.idPersona having count(citas.idVacuna)>0) and idVacuna is null";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Cita ct = new Cita();
                ct.setPersona(perData.buscarPersonaId(rs.getInt("idPersona")));
                ct.setVacunatorio(vacuData.buscarVacunatorio(rs.getInt("idVacunatorio")));
                ct.setVacuna(vacData.buscarVacunaID(rs.getInt("idVacuna")));
                ct.setMotivo(rs.getString("motivo"));
                ct.setFechayHora(rs.getTimestamp("fechYhorTurno").toLocalDateTime());
                ct.setEstado(rs.getBoolean("estado"));
                ct.setId(rs.getInt("idCita"));
                cts.add(ct);System.out.println(ct.getVacuna().getIdVacuna());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al intentar obtener el listado de citas");
        }
        return cts;
    }
    public List<Cita> filtroDosDosisFaltantes(){
        ArrayList<Cita> cts=new ArrayList<>();  
        Conection();
        String sql="select * from citas where idPersona in (select citas.idPersona from citas group by citas.idPersona having count(citas.idVacuna)=0) and idVacuna is null";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Cita ct = new Cita();
                ct.setPersona(perData.buscarPersonaId(rs.getInt("idPersona")));
                ct.setVacunatorio(vacuData.buscarVacunatorio(rs.getInt("idVacunatorio")));
                ct.setVacuna(vacData.buscarVacunaID(rs.getInt("idVacuna")));
                ct.setMotivo(rs.getString("motivo"));
                ct.setFechayHora(rs.getTimestamp("fechYhorTurno").toLocalDateTime());
                ct.setEstado(rs.getBoolean("estado"));
                ct.setId(rs.getInt("idCita"));
                cts.add(ct);System.out.println(ct.getVacuna().getIdVacuna());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al intentar obtener el listado de citas");
        }
        return cts;
    }

    //Actualizacion Guido
    public List<Cita> obtenerAplicadasxCentro(int idCentro){
       ArrayList<Cita> listaAplicadas = new ArrayList<>();
       Conection();
        String sql="SELECT * FROM `citas` WHERE `estado` = 1 and `fechYhorTurno` < now() and `idVacunatorio`=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idCentro);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Cita ct = new Cita();
                ct.setPersona(perData.buscarPersonaId(rs.getInt("idPersona")));
                ct.setVacunatorio(vacuData.buscarVacunatorio(rs.getInt("idVacunatorio")));
                ct.setVacuna(vacData.buscarVacunaID(rs.getInt("idVacuna")));
                ct.setMotivo(rs.getString("motivo"));
                ct.setFechayHora(rs.getTimestamp("fechYhorTurno").toLocalDateTime());
                ct.setEstado(rs.getBoolean("estado"));
                ct.setId(rs.getInt("idCita"));
                if(ct.getVacunatorio().getIdVacunatorio()==idCentro)
                    listaAplicadas.add(ct);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al intentar obtener el listado de vacunas aplicadas");
        }
        return listaAplicadas; 
    }
    public int cuentaVacunadosPorMes(int mes){
        int res=0;
        Conection();
        String sql="select count(idPersona) as total from citas where month(citas.fechYhorTurno) = ?  and citas.idVacuna is not null";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mes);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                res=rs.getInt("total");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al buscar la cita ingresada");
        }
        
        return res;
    }
    public void sumar14DiasAPendientes(){
        String sql="UPDATE citas SET fechYhorTurno =  date_add(fechYhorTurno,INTERVAL 14 DAY) WHERE idCita in (SELECT idCita  FROM `citas` WHERE idVacuna is null and estado=1 and fechYhorTurno>=now())";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.executeUpdate();
            ps.close();   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al modificar el estado de la cita");
        }
    }
}
