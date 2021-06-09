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
public class Laboratorio {
    
    private int idLaboratorio;
    private String nombre;
    private String paisOrigen;
    private String direccion;
    private boolean estado;

    public Laboratorio() {
    }
    public Laboratorio(String nombre, String paisOrigen, String direccion,boolean estado) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.direccion = direccion;
        this.estado=estado;
    }
    public Laboratorio(int idLaboratorio, String nombre, String paisOrigen, String direccion,boolean estado) {
        this.idLaboratorio = idLaboratorio;
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.direccion = direccion;
        this.estado=estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
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

    @Override
    public String toString() {
        if(this.estado)
            return nombre + " - Act";
        else
           return nombre +" - No Act";
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.idLaboratorio;
        hash = 97 * hash + Objects.hashCode(this.nombre);
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
        final Laboratorio other = (Laboratorio) obj;
        if (this.idLaboratorio != other.idLaboratorio) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
}
