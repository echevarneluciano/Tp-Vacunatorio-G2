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
public class Registro {
    
    
    int idRegistro;
    Vacuna vacuna;
    Cita cita;
    LocalDate fechaAp;

    public Registro() {
    }
    public Registro(Vacuna vacuna, Cita cita, LocalDate fechaAp) {
        this.vacuna = vacuna;
        this.cita = cita;
        this.fechaAp = fechaAp;
    }
    public Registro(int idRegistro, Vacuna vacuna, Cita cita, LocalDate fechaAp) {
        this.idRegistro = idRegistro;
        this.vacuna = vacuna;
        this.cita = cita;
        this.fechaAp = fechaAp;
    }

    public int getIdRegistro() {
        return idRegistro;
    }
    public Vacuna getVacuna() {
        return vacuna;
    }
    public Cita getCita() {
        return cita;
    }
    public LocalDate getFechaAp() {
        return fechaAp;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }
    public void setVacuna(Vacuna vacuna) {
        this.vacuna = vacuna;
    }
    public void setCita(Cita cita) {
        this.cita = cita;
    }
    public void setFechaAp(LocalDate fechaAp) {
        this.fechaAp = fechaAp;
    }

}
