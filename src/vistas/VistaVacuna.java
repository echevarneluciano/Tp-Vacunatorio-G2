/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Vacunatorio.clases.*;
import Vacunatorio.dataClass.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guido Caballero
 */

public class VistaVacuna extends javax.swing.JInternalFrame {
    private LaboratorioData labData;
    private VacunaData vacData;
    private DefaultTableModel dtm;
    
    /**
     * Creates new form ViewVacuna
     */
    public VistaVacuna(VacunaData vd,LaboratorioData ld) {
        initComponents();
        cargaTablaCombo(vd,ld);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVac = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textNro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        comboLab = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);

        tableVac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro de Serie", "Laboratorio", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tableVac);
        if (tableVac.getColumnModel().getColumnCount() > 0) {
            tableVac.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel1.setText("Generador de vacunas");

        jLabel2.setText("Ingrese la cantidad de vacunas que desea generar");

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        jLabel3.setText("Seleccione el laboratorio.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textNro, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(54, 54, 54)
                                .addComponent(comboLab, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textNro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        int cant = 0;
        Object lab;
        try{
            cant = Integer.parseInt(textNro.getText());
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Solo puede cargar enteros positivos.");
        }
        if(cant > 0){
            lab = comboLab.getSelectedItem();
            if(lab instanceof Laboratorio){
                for(int i=0;i<cant;i++){
                    Vacuna v = new Vacuna();
                    v.setLaboratorio((Laboratorio)lab);
                    v.setNroSerie(0);
                    v.setEstado(true);
                    this.vacData.ingresarVacuna(v);
                    v = new Vacuna();
                    v = vacData.buscarVacuna(0);
                    System.out.println("v ns= "+v.getNroSerie());
                    System.out.println("v id= "+v.getIdVacuna());
                    int aux = v.getIdVacuna()+100;
                    System.out.println("aux = "+aux);
                    v.setNroSerie(aux);
                    System.out.println("v ns= "+v.getNroSerie());
                    System.out.println("v id= "+v.getIdVacuna());
                    vacData.actualizarVacuna(v);
                    System.out.println("vacData= "+vacData.buscarVacuna(aux).getNroSerie());
                    System.out.println("vacData id= "+vacData.buscarVacuna(aux).getIdVacuna());
                    
                }
            }else
                JOptionPane.showMessageDialog(this, "Debe seleccionar el Laboratorio de origen.");
        }else
            JOptionPane.showMessageDialog(this,"Debe ingresar un numero mayor a 0.");
        this.cargaTablaCombo(vacData,labData);
        comboLab.setSelectedIndex(0);
        textNro.setText("");
        
        
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void cargaTablaCombo(VacunaData vd, LaboratorioData ld){
        this.vacData = vd;
        this.labData = ld;
        dtm = (DefaultTableModel) tableVac.getModel();
        dtm.setRowCount(0);
        for (Vacuna v : vd.obtenerVacunas()){
            if(v.isEstado()){
                String []row = new String[4];
                row[0] = v.getNroSerie()+"";
                row[1] = v.getLaboratorio().getNombre();
                row[2]= "Disponible";
                dtm.addRow(row);
                tableVac.setModel(dtm);
            }else{
                String []row = new String[4];
                row[0] = v.getNroSerie()+"";
                row[1] = v.getLaboratorio().getNombre();
                row[2]= "No disponible";
                dtm.addRow(row);
                tableVac.setModel(dtm);
            }
        } 
        Iterator<Laboratorio> itLab = ld.obtenerLaboratorios().iterator();
        comboLab.removeAllItems();
        comboLab.addItem(null);
        while(itLab.hasNext()){
            Laboratorio lab=itLab.next();
            //if(lab.isEstado())
                comboLab.addItem(lab);
        }
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JComboBox<Laboratorio> comboLab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableVac;
    private javax.swing.JTextField textNro;
    // End of variables declaration//GEN-END:variables
}
