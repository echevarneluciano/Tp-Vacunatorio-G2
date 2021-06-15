/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Vacunatorio.dataClass.LaboratorioData;

import Vacunatorio.clases.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guido Caballero
 */
public class vistaLaboratorio extends javax.swing.JInternalFrame {
    private LaboratorioData labData;
    private DefaultTableModel dtm;
    /**
     * Creates new form vistaLaboratorio
     */
    public vistaLaboratorio(LaboratorioData ld) {
        initComponents();
        this.cargarTabla(ld);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNomb = new javax.swing.JTextField();
        txtOrigen = new javax.swing.JTextField();
        txtDir = new javax.swing.JTextField();
        checkEstado = new javax.swing.JCheckBox();
        btnBuscar = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLabs = new javax.swing.JTable();

        setClosable(true);
        setTitle("Alta Baja y Modificacion de Laboratorios");

        jLabel1.setText("Nombre del Laboratorio");

        jLabel2.setText("Pais de Origen");

        jLabel3.setText("Direccion");

        txtNomb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombKeyTyped(evt);
            }
        });

        txtOrigen.setEnabled(false);
        txtOrigen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOrigenKeyTyped(evt);
            }
        });

        txtDir.setEnabled(false);

        checkEstado.setText("Activo actualmente.");
        checkEstado.setEnabled(false);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEdit.setText("Editar");
        btnEdit.setEnabled(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
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

        jLabel4.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel4.setText("Busque, añada o modifique aqui ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNomb)
                        .addGap(19, 19, 19)
                        .addComponent(btnBuscar)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtOrigen)
                        .addGap(29, 29, 29)
                        .addComponent(checkEstado)
                        .addGap(30, 30, 30))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkEstado))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardar)
                    .addComponent(btnEdit))
                .addGap(17, 17, 17))
        );

        tableLabs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Laboratorio", "Pais de origen", "Direccion", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(tableLabs);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNomb.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnEdit.setEnabled(false);
        btnGuardar.setEnabled(false);
        txtDir.setEnabled(false);
        txtOrigen.setEnabled(false);
        txtNomb.setText("");
        txtDir.setText("");
        txtOrigen.setText("");
        checkEstado.setSelected(false);
        checkEstado.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        txtOrigen.setEnabled(true);
        txtDir.setEnabled(true);
        btnGuardar.setEnabled(true);
        checkEstado.setEnabled(true);
    }//GEN-LAST:event_btnEditActionPerformed
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Laboratorio l = new Laboratorio();
        String n = txtNomb.getText(),dir = txtDir.getText(), or = txtOrigen.getText();
        l.setNombre(n);
        if(n.equals("")||dir.equals("")||or.equals(""))
            JOptionPane.showMessageDialog(this,"Debe rellenar todos los campos.");
        else{
            if(l.equals(this.labData.buscarLaboratorio(n))){
                l = labData.buscarLaboratorio(n);
                l.setPaisOrigen(or);
                l.setDireccion(dir);
                l.setEstado(checkEstado.isSelected());
                labData.actualizarLaboratorio(l);
                JOptionPane.showMessageDialog(this, "Laboratorio modificado exitosamente");
                this.btnLimpiarActionPerformed(evt);
            }else{
                l.setPaisOrigen(txtOrigen.getText());
                l.setDireccion(txtDir.getText());
                l.setEstado(checkEstado.isSelected());
                labData.ingresarLaboratorio(l);
                this.btnLimpiarActionPerformed(evt);
            }
        }
        this.cargarTabla(this.labData);
    }//GEN-LAST:event_btnGuardarActionPerformed
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Laboratorio l = new Laboratorio();
        String n = txtNomb.getText();
        if(!n.equals("")){
            l.setNombre(n);
            this.btnLimpiarActionPerformed(evt);
            txtNomb.setText(n);
            txtNomb.setEnabled(false);
            btnBuscar.setEnabled(false);    
            if(l.equals(this.labData.buscarLaboratorio(n))){
                JOptionPane.showMessageDialog(this,"El nombre ingresado ya pertenece a un Laboratorio en el sistema. Pulse Editar para modificar los datos establecidos del laboratorio");
                l = labData.buscarLaboratorio(n);
                txtDir.setText(l.getDireccion());
                txtOrigen.setText(l.getPaisOrigen());
                if(l.isEstado())
                    checkEstado.setSelected(true);
            btnEdit.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(this, "El nombre solicitado se encuentra disponible para crear un nuevo laboratorio\n\n\t\t Por favor complete los campos restantes");
                txtDir.setEnabled(true);
                txtOrigen.setEnabled(true);
                checkEstado.setEnabled(true);
                btnGuardar.setEnabled(true);
            }
        }else
            JOptionPane.showMessageDialog(this,"El campo Nombre no puede estar vacio.");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNombKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombKeyTyped
        char val=evt.getKeyChar();
        if(!Character.isLetter(val)&&val!=' '){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Este campo solo permite LETRAS");
        }
        
    }//GEN-LAST:event_txtNombKeyTyped
    private void txtOrigenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrigenKeyTyped
        char val=evt.getKeyChar();
        if(!Character.isLetter(val)&&val!=' '){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Este campo solo permite LETRAS");
        }
        
    }//GEN-LAST:event_txtOrigenKeyTyped

    public void cargarTabla(LaboratorioData ld){
        this.labData = ld;
        dtm = (DefaultTableModel) tableLabs.getModel();
        dtm.setRowCount(0);
        for (Laboratorio l : ld.obtenerLaboratorios()){
            if(l.isEstado()){
                String []row = new String[4];
                row[0] = l.getNombre();
                row[1] = l.getPaisOrigen();
                row[2] = l.getDireccion();
                row[3]= "Disponible";
                dtm.addRow(row);
                tableLabs.setModel(dtm);
            }else{
                String []row = new String[4];
                row[0] = l.getNombre()+"";
                row[1] = l.getPaisOrigen();
                row[2] = l.getDireccion();
                row[3]= "No disponible";
                dtm.addRow(row);
                tableLabs.setModel(dtm);
            }
        } 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox checkEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableLabs;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtNomb;
    private javax.swing.JTextField txtOrigen;
    // End of variables declaration//GEN-END:variables
}
