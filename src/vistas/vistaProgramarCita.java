/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Vacunatorio.clases.Cita;
import Vacunatorio.clases.Persona;
import Vacunatorio.clases.Vacuna;
import Vacunatorio.clases.Vacunatorio;
import Vacunatorio.dataClass.CitaData;
import Vacunatorio.dataClass.PersonaData;
import Vacunatorio.dataClass.VacunatorioData;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author luciano.echevarne
 */
public class vistaProgramarCita extends javax.swing.JInternalFrame {
    
    private PersonaData pd;
    private VacunatorioData vtod;
    private CitaData cd;
    /**
     * Creates new form vistaProgramarCita
     */
    public vistaProgramarCita(PersonaData pd,VacunatorioData vtod,CitaData cd) {
        initComponents();
        this.cd=cd;
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
        jDate = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jHora = new com.toedter.components.JSpinField();
        jLabel5 = new javax.swing.JLabel();
        jMinuto = new com.toedter.components.JSpinField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboMotivo = new javax.swing.JComboBox<>();
        jGuardar = new javax.swing.JButton();
        jLimpiar = new javax.swing.JButton();

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

        jLabel4.setText("Elegir dia:");

        jHora.setMaximum(20);
        jHora.setMinimum(7);

        jLabel5.setText("Hora:");

        jMinuto.setMaximum(59);
        jMinuto.setMinimum(0);

        jLabel6.setText("Minuto:");

        jLabel7.setText("Motivo:");

        jComboMotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1ra dosis", "2da dosis" }));
        jComboMotivo.setSelectedIndex(-1);
        jComboMotivo.setToolTipText("");

        jGuardar.setText("Guardar");
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });

        jLimpiar.setText("Limpiar");
        jLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLimpiar)
                        .addGap(32, 32, 32)
                        .addComponent(jGuardar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jComboVacunatorio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(jHora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jComboMotivo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboVacunatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jLabel6))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGuardar)
                    .addComponent(jLimpiar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboVacunatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboVacunatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboVacunatorioActionPerformed

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
    jComboPersona.setSelectedIndex(-1);
    jComboVacunatorio.setSelectedIndex(-1);
    jDate.setDate(null);
    jHora.setValue(0);
    jMinuto.setValue(0);
    jComboMotivo.setSelectedIndex(-1);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLimpiarActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
    int hora=jHora.getValue()-3;
    int minuto=jMinuto.getValue();
    Date fecha=jDate.getDate();
    Date factual=new Date();
    System.out.println(factual);
    if(fecha==null){JOptionPane.showMessageDialog(this,"Seleccionar fecha posterior a la actual");this.jLimpiarActionPerformed(evt);}else{
    if(fecha.before(factual)){JOptionPane.showMessageDialog(this,"Seleccionar fecha posterior a la actual");this.jLimpiarActionPerformed(evt);}}
    boolean encuentra=false;
    String motivo=(String)jComboMotivo.getSelectedItem();
    Persona pe=(Persona)jComboPersona.getSelectedItem();
    Vacunatorio va=(Vacunatorio)jComboVacunatorio.getSelectedItem();
    if(pe!=null&&motivo!=null&&va!=null&&fecha!=null){
    fecha.setHours(hora);fecha.setMinutes(minuto);System.out.println(fecha);
    Timestamp timestamp = new Timestamp(fecha.getTime());
    Cita ci=new Cita (pe,va,motivo,timestamp, true,null);
    Iterator <Cita> it2=cd.obtenerCitas().iterator();
        while(it2.hasNext()){
            Cita c=it2.next();
            if(c.getPersona().getDni()==pe.getDni()&&c.getMotivo().matches(motivo)&&c.isEstado()){encuentra=true;}
        }
//    System.out.println(timestamp);
if(encuentra){JOptionPane.showMessageDialog(this,"La persona ya tiene una cita activa en este u otro vacunatorio.");this.jLimpiarActionPerformed(evt);}
else {cd.ingresarCitaConLDT(ci);this.jLimpiarActionPerformed(evt);}
    }else {JOptionPane.showMessageDialog(this,"Complete todos los campos");this.jLimpiarActionPerformed(evt);}
    
//         TODO add your handling code here:
    }//GEN-LAST:event_jGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboMotivo;
    private javax.swing.JComboBox<Persona> jComboPersona;
    private javax.swing.JComboBox<Vacunatorio> jComboVacunatorio;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JButton jGuardar;
    private com.toedter.components.JSpinField jHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jLimpiar;
    private com.toedter.components.JSpinField jMinuto;
    // End of variables declaration//GEN-END:variables
}
