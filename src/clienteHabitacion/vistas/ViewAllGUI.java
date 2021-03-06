/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteHabitacion.vistas;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import servidorAlertas.dto.PatientDTO;

/**
 *
 * @author dawish
 */
public class ViewAllGUI extends javax.swing.JDialog {

    private int numberElements = 0;
  
    /**
     * Creates new form ViewAllGUI
     */
    private RoomGUI parent;
    private UpdateGUI updategui;

    public ViewAllGUI(RoomGUI parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.parent = parent;
        this.updategui= new UpdateGUI(parent, modal);
    }

    public JTable getTblPatients() {
        return tblPatients;
    }

    public int getNumberElements() {
        return numberElements;
    }

    public void setNumberElements(int numberElements) {
        this.numberElements = numberElements;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        btnSelect = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Lista de pacientes");

        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Habitación", "Nombres", "Apellidos", "Fecha de nacimiento"
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
        tblPatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPatients);

        btnSelect.setText("Seleccionar");
        btnSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelectMouseClicked(evt);
            }
        });

        btnCancel.setText("Volver");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnEdit.setText("Editar");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancel)
                .addGap(18, 18, 18)
                .addComponent(btnEdit)
                .addGap(18, 18, 18)
                .addComponent(btnSelect)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelect)
                    .addComponent(btnCancel)
                    .addComponent(btnEdit))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void tblPatientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientsMouseClicked
        int row = tblPatients.rowAtPoint(evt.getPoint());
        if (evt.getClickCount() == 2 && !evt.isConsumed() && row < this.numberElements) {
            evt.consume();

            PatientDTO patient = new PatientDTO(Integer.parseInt(tblPatients.getValueAt(row, 0).toString()),tblPatients.getValueAt(row, 1).toString(),tblPatients.getValueAt(row, 2).toString(), tblPatients.getValueAt(row, 3).toString());
             patient.setPatientClbk(this.parent.patientCallback);
            this.parent.actualPatient = patient;
            this.parent.getLblPatientName().setText(patient.name + " " + patient.lastname);
            this.parent.getLblPatientRoom().setText(String.valueOf(patient.roomNumber));
            this.setVisible(false);
            this.parent.getBtnStart().setEnabled(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientsMouseClicked
private void updateTable(){
    String[] listpatients = this.parent.ref.selectAllPatients();
    this.numberElements=0;
        for (int i = 0; i < listpatients.length; i++) {
            String[] patient = listpatients[i].split(",");
            for (int j = 0; j < patient.length - 2; j++) {
                this.getTblPatients().setValueAt(patient[0], i, 0);
                this.getTblPatients().setValueAt(patient[1], i, 1);
                this.getTblPatients().setValueAt(patient[2], i, 2);
                this.getTblPatients().setValueAt(patient[3], i, 3);
            }
        }
        this.setNumberElements(listpatients.length);
}
    private void btnSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectMouseClicked

        int row = -1;
        row = tblPatients.getSelectedRow();
        if (row >= 0 && row < this.numberElements) {
            PatientDTO patient = new PatientDTO(Integer.parseInt(tblPatients.getValueAt(row, 0).toString()),tblPatients.getValueAt(row, 1).toString(),tblPatients.getValueAt(row, 2).toString(), tblPatients.getValueAt(row, 3).toString());
           patient.setPatientClbk(this.parent.patientCallback);
            this.parent.actualPatient = patient;
            
            this.parent.getLblPatientName().setText(patient.name + " " + patient.lastname);
            this.parent.getLblPatientRoom().setText(String.valueOf(patient.roomNumber));
            this.setVisible(false);
            this.parent.getBtnStart().setEnabled(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnSelectMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        int row = -1;
        row = tblPatients.getSelectedRow();
        if (row >= 0 && row < this.numberElements) {
             Date fecha = new Date(tblPatients.getValueAt(row, 3).toString());
       
            this.updategui.getTxtHabitacion().setText(tblPatients.getValueAt(row, 2).toString());
            this.updategui.getTxtName().setText(tblPatients.getValueAt(row, 0).toString());
            this.updategui.getTxtLastname().setText(tblPatients.getValueAt(row, 1).toString());
            this.updategui.getjDataBirthday().setDate(fecha);
            this.updategui.setVisible(true);
            this.updategui.setVisible(false);
           this.updateTable();
            this.parent.getBtnStart().setEnabled(true);
        }     
    }//GEN-LAST:event_btnEditMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPatients;
    // End of variables declaration//GEN-END:variables
}
