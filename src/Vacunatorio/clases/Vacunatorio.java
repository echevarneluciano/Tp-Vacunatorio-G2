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
public class Vacunatorio {
    int idVacunatorio; 
    String nombre; 
    String localidad;
    String calle; 
    int altura;

    public Vacunatorio() {
    }
    public Vacunatorio(String nombre, String localidad, String calle, int altura) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.calle = calle;
        this.altura = altura;
    }
    public Vacunatorio(int idVacunatorio, String nombre, String localidad, String calle, int altura) {
        this.idVacunatorio = idVacunatorio;
        this.nombre = nombre;
        this.localidad = localidad;
        this.calle = calle;
        this.altura = altura;
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

}
