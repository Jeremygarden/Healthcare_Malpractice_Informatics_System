/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaces.Service;

import Business.Organization.ServiceOrganization;
import Business.Report.ReporttoEnter;
import Business.Util.ErrorUtil;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jeremy
 */
public class MedicationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MedicationJPanel
     */
    JPanel container;
    ServiceOrganization serviceOrganization;

    public MedicationJPanel(JPanel container, ServiceOrganization serviceOrganization) {
        initComponents();
        this.container = container;
        this.serviceOrganization = serviceOrganization;
        populateTable();

    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        for (ReporttoEnter reporttoEnter : serviceOrganization.getReporttoEnterDir().getReporttoEnterList()) {
            if (reporttoEnter.getLevel2().equals(ErrorUtil.MEDICATION_OR_OTHER)) {
                Object[] row = new Object[1];
                row[1] = reporttoEnter;
                model.addRow(row);
            }
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

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sjTextField3 = new javax.swing.JTextField();
        fjTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        personneljTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        timesjTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        respondjTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        medjTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        descripjTextField2 = new javax.swing.JTextField();
        locationjTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Report date"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 200, 430));

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("Report History");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("Report of Medical Error from Government");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setText("Source:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("First");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Second");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));
        add(sjTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 90, -1));
        add(fjTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 80, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setText("This knid of Personnel is reported most frequently:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));
        add(personneljTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 120, -1));

        jLabel4.setText("Times:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, -1));
        add(timesjTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 90, -1));

        respondjTextArea2.setColumns(20);
        respondjTextArea2.setRows(5);
        jScrollPane1.setViewportView(respondjTextArea2);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 360, 110));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Respond from government");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, -1));
        add(medjTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 186, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Most reporters described the medication event as:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("This type of medication was reported most frequencly:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));
        add(descripjTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 180, -1));
        add(locationjTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 210, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setText("This kind of event most likely occured ar:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 330, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "please select one row");
        } else {
            ReporttoEnter enter = (ReporttoEnter) jTable1.getValueAt(selectedRow, 0);
            fjTextField2.setText(String.valueOf(enter.getFirst()));
            sjTextField3.setText(String.valueOf(enter.getSecond()));
            timesjTextField2.setText(String.valueOf(enter.getMaxofperson()));
            personneljTextField1.setText(enter.getErrorperonstring());
            respondjTextArea2.setText(enter.getRespond());
            
            descripjTextField2.setText(enter.getMeddescrip());
            medjTextField1.setText(enter.getMedtype());
            
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField descripjTextField2;
    private javax.swing.JTextField fjTextField2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField locationjTextField1;
    private javax.swing.JTextField medjTextField1;
    private javax.swing.JTextField personneljTextField1;
    private javax.swing.JTextArea respondjTextArea2;
    private javax.swing.JTextField sjTextField3;
    private javax.swing.JTextField timesjTextField2;
    // End of variables declaration//GEN-END:variables
}
