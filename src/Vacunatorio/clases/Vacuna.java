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
    private int idVacuna;
    private Laboratorio laboratorio;
    private int nroSerie;
    private boolean estado;
    
    public Vacuna() {
    }
    public Vacuna(Laboratorio laboratorio, int nroSerie, boolean estado) {
        this.laboratorio = laboratorio;
        this.nroSerie = nroSerie;
        this.estado = estado;
    }
    public Vacuna(int idVacuna, Laboratorio laboratorio, int nroSerie, boolean estado) {
        this.idVacuna = idVacuna;
        this.laboratorio = laboratorio;
        this.nroSerie = nroSerie;
        this.estado = estado;
    }

    public int getIdVacuna() {
        return idVacuna;
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
