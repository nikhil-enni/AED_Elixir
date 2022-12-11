/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.DoctorWorkArea;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.medicalEmployment.Doctor;
import business.medicalEmployment.Patient;
import business.network.Network;
import business.organization.DoctorOrganization;
import business.organization.Organization;
import business.userAccount.UserAccount;
import business.workQueue.DoctorCheckUpWorkRequest;
import business.workQueue.WorkRequest;

import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author essni
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
     JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Enterprise enterprise;
    Network network;
    EcoSystem business;
        String value = "\\d+";
   
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, 
            UserAccount account,Organization organization,Enterprise enterprise,Network network,
            EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
         this.account = account;
         this.organization = organization;
         this.enterprise = enterprise;
         this.network = network;
         this.business = business;
         populateTable();
    }

    public void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel) tblDocReq.getModel();
        model.setRowCount(0);
        System.out.println("Total workreq "+account.getWorkQueue().getWorkRequestList().size());
        
        for (WorkRequest wr : account.getWorkQueue().getWorkRequestList()) {
            if(wr instanceof DoctorCheckUpWorkRequest) {
                
                DoctorCheckUpWorkRequest epr = (DoctorCheckUpWorkRequest)wr;
                
                Object[] row = new Object[4];
                row[0] = epr;
                row[1] = epr.getPatient().getPatientName();
                row[2] = epr.getStatus();               
                row[3] = epr.getMessage();
             
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDocReq = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtrespiratoryrate = new javax.swing.JTextField();
        txtbloodpressure = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtweight = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtheartrate = new javax.swing.JTextField();
        btnrequest = new javax.swing.JButton();
        btnsubmit = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDocReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Request ID", "Patient", "Status", "Message"
            }
        ));
        jScrollPane1.setViewportView(tblDocReq);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 117, 642, 121));

        jLabel1.setText("Respiratory Rate :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 273, -1, -1));

        jLabel2.setText("Blood Pressure :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 317, -1, -1));
        add(txtrespiratoryrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 268, 128, -1));
        add(txtbloodpressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 312, 128, -1));

        jLabel3.setText("Weight :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 273, -1, -1));
        add(txtweight, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 268, 128, -1));

        jLabel4.setText("Heart Rate :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 317, -1, -1));

        txtheartrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtheartrateActionPerformed(evt);
            }
        });
        add(txtheartrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 312, 128, -1));

        btnrequest.setBackground(new java.awt.Color(0, 153, 153));
        btnrequest.setText("Request for Lab Test");
        btnrequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrequestActionPerformed(evt);
            }
        });
        add(btnrequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 385, -1, -1));

        btnsubmit.setBackground(new java.awt.Color(0, 153, 153));
        btnsubmit.setText("Submit Vital Info");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 385, 173, -1));

        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 76, 96, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Write Prescription ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 385, 173, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DOCTOR WORK AREA");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 22, 292, 36));

        jLabel6.setBackground(new java.awt.Color(203, 133, 133));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/doctor1.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, 810, 490));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblDocReq.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
//        String compare = (String) tblDocReq.getValueAt(selectedRow, 3);
//        if (compare.equalsIgnoreCase("completed")) {
//            JOptionPane.showMessageDialog(this, "It has been already completed!", "Warning", JOptionPane.WARNING_MESSAGE);
//            return;
//        }

        if (txtrespiratoryrate.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter an appropriate Respiratory Rate");
            return;
        } else if (!txtrespiratoryrate.getText().matches(value)) {
            JOptionPane.showMessageDialog(null, "Enter an appropriate Respiratory Rate");
            return;
        }
        if (txtbloodpressure.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter an appropriate Blood Pressure");
            return;
        } else if (!txtbloodpressure.getText().matches(value)) {
            JOptionPane.showMessageDialog(null, "Enter an appropriate Blood Pressure");
            return;
        }
        if (txtheartrate.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter an appropriate Heart Rate");
            return;
        } else if (!txtheartrate.getText().matches(value)) {
            JOptionPane.showMessageDialog(null, "Enter an appropriate Heart Rate");
            return;
        }
        if (txtweight.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter an appropriate Weight");
            return;
        } else if (!txtweight.getText().matches(value)) {
            JOptionPane.showMessageDialog(null, "Enter an appropriate Weight");
            return;
        }
          
       // String result=txtTestResult.getText();
       //  JOptionPane.showMessageDialog(null,"Donor details added1");
        int rr = Integer.parseInt(txtrespiratoryrate.getText());
        int bp = Integer.parseInt(txtbloodpressure.getText());
        int weight = Integer.parseInt(txtweight.getText());
        int hr = Integer.parseInt(txtheartrate.getText());
        DoctorCheckUpWorkRequest cur = (DoctorCheckUpWorkRequest) tblDocReq.getValueAt(selectedRow, 0);
        //JOptionPane.showMessageDialog(null,"Donor details added1");
