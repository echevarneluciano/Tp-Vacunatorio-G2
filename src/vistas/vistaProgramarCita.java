/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Vacunatorio.clases.Persona;
import Vacunatorio.clases.Vacunatorio;
import Vacunatorio.dataClass.PersonaData;
import Vacunatorio.dataClass.VacunatorioData;
import java.util.Iterator;

/**
 *
 * @author luciano.echevarne
 */
public class vistaProgramarCita extends javax.swing.JInternalFrame {
    
    private PersonaData pd;
    private VacunatorioData vtod;
    /**
     * Creates new form vistaProgramarCita
     */
    public vistaProgramarCita(PersonaData pd,VacunatorioData vtod) {
        initComponents();
        this.pd=pd;
        this.vtod=vtod;
        Iterator <Persona> it=pd.obtenerPersonas().iterator();
        System.out.println(pd.buscarPersonaDni(11).getApellido());
        jComboPersona.addItem(null);
        while(it.hasNext()){
            Persona pa=it.next();
            if(pa.isEstado()){jComboPersona.addItem(pa);}
        }
        Iterator <Vacunatorio> it2=vtod.obtenerVacunatorios().iterator();
        jComboVacunatorio.addItem(null);
        while(it2.hasNext()){
            Vacunatorio pa=it2.next();
            if(pa.isEstado()){jComboVacunatorio.addItem(pa);}
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboVacunatorio = new javax.swing.JComboBox<>();
        jComboPersona = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Programar cita");

        jComboVacunatorio.setToolTipText("");
        jComboVacunatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboVacunatorioActionPerformed(evt);
            }
        });

        jComboPersona.setToolTipText("");

        jLabel2.setText("Seleccionar persona:");

        jLabel3.setText("Seleccionar vacunatorio:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboVacunatorio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboVacunatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(198, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboVacunatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboVacunatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboVacunatorioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Persona> jComboPersona;
    private javax.swing.JComboBox<Vacunatorio> jComboVacunatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
