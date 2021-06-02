/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vacunatorio.clases;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Guido Caballero
 */
public class Persona {
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private int dni;
    private int telefono;
    private String trabajo;
    private ArrayList<Patologia> patologias;
    private String direccion;
    private String localidad;
    private LocalDate fechaNac;
    private boolean estado;

    public Persona() {
    }
    public Persona(String nombre, String apellido, String email, int dni, int telefono, String trabajo, ArrayList<Patologia> patologias, String direccion, String localidad, LocalDate fechaNac,boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.dni = dni;
        this.telefono = telefono;
        this.trabajo = trabajo;
        this.patologias = patologias;
        this.direccion = direccion;
        this.localidad = localidad;
        this.fechaNac = fechaNac;
        this.estado=estado;
    }
    public Persona(int idPersona, String nombre, String apellido, String email, int dni, int telefono, String trabajo, ArrayList<Patologia> patologias, String direccion, String localidad, LocalDate fechaNac,boolean estado) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.dni = dni;
        this.telefono = telefono;
        this.trabajo = trabajo;
        this.patologias = patologias;
        this.direccion = direccion;
        this.localidad = localidad;
        this.fechaNac = fechaNac;
        this.estado=estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdPersona() {
        return idPersona;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getEmail() {
        return email;
    }
    public int getDni() {
        return dni;
    }
    public int getTelefono() {
        return telefono;
    }
    public String getTrabajo() {
        return trabajo;
    }
    public ArrayList<Patologia> getPatologias() {
        return patologias;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getLocalidad() {
        return localidad;
    }
    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }
    public void setPatologias(ArrayList<Patologia> patologias) {
        this.patologias = patologias;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
    
}
