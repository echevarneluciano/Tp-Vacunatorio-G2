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
public class Patologia {
    
    private int idPatologia;
    private String nombre;
    private boolean estado;

    public Patologia(int idPatologia, String nombre,boolean estado) {
        this.idPatologia = idPatologia;
        this.nombre = nombre;
        this.estado=estado;
    }
    public Patologia(String nombre,boolean estado) {
        this.estado=estado;
        this.nombre = nombre;
    }
    public Patologia(){
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdPatologia() {
        return idPatologia;
    }
    public String getNombre() {
        return nombre;
    }

    public void setIdPatologia(int idPatologia) {
        this.idPatologia = idPatologia;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
