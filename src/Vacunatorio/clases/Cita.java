/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vacunatorio.clases;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

/**
 *
 * @author Guido Caballero
 */
public class Cita {
    private int id; 
    private Persona persona; 
    private Vacunatorio vacunatorio; 
    private Vacuna vacuna;
    private Instant fechayHora;
    private String motivo;
    private boolean estado;

    public Cita(int id, Persona persona, Vacunatorio vacunatorio, Instant fechayHora, String motivo, boolean estado,Vacuna vacuna) {
        this.id = id;
        this.persona = persona;
        this.vacunatorio = vacunatorio;
        this.fechayHora = fechayHora;
        this.motivo = motivo;
        this.estado = estado;
        this.vacuna=vacuna;
    }
    public Cita(Persona persona, Vacunatorio vacunatorio, Instant fechayHora, String motivo, boolean estado,Vacuna vacuna) {
        this.id = -1;
        this.persona = persona;
        this.vacunatorio = vacunatorio;
        this.fechayHora = fechayHora;
        this.motivo = motivo;
        this.estado = estado;
        this.vacuna=vacuna;
    }
    public Cita() {
    }

    public Vacuna getVacuna() {
        return vacuna;
    }

    public void setVacuna(Vacuna vacuna) {
        this.vacuna = vacuna;
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
    public Instant getFechayHora() {
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
    public void setFechayHora(Instant fechayHora) {
        this.fechayHora = fechayHora;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    

    
    
}
