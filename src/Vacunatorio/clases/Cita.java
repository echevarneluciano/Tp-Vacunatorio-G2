/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vacunatorio.clases;

import java.time.LocalDate;

/**
 *
 * @author Guido Caballero
 */
public class Cita {
    int id; 
    Persona persona; 
    Vacunatorio vacunatorio; 
    LocalDate fechayHora;
    String motivo;
    boolean estado;

    public Cita(int id, Persona persona, Vacunatorio vacunatorio, LocalDate fechayHora, String motivo, boolean estado) {
        this.id = id;
        this.persona = persona;
        this.vacunatorio = vacunatorio;
        this.fechayHora = fechayHora;
        this.motivo = motivo;
        this.estado = estado;
    }
    public Cita(Persona persona, Vacunatorio vacunatorio, LocalDate fechayHora, String motivo, boolean estado) {
        this.id = -1;
        this.persona = persona;
        this.vacunatorio = vacunatorio;
        this.fechayHora = fechayHora;
        this.motivo = motivo;
        this.estado = estado;
    }
    public Cita() {
    }

    public int getId() {
        return id;
    }
    public Persona getPersona() {
        return persona;
    }
    public Vacunatorio getVacunatorio() {
        return vacunatorio;
    }
    public LocalDate getFechayHora() {
        return fechayHora;
    }
    public String getMotivo() {
        return motivo;
    }
    public boolean isEstado() {
        return estado;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public void setVacunatorio(Vacunatorio vacunatorio) {
        this.vacunatorio = vacunatorio;
    }
    public void setFechayHora(LocalDate fechayHora) {
        this.fechayHora = fechayHora;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    

    
    
}