//        if(rr.trim()==0 || bp.trim()==0)
//        {
//                  JOptionPane.showMessageDialog(null,"Enter details!");
//                  return;
//              }
        //  wr.setTestResult(result);
        cur.getCheckUp().setRespiratoryRate(rr);
        cur.getCheckUp().setBloodPressure(bp);
        cur.getCheckUp().setHeartRate(hr);
        cur.getCheckUp().setWeight(weight);
        cur.getCheckUp().setDate(new Date());
        cur.setResolveDate(new Date());
        cur.setStatus("Completed"); //labtest
        //txtTestResult.setEnabled(true);
        // wr.setBarCode(barCode);

        //        wr.setBloodType(bloodType);
        //     wr.setBarCode(barCode);
        JOptionPane.showMessageDialog(null, "Check Up  completed");
        btnrequest.setEnabled(true);
        btnsubmit.setEnabled(false);
        populateTable();
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnrequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrequestActionPerformed
        // TODO add your handling code here:
        
         int selectedRow = tblDocReq.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DoctorCheckUpWorkRequest dcwr = (DoctorCheckUpWorkRequest) tblDocReq.getValueAt(selectedRow, 0);
        
        Patient patient = dcwr.getPatient();
        Doctor doctor = dcwr.getDoctor() ;
//         for (WorkRequest wr : account.getWorkQueue().getWorkRequestList()) {
//            if(wr instanceof DoctorCheckUpWorkRequest) {
//                
//                DoctorCheckUpWorkRequest epr = (DoctorCheckUpWorkRequest)wr;
//                patient = epr.getPatient();
//                doctor = epr.getDoctor();
//            }
//         }
        
        RequestLabTestJPanel manageNetworkJPanel = new RequestLabTestJPanel(userProcessContainer,account,enterprise,
                patient,doctor,organization,network,business);
        userProcessContainer.add("manageNetworkJPanel", manageNetworkJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnrequestActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblDocReq.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DoctorCheckUpWorkRequest dcwr = (DoctorCheckUpWorkRequest) tblDocReq.getValueAt(selectedRow, 0);
        
        Patient patient = dcwr.getPatient();
        Doctor doctor = dcwr.getDoctor() ;
//         Patient patient = null;
//        Doctor doctor = null ;
//         for (WorkRequest wr : account.getWorkQueue().getWorkRequestList()) {
//            if(wr instanceof DoctorCheckUpWorkRequest) {
//                
//                DoctorCheckUpWorkRequest epr = (DoctorCheckUpWorkRequest)wr;
//                patient = epr.getPatient();
//                doctor = epr.getDoctor();
//            }
//         }
 
   
        PrescriptionJPanel manageNetworkJPanel = new PrescriptionJPanel(userProcessContainer,account,enterprise,
                organization,business,network,patient,doctor);
        userProcessContainer.add("manageNetworkJPanel", manageNetworkJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtheartrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtheartrateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtheartrateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnrequest;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDocReq;
    private javax.swing.JTextField txtbloodpressure;
    private javax.swing.JTextField txtheartrate;
    private javax.swing.JTextField txtrespiratoryrate;
    private javax.swing.JTextField txtweight;
    // End of variables declaration//GEN-END:variables
}
