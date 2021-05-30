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
public class Vacuna {
    int idVacuna;
    String nombre;
    Laboratorio laboratorio;
    int nroSerie;
    boolean estado;

    public Vacuna() {
    }
    public Vacuna(String nombre, Laboratorio laboratorio, int nroSerie, boolean estado) {
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.nroSerie = nroSerie;
        this.estado = estado;
    }
    public Vacuna(int idVacuna, String nombre, Laboratorio laboratorio, int nroSerie, boolean estado) {
        this.idVacuna = idVacuna;
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.nroSerie = nroSerie;
        this.estado = estado;
    }

    public int getIdVacuna() {
        return idVacuna;
    }
    public String getNombre() {
        return nombre;
    }
    public Laboratorio getLaboratorio() {
        return laboratorio;
    }
    public int getNroSerie() {
        return nroSerie;
    }
    public boolean isEstado() {
        return estado;
    }

    public void setIdVacuna(int idVacuna) {
        this.idVacuna = idVacuna;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }
    public void setNroSerie(int nroSerie) {
        this.nroSerie = nroSerie;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
