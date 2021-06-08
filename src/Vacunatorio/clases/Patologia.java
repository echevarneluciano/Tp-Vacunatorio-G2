/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vacunatorio.clases;

import java.util.Objects;

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

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.idPatologia;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + (this.estado ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Patologia other = (Patologia) obj;
        if (this.idPatologia != other.idPatologia) {
            return false;
        }
        if (this.estado != other.estado) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    
}
