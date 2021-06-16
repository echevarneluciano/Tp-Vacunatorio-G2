/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Vacunatorio.clases.*;
import Vacunatorio.dataClass.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author guido
 */
public class vistaListarCentros extends javax.swing.JInternalFrame {
    private CitaData ciData;
    private VacunatorioData vacuData;
    private DefaultTableModel dtm,dtm2;
    /**
     * Creates new form NewJInternalFrame
     */
    public vistaListarCentros(VacunaData vd, CitaData cd, VacunatorioData vD) {
        initComponents();
        this.ciData = cd;
        this.vacuData = vD;
        cargaTabVacunatorios(vD,cd);
        cargaCombo(vD);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVacunatorios = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        comboVacunatorio = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnBuscarCombo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableVacunas = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jMes = new com.toedter.components.JSpinField();
        jCampoMes = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jBuscarMes = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textLocal = new javax.swing.JTextField();
        textCalle = new javax.swing.JTextField();
        btnBuscarVacunatorio = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        textNro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel1.setText("Listado Vacunatorios");

        tableVacunatorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Localidad", "Direccion", "Dosis aplicadas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableVacunatorios);

        jLabel12.setText("*dosis aplicadas en el dia de hoy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel6.setText("Filtrar vacunas aplicadas por centro");

        jLabel7.setText("Seleccione un vacunatorio");

        btnBuscarCombo.setText("Buscar");
        btnBuscarCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarComboActionPerformed(evt);
            }
        });

        tableVacunas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vacuna Nº de serie", "DNI Receptor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableVacunas);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Contador vacunados por mes");

        jLabel10.setText("Ingresar numero de mes:");

        jMes.setMaximum(12);
        jMes.setMinimum(1);

        jCampoMes.setEditable(false);
        jCampoMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCampoMesActionPerformed(evt);
            }
        });

        jLabel11.setText("Cantidad:");

        jBuscarMes.setText("Buscar");
        jBuscarMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarMesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(jLabel7)
                            .addGap(2, 2, 2)
                            .addComponent(comboVacunatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBuscarCombo)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jMes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCampoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBuscarMes))
                            .addComponent(jLabel9))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboVacunatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btnBuscarCombo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCampoMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(jBuscarMes))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10)
                        .addComponent(jMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel2.setText("Ingrese o modifique un Vacunatorio");

        jLabel3.setText("Nombre");

        jLabel4.setText("Localidad");

        jLabel5.setText("Calle");

        textLocal.setEnabled(false);

        textCalle.setEnabled(false);

        btnBuscarVacunatorio.setText("Buscar");
        btnBuscarVacunatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVacunatorioActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        textNro.setEnabled(false);
        textNro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNroKeyTyped(evt);
            }
        });

        jLabel8.setText("Nro");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardar))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(textCalle)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8)
                                        .addGap(12, 12, 12)
                                        .addComponent(textNro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textNombre)
                                    .addComponent(textLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarVacunatorio)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnBuscarVacunatorio))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(textNro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarVacunatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVacunatorioActionPerformed
        Vacunatorio vac = this.buscaVacu();
        String n = textNombre.getText();
        if(!n.equals("")){
            if(vacuData.vacunatorioEsta(n)){
                btnModificar.setEnabled(true);
                textCalle.setText(vac.getCalle());
                textNro.setText(vac.getAltura()+"");
                textLocal.setText(vac.getLocalidad());
                JOptionPane.showMessageDialog(this,"El vacunatorio se encuentra cargado, para editar los campos precione en Modificar");
            }else{
                if(JOptionPane.showConfirmDialog(this,"El vacunatorio no coincide con ninguno en el sistema, desea agregarlo?")==0){
                    textNombre.setEnabled(false);
                    btnBuscarVacunatorio.setEnabled(false);
                    textCalle.setEnabled(true);
                    textNro.setEnabled(true);
                    textLocal.setEnabled(true);
                    btnGuardar.setVisible(true);
                    btnGuardar.setEnabled(true);
                }else
                    this.btnLimpiarActionPerformed(evt);
            }
        }else
            JOptionPane.showMessageDialog(this,"El campo nombre no puede estar vacío");
    }//GEN-LAST:event_btnBuscarVacunatorioActionPerformed
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        btnGuardar.setEnabled(false);
        btnModificar.setEnabled(false);
        textCalle.setEnabled(false);
        textNro.setEnabled(false);
        textLocal.setEnabled(false);
        btnBuscarVacunatorio.setEnabled(true);
        textNombre.setEnabled(true);
        textCalle.setText(null);
        textNro.setText(null);
        textLocal.setText(null);
        textNombre.setText(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        textNombre.setEnabled(false);
        btnBuscarVacunatorio.setEnabled(false);
        btnModificar.setEnabled(true);
        textLocal.setEnabled(true);
        textCalle.setEnabled(true);
        textNro.setEnabled(true);
        btnGuardar.setEnabled(true);
    }//GEN-LAST:event_btnModificarActionPerformed
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(textNombre.getText().isEmpty()||textLocal.getText().isEmpty()||textCalle.getText().isEmpty()||textNro.getText().isEmpty())
            JOptionPane.showMessageDialog(this,"Debe rellenar todos los campos");
        else{
            Vacunatorio v = new Vacunatorio();
            String nmb = textNombre.getText(); 
            if(vacuData.vacunatorioEsta(nmb)){
                v = vacuData.buscarVacunatorioxNombre(nmb);
                v.setLocalidad(textLocal.getText());
                v.setCalle(textCalle.getText());
                v.setAltura(Integer.valueOf(textNro.getText()));
                vacuData.actualizarVacunatorio(v);
            }else{
                v.setNombre(textNombre.getText());
                v.setLocalidad(textLocal.getText());
                v.setCalle(textCalle.getText());
                v.setAltura(Integer.valueOf(textNro.getText()));
                v.setEstado(true);
                vacuData.ingresarVacunatorio(v);
            }
            cargaCombo(this.vacuData);
            cargaTabVacunatorios(this.vacuData, this.ciData);
            btnLimpiarActionPerformed(evt);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    private void btnBuscarComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarComboActionPerformed
        dtm2 = (DefaultTableModel) tableVacunas.getModel();
        dtm2.setRowCount(0);
        Object vacu;
        vacu = comboVacunatorio.getSelectedItem();
        if(vacu instanceof Vacunatorio){        
            for(Cita c: this.ciData.obtenerAplicadasxCentro(((Vacunatorio) vacu).getIdVacunatorio())){
                String []row = new String[2];
                row[0] = c.getVacuna().getNroSerie()+"";
                row[1] = c.getPersona().getDni()+"";
                dtm2.addRow(row);
                tableVacunas.setModel(dtm2);
            }   
        }else
            JOptionPane.showMessageDialog(this,"Debe seleccionar un laboratorio para filtrar las vacunas aplicadas en el mismo");
    }//GEN-LAST:event_btnBuscarComboActionPerformed

    private void jCampoMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCampoMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCampoMesActionPerformed

    private void jBuscarMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarMesActionPerformed
        int mes=jMes.getValue();
        mes=ciData.cuentaVacunadosPorMes(mes);
        jCampoMes.setText(Integer.toString(mes));
        // TODO add your handling code here:
    }//GEN-LAST:event_jBuscarMesActionPerformed

    private void textNroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNroKeyTyped
        char val=evt.getKeyChar();
        
        if(!Character.isDigit(val)&& val != KeyEvent.VK_BACK_SPACE){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Este campo solo permite NUMEROS POSITIVOS");
        }
    }//GEN-LAST:event_textNroKeyTyped

    public Vacunatorio buscaVacu(){
        List<Vacunatorio> listaVacunatorios = vacuData.obtenerVacunatorios();
        Vacunatorio vac = new Vacunatorio();
        String n = textNombre.getText();
        boolean esta = false;
        for(Vacunatorio v : listaVacunatorios){
            if(v.getNombre().equals(n)){
               esta = true;
               vac = v;
               break;               
            }        
        }
        return vac;
    }    
    
    public void cargaTabVacunatorios(VacunatorioData vD,CitaData cd){
        dtm = (DefaultTableModel) tableVacunatorios.getModel();
        dtm.setRowCount(0);
        for(Vacunatorio v: vD.obtenerVacunatorios()){
            List <Cita> listCitas = cd.obtenerAplicadasxCentro(v.getIdVacunatorio());
            String []row = new String[4];
            row[0] = v.getNombre();
            row[1] = v.getLocalidad();
            row[2] = v.getCalle()+v.getAltura();
            row[3]= listCitas.size()+"";
            dtm.addRow(row);
            tableVacunatorios.setModel(dtm);
        }   
    }
    public void cargaCombo(VacunatorioData vD){
        comboVacunatorio.removeAllItems();
        comboVacunatorio.addItem(null);
        Iterator<Vacunatorio> itVac = vD.obtenerVacunatorios().iterator();
        while(itVac.hasNext()){
            Vacunatorio vac=itVac.next();
            comboVacunatorio.addItem(vac);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCombo;
    private javax.swing.JButton btnBuscarVacunatorio;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<Vacunatorio> comboVacunatorio;
    private javax.swing.JButton jBuscarMes;
    private javax.swing.JTextField jCampoMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.components.JSpinField jMes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableVacunas;
    private javax.swing.JTable tableVacunatorios;
    private javax.swing.JTextField textCalle;
    private javax.swing.JTextField textLocal;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textNro;
    // End of variables declaration//GEN-END:variables
}
