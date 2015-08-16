/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterfaces.HAdministration;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Util.ErrorUtil;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Jeremy
 */
public class EnterpriseReportDetailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EnterpriseReportDetailJPanel
     */
    JPanel container;
    UserAccount ua;
    Organization organization;
    Enterprise enterprise;
    EcoSystem ecoSystem;

    public EnterpriseReportDetailJPanel(JPanel container, UserAccount ua, Organization org, Enterprise enterpirse, EcoSystem ecoSystem) {
        initComponents();
        this.container = container;
        this.ua = ua;
        this.organization = org;
        this.enterprise = enterpirse;
        this.ecoSystem = ecoSystem;
        populateText();
        
        populateCombox();
        
    }
    
    
    private void populateCombox(){
        jComboBox1.removeAllItems();
        jComboBox1.addItem(ErrorUtil.BLOOD_OR_BLOOD_PRODUCT);
        jComboBox1.addItem(ErrorUtil.SURGERY_OR_ANESTHESIA);
        jComboBox1.addItem(ErrorUtil.DEVICE_OR_MEDICAL);
        jComboBox1.addItem(ErrorUtil.FALL);
        jComboBox1.addItem(ErrorUtil.MEDICATION_OR_OTHER);
    }
    
    private void populateText() {
       
        
        
        
        
        int bloodnumber = 0;
        int devicenumber = 0;
        int medicationnumber = 0;
        int fallnumber = 0;
        int surgerynumber = 0;
        
        for (WorkRequest workRequest : enterprise.getWorkQueue().getWorkRequestList()) {
            if (workRequest.getLevel2().equals(ErrorUtil.BLOOD_OR_BLOOD_PRODUCT)) {                
                bloodnumber = bloodnumber + 1;
                bloodjTextField3.setText(String.valueOf(bloodnumber));
                senderenterprisejTextField1.setText(workRequest.getSenderEnterprise().getOrgName());
            }
            if (workRequest.getLevel2().equals(ErrorUtil.DEVICE_OR_MEDICAL)) {
                devicenumber = devicenumber + 1;
                devicejTextField5.setText(String.valueOf((devicenumber)));
            }
            if (workRequest.getLevel2().equals(ErrorUtil.MEDICATION_OR_OTHER)) {
                medicationnumber = medicationnumber + 1;
                medicationjTextField2.setText(String.valueOf(medicationnumber));
            }
            if (workRequest.getLevel2().equals(ErrorUtil.FALL)) {
                fallnumber = fallnumber + 1;
                falljTextField1.setText(String.valueOf(fallnumber));
            }
            if (workRequest.getLevel2().equals(ErrorUtil.SURGERY_OR_ANESTHESIA)) {
                surgerynumber = surgerynumber + 1;
                surgeryjTextField4.setText(String.valueOf(surgerynumber));     
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

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        falljTextField1 = new javax.swing.JTextField();
        medicationjTextField2 = new javax.swing.JTextField();
        bloodjTextField3 = new javax.swing.JTextField();
        surgeryjTextField4 = new javax.swing.JTextField();
        devicejTextField5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        backjButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        senderenterprisejTextField1 = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("Reports of Hospital/Clinic");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));
        add(falljTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 126, -1));
        add(medicationjTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 180, -1));
        add(bloodjTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 180, -1));
        add(surgeryjTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 126, -1));
        add(devicejTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 180, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Blood or Blood Product:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Device or Medical Supply:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Fall:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Surgery or Anesthesia:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Medication or other Substance:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("See how many times the following events being reported:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        backjButton1.setText("<<Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 15, -1, -1));

        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 210, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("Choose one category and write a report to the hospital/clinic");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jButton1.setText("Create report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, -1, -1));
        add(senderenterprisejTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 240, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout cl = (CardLayout) container.getLayout();
        cl.previous(container);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        
        if(jComboBox1.getSelectedItem().equals(ErrorUtil.BLOOD_OR_BLOOD_PRODUCT)){
            BloodReportJPanel erdjp = new BloodReportJPanel(container,enterprise);
            container.add("ViewDetialJPanel", erdjp);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);           
        }if(jComboBox1.getSelectedItem().equals(ErrorUtil.DEVICE_OR_MEDICAL)){           
            DeviceReportJPanel drjp = new DeviceReportJPanel(container,enterprise);
            container.add("d", drjp);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);  
        }if(jComboBox1.getSelectedItem().equals(ErrorUtil.FALL)){        
            FallReportJPanel frjp = new FallReportJPanel(container,enterprise);
            container.add("FallReportJPanel", frjp);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);             
        }if(jComboBox1.getSelectedItem().equals(ErrorUtil.MEDICATION_OR_OTHER)){
            MedicationJPanel frjp = new MedicationJPanel(container,enterprise);
            container.add("m", frjp);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);  

        }if(jComboBox1.getSelectedItem().equals(ErrorUtil.SURGERY_OR_ANESTHESIA)){
            SurgeryJPanel frjp = new SurgeryJPanel(container,enterprise);
            container.add("SurgeryJPanel", frjp);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);  

        }
       
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JTextField bloodjTextField3;
    private javax.swing.JTextField devicejTextField5;
    private javax.swing.JTextField falljTextField1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField medicationjTextField2;
    private javax.swing.JTextField senderenterprisejTextField1;
    private javax.swing.JTextField surgeryjTextField4;
    // End of variables declaration//GEN-END:variables
}
