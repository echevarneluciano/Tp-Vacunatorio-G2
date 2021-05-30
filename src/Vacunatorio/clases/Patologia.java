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
public class Patologia {
    
    int idPatologia;
    String nombre;

    public Patologia(int idPatologia, String nombre) {
        this.idPatologia = idPatologia;
        this.nombre = nombre;
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

}
