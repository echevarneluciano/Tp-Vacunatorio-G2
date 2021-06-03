/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Vacunatorio.clases.*;
import Vacunatorio.dataClass.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luciano.echevarne
 */
public class main {
    public static void main(String[] args) {
        LaboratorioData labData = null;
        try {
            Conexion con = new Conexion();
            labData = new LaboratorioData(con);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /* PROBANDO Laboratorio y LaboratorioData
            Laboratorio lab, lab2;
            lab = new Laboratorio ("Ruso","Rusia","Calle falsa 123",true);
            lab2 = new Laboratorio ("Sarasa","Groenlandia","Calle fria 321",true);
            labData.ingresarLaboratorio(lab);
            labData.ingresarLaboratorio(lab2);
            System.out.println("lab 1 creado desde main : "+ labData.buscarLaboratorio(lab.getIdLaboratorio()).getNombre());
            System.out.println("lab 2 creado desde main : "+ labData.buscarLaboratorio(lab2.getIdLaboratorio()).getNombre());

            System.out.println("lab extraido -> id 1 : "+ labData.buscarLaboratorio(1).getNombre());
            System.out.println("lab extraido -> id 2 : "+ labData.buscarLaboratorio(2).getNombre());
            lab2.setNombre("piripi");
            labData.actualizarLaboratorio(lab2);
            System.out.println("lab modificado id :" + lab2.getIdLaboratorio()+ " - nombre: "+ labData.buscarLaboratorio(lab2.getIdLaboratorio()).getNombre());
            List<Laboratorio> listLab = new ArrayList();
            listLab = labData.obtenerLaboratorios();
            System.out.println("A continuacion todos los laboratorios dentro de la tabla");
            for(Laboratorio lab3:listLab){
                System.out.println("lab: "+lab3.getNombre()+" dir: "+lab3.getDireccion());
            }
        */

    }
}


    
    