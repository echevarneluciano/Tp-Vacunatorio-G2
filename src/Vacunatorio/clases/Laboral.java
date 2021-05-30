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
    
    int idTrabajo;
    String nombre;

    public Laboral(int idTrabajo, String nombre) {
        this.idTrabajo = idTrabajo;
        this.nombre = nombre;
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
