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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luciano.echevarne
 */
public class vistaProgramarCita extends javax.swing.JInternalFrame {
    
    private PersonaData pd;
    private VacunatorioData vtod;
    private CitaData cd;
    private DefaultTableModel dtm;
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
        jHora.setValue(7);
        this.llenarJlist();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jInscriptos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);

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

        jComboMotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nueva dosis", "Reprogramar" }));
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

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Apellido", "Estado cita"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable.setEnabled(false);
        jScrollPane2.setViewportView(jTable);

        jLabel8.setText("Filtros:");

        jLabel9.setText("Citar:");

        jInscriptos.setText("Inscriptos");
        jInscriptos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInscriptosActionPerformed(evt);
            }
        });

        jButton1.setText("Con una dosis");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("*personas con una dosis");

        jLabel11.setText("aplicada, pendientes a ");

        jLabel13.setText("citar la segunda");

        jLabel14.setText("*total de inscriptos");

        jLabel15.setText("a vacunar. sin ");

        jLabel16.setText("ninguna dosis o");

        jLabel17.setText("con solo una");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17))
                                    .addComponent(jInscriptos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboVacunatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jHora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLimpiar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jGuardar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jInscriptos)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboVacunatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jGuardar)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboVacunatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboVacunatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboVacunatorioActionPerformed
     
    public void llenarJlist(){
        dtm = (DefaultTableModel) jTable.getModel();
        dtm.setRowCount(0); 
        for (Persona p : pd.obtenerPersonas()){
            if(p.isEstado()){
                    String []row = new String[4];
                    row[0] = Integer.toString(p.getDni());
                    row[1] = p.getNombre();
                    row[2]= p.getApellido();
//                    if(c.getVacuna().getIdVacuna()==0){row[3] ="Por aplicar";}else row[3] = "Aplicada";
                    dtm.addRow(row);
                    jTable.setModel(dtm); 
        }}
    }
    public void filtrarLosQueFaltaUnaDosis(){
        dtm = (DefaultTableModel) jTable.getModel();
        dtm.setRowCount(0); 
        for (Persona p : pd.obtenerPersonasInscriptasSinCitas()){                
                    String []row = new String[4];
                    row[0] = Integer.toString(p.getDni());
                    row[1] = p.getNombre();
                    row[2]= p.getApellido();
//                    if(c.getVacuna().getIdVacuna()==0){row[3] ="Por aplicar";}else row[3] = "Aplicada";
                    dtm.addRow(row);
                    jTable.setModel(dtm); 
        }
    }
    
    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
    jComboPersona.setSelectedIndex(-1);
    jComboVacunatorio.setSelectedIndex(-1);
    jDate.setDate(null);
    jHora.setValue(7);
    jMinuto.setValue(0);
    jComboMotivo.setSelectedIndex(-1);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLimpiarActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
    int hora=jHora.getValue()-3;
    int minuto=jMinuto.getValue();
    Date fecha=jDate.getDate();
    Date factual=new Date();
    System.out.println(fecha);
    if(fecha==null){JOptionPane.showMessageDialog(this,"Seleccionar fecha posterior a la actual");this.jLimpiarActionPerformed(evt);}else{
    if(fecha.before(factual)){JOptionPane.showMessageDialog(this,"Seleccionar fecha posterior a la actual");this.jLimpiarActionPerformed(evt);}}
    boolean encuentra=false;
    boolean repro=false;
    int reproId=0;
    String motivo=(String)jComboMotivo.getSelectedItem();
    Persona pe=(Persona)jComboPersona.getSelectedItem();
    Vacunatorio va=(Vacunatorio)jComboVacunatorio.getSelectedItem();
    if(pe!=null&&motivo!=null&&va!=null&&fecha!=null){
    fecha.setHours(hora);fecha.setMinutes(minuto);System.out.println(fecha);
    Timestamp timestamp = new Timestamp(fecha.getTime());
    Iterator <Cita> it2=cd.obtenerCitas().iterator();
        while(it2.hasNext()){
            Cita c=it2.next();
            if(c.getPersona().getDni()==pe.getDni()&&c.isEstado()&&c.getVacuna().getNroSerie()==0){encuentra=true;}
            if(encuentra&&motivo=="Reprogramar"){repro=true;reproId=c.getId();}
        }
if(!encuentra){Cita ci=new Cita (pe,va,"Nueva dosis",timestamp, true,null);cd.ingresarCitaConLDT(ci);this.jLimpiarActionPerformed(evt);JOptionPane.showMessageDialog(this,"(Guardada como nueva dosis)");}
if(repro){Cita ci=new Cita (reproId,pe,va,"Reprogramada",timestamp, true,null);cd.actualizarCitaConLTD(ci);this.jLimpiarActionPerformed(evt);JOptionPane.showMessageDialog(null,"Reprogramada con exito");}
if(encuentra&&!repro) {JOptionPane.showMessageDialog(this,"La persona ya tiene una cita activa en este u otro vacunatorio.");this.jLimpiarActionPerformed(evt);}
    }else {JOptionPane.showMessageDialog(this,"Complete todos los campos");this.jLimpiarActionPerformed(evt);}
 
//         TODO add your handling code here:
    }//GEN-LAST:event_jGuardarActionPerformed

    private void jInscriptosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInscriptosActionPerformed
    this.llenarJlist();
        // TODO add your handling code here:
    }//GEN-LAST:event_jInscriptosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.filtrarLosQueFaltaUnaDosis();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboMotivo;
    private javax.swing.JComboBox<Persona> jComboPersona;
    private javax.swing.JComboBox<Vacunatorio> jComboVacunatorio;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JButton jGuardar;
    private com.toedter.components.JSpinField jHora;
    private javax.swing.JButton jInscriptos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jLimpiar;
    private com.toedter.components.JSpinField jMinuto;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
