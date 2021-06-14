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
import Vacunatorio.dataClass.VacunaData;
import Vacunatorio.dataClass.VacunatorioData;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
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
    private VacunaData vd;
    private DefaultTableModel dtm;
    /**
     * Creates new form vistaProgramarCita
     */
    public vistaProgramarCita(PersonaData pd,VacunatorioData vtod,CitaData cd,VacunaData vd) {
        initComponents();
        this.cd=cd;
        this.pd=pd;
        this.vd=vd;
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
        cargaCombo(vtod);
        jVdisponibles.setText(Integer.toString(vd.obtenerNumeroDeVacunasDisponibles()));
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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
        jDate = new com.toedter.calendar.JDateChooser();
        jHora = new com.toedter.components.JSpinField();
        jMinuto = new com.toedter.components.JSpinField();
        jLabel18 = new javax.swing.JLabel();
        jVdisponibles = new javax.swing.JTextField();

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

        jLabel5.setText("Hora:");

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

        jHora.setMaximum(20);
        jHora.setMinimum(7);
        jHora.setValue(7);

        jMinuto.setMaximum(59);
        jMinuto.setMinimum(0);

        jLabel18.setText("Vacunas disponibles:");

        jVdisponibles.setEnabled(false);
        jVdisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVdisponiblesActionPerformed(evt);
            }
        });

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
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboPersona, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboVacunatorio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jHora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLimpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jGuardar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jVdisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel18)
                            .addComponent(jVdisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboVacunatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jGuardar)))
                            .addComponent(jLimpiar))))
                .addGap(34, 34, 34))
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
                    List<Cita> ci=cd.obtenerCitasPorVacunatorioVacunaPersona(p.getIdPersona(), 4);
                    row[0] = Integer.toString(p.getDni());
                    row[1] = p.getNombre();
                    row[2]= p.getApellido();
                    if(!ci.isEmpty()){row[3] ="Citada para aplicar";}else row[3] = "No citado";
                    dtm.addRow(row);
                    jTable.setModel(dtm); 
        }}
    }
    public void filtrarLosQueFaltaUnaDosis(){
        this.limpiaJList();
        dtm = (DefaultTableModel) jTable.getModel();
        dtm.setRowCount(0); 
        for (Persona p : pd.obtenerPersonasSinCitasConUnaDosis()){                
                    String []row = new String[4];
                    List<Cita> ci=cd.obtenerCitasPorVacunatorioVacunaPersona(p.getIdPersona(), 4);
                    row[0] = Integer.toString(p.getDni());
                    row[1] = p.getNombre();
                    row[2]= p.getApellido();
                    if(!ci.isEmpty()){row[3] ="Citada para aplicar";}else row[3] = "No citado";
                    dtm.addRow(row);
                    jTable.setModel(dtm); 
        }
    }
    public void limpiaJList(){
        DefaultTableModel modelo=(DefaultTableModel) jTable.getModel();
            int filas=jTable.getRowCount();
            for (int i = 0;filas>i; i++) {
                modelo.removeRow(0);}
    }
    
    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
    jComboPersona.setSelectedIndex(-1);
    jComboVacunatorio.setSelectedIndex(-1);
    jDate.setDate(null);
    jHora.setValue(7);
    jMinuto.setValue(0);
    jComboMotivo.setSelectedIndex(-1);
    jVdisponibles.setText(Integer.toString(vd.obtenerNumeroDeVacunasDisponibles()));
        // TODO add your handling code here:
    }//GEN-LAST:event_jLimpiarActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
    int hora=jHora.getValue();
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
    if(vd.obtenerVacunasDisponibles().isEmpty()){JOptionPane.showMessageDialog(this,"No hay dosis disponibles.El turno se posterga por dos semanas");fecha=this.sumarDiasFecha(fecha);}
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

     public Date sumarDiasFecha(Date fecha){
      Calendar calendar = Calendar.getInstance();
      calendar.setTime(fecha); 
      calendar.add(Calendar.DAY_OF_YEAR, 14);  
      return calendar.getTime(); 	
 }
    
    private void jInscriptosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInscriptosActionPerformed
    this.llenarJlist();
        // TODO add your handling code here:
    }//GEN-LAST:event_jInscriptosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.filtrarLosQueFaltaUnaDosis();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jVdisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVdisponiblesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jVdisponiblesActionPerformed

    public void cargaCombo(VacunatorioData vD){
        jComboVacunatorio.removeAllItems();
        jComboVacunatorio.addItem(null);
        Iterator<Vacunatorio> itVac = vD.obtenerVacunatorios().iterator();
        while(itVac.hasNext()){
            Vacunatorio vac=itVac.next();
            jComboVacunatorio.addItem(vac);
        }
    }

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
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JTextField jVdisponibles;
    // End of variables declaration//GEN-END:variables
}
