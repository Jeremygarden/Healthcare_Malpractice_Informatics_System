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
public class DeviceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeviceJPanel
     */
    JPanel container;
    ServiceOrganization serviceOrganization;

    public DeviceJPanel(JPanel container, ServiceOrganization serviceOrganization) {
        initComponents();
        this.container = container;
        this.serviceOrganization = serviceOrganization;
        populateTable();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        for (ReporttoEnter reporttoEnter : serviceOrganization.getReporttoEnterDir().getReporttoEnterList()) {
            if (reporttoEnter.getLevel2().equals(ErrorUtil.DEVICE_OR_MEDICAL)) {
                Object[] row = new Object[1];
                row[0] = reporttoEnter;
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

        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        fjTextField2 = new javax.swing.JTextField();
        sjTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        personneljTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        timesjTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        respondjTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        causejTextField1 = new javax.swing.JTextField();
        typejTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        locationjTextField1 = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("Report History");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

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

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 210, 420));
        add(fjTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 80, -1));
        add(sjTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 90, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Second");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("First");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setText("Source:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setText("This knid of personnel is reported most frequently:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));
        add(personneljTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 150, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Times:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, -1));
        add(timesjTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 120, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Respond from government");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, -1));

        respondjTextArea2.setColumns(20);
        respondjTextArea2.setRows(5);
        jScrollPane1.setViewportView(respondjTextArea2);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 360, 110));

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("This cause of device error is reported most frequently:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));
        add(causejTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 210, -1));
        add(typejTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 160, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("This type of device is reported most frequently");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("Report of Device Error from Government");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setText("This kind of event most likely occure ar:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 330, -1));
        add(locationjTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 210, -1));
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
            locationjTextField1.setText(enter.getMostLocation());

            causejTextField1.setText(enter.getDevicecause());
            typejTextField2.setText(enter.getDevicetype());

        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField causejTextField1;
    private javax.swing.JTextField fjTextField2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField locationjTextField1;
    private javax.swing.JTextField personneljTextField1;
    private javax.swing.JTextArea respondjTextArea2;
    private javax.swing.JTextField sjTextField3;
    private javax.swing.JTextField timesjTextField2;
    private javax.swing.JTextField typejTextField2;
    // End of variables declaration//GEN-END:variables
}
