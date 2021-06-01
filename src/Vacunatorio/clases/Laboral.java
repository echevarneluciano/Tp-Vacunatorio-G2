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
public class Laboral {
    
    private int idTrabajo;
    private String nombre;
    private boolean estado;

    public Laboral(int idTrabajo, String nombre,boolean estado) {
        this.idTrabajo = idTrabajo;
        this.nombre = nombre;
        this.estado=estado;
    }
    public Laboral(String nombre,boolean estado) {
        this.nombre = nombre;
        this.estado=estado;
    }
    public Laboral(){}

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdTrabajo() {
        return idTrabajo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setIdTrabajo(int idTrabajo) {
        this.idTrabajo = idTrabajo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    

}
