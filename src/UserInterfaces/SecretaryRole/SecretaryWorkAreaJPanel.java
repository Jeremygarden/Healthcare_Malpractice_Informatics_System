/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaces.SecretaryRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jeremy
 */
public class SecretaryWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SecretaryWorkAreaJPanel
     */
    JPanel container;
    Organization org;
    Enterprise enterprise;
    EcoSystem econSystem;
    UserAccount ua;

    public SecretaryWorkAreaJPanel(JPanel container, Enterprise enterprise1, EcoSystem ecoSystem, UserAccount ua, Organization org) {
        initComponents();
        this.econSystem = ecoSystem;
        enterprise = enterprise1;
        this.container = container;
        this.ua = ua;
        this.org = org;

        namejTextField2.setText(enterprise.getOrgName());

        populateTable();

    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        //for (Network n : econSystem.getNetworkList()) {
        //  for (Enterprise enterprsie : n.getEd().getEnterprisesList()) {
        //    if (enterprsie.getOrgName().equals(namejTextField2.getText())) {
        //      for (Organization organization : enterprsie.getOrganizationDirectory().getOrganizationList()) {
        //        if (organization instanceof SecretaryOrganization) {
        //          for (WorkRequest workRequest : organization.getWorkQueue().getWorkRequestList()) {
        for (WorkRequest workRequest : org.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[4];
            row[0] = workRequest;
            row[1] = workRequest.getSenderEnterprise().getOrgName();
            //row[2] = workRequest.getSender().getRole();
            row[2] = workRequest.getStatus();
            if (workRequest.getReceiver() != null) {
                row[3] = workRequest.getReceiver().getGe().getName();
            } else {
                row[3] = "Not Assigned";
            }

            //row[5] = workRequest.getSource();
            model.addRow(row);
            //        }
      
        }//}
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
        jTable1 = new javax.swing.JTable();
        namejTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        viewjButton2 = new javax.swing.JButton();
        assignjButton1 = new javax.swing.JButton();
        refreshjButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Secretary Work Area");

        jTable1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Time", "Hospital Name", "Status", "Receiver"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        namejTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namejTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Hospital/Clinic Name:");

        viewjButton2.setText("View Detial");
        viewjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewjButton2ActionPerformed(evt);
            }
        });

        assignjButton1.setText("Assign to me");
        assignjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignjButton1ActionPerformed(evt);
            }
        });

        refreshjButton2.setText("Refresh");
        refreshjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshjButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(assignjButton1)
                        .addGap(72, 72, 72)
                        .addComponent(viewjButton2)
                        .addGap(86, 86, 86)
                        .addComponent(refreshjButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)
                        .addGap(71, 71, 71)
                        .addComponent(namejTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namejTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewjButton2)
                    .addComponent(assignjButton1)
                    .addComponent(refreshjButton2))
                .addContainerGap(132, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void namejTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namejTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namejTextField2ActionPerformed

    private void viewjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewjButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "please select one row");
        }
        WorkRequest workRequest = (WorkRequest) jTable1.getValueAt(selectedRow, 0);
        if (workRequest.getReceiver() != null) {
            if (workRequest.getReceiver().equals(ua)) {

                ViewDetialJPanel vdjp = new ViewDetialJPanel(container, workRequest, econSystem, ua,org);
                container.add("ViewDetialJPanel", vdjp);
                CardLayout layout = (CardLayout) container.getLayout();
                layout.next(container);
            }else{
                JOptionPane.showMessageDialog(null, "Sorry, you do not have the access to see the detail");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please assign first");
        }
    }//GEN-LAST:event_viewjButton2ActionPerformed

    private void assignjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignjButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "please select one row");
        }

        WorkRequest workRequest = (WorkRequest) jTable1.getValueAt(selectedRow, 0);
        workRequest.setReceiver(ua);
        workRequest.setStatus("Received and Assigned");
        populateTable();

    }//GEN-LAST:event_assignjButton1ActionPerformed

    private void refreshjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshjButton2ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshjButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignjButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField namejTextField2;
    private javax.swing.JButton refreshjButton2;
    private javax.swing.JButton viewjButton2;
    // End of variables declaration//GEN-END:variables
}
