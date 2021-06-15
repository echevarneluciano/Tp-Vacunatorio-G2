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
public class Vacunatorio {
    private int idVacunatorio; 
    private String nombre; 
    private String localidad;
    private String calle; 
    private int altura;
    private boolean estado;

    public Vacunatorio() {
    }
    public Vacunatorio(String nombre, String localidad, String calle, int altura,boolean estado) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.calle = calle;
        this.altura = altura;
        this.estado=estado;
    }
    public Vacunatorio(int idVacunatorio, String nombre, String localidad, String calle, int altura,boolean estado) {
        this.idVacunatorio = idVacunatorio;
        this.nombre = nombre;
        this.localidad = localidad;
        this.calle = calle;
        this.altura = altura;
        this.estado=estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setIdVacunatorio(int idVacunatorio) {
        this.idVacunatorio = idVacunatorio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int getIdVacunatorio() {
        return idVacunatorio;
    }
    public String getNombre() {
        return nombre;
    }
    public String getLocalidad() {
        return localidad;
    }
    public String getCalle() {
        return calle;
    }
    public int getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return nombre + ", " + localidad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.idVacunatorio;
        hash = 89 * hash + Objects.hashCode(this.nombre);
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
        final Vacunatorio other = (Vacunatorio) obj;
        if (this.idVacunatorio != other.idVacunatorio) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

}
