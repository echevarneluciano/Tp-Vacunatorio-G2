/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vacunatorio.clases;

/**
 *
 * @author Guido Caballero
 */
public class Laboratorio {
    
    int idLaboratorio;
    String nombre;
    String paisOrigen;
    String direccion;

    public Laboratorio() {
    }
    public Laboratorio(String nombre, String paisOrigen, String direccion) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.direccion = direccion;
    }
    public Laboratorio(int idLaboratorio, String nombre, String paisOrigen, String direccion) {
        this.idLaboratorio = idLaboratorio;
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.direccion = direccion;
    }

    public int getIdLaboratorio() {
        return idLaboratorio;
    }
    public String getNombre() {
        return nombre;
    }
    public String getPaisOrigen() {
        return paisOrigen;
    }
    public String getDireccion() {
        return direccion;
    }

    public void setIdLaboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
