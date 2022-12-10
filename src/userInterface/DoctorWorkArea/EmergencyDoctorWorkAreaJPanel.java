/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.DoctorWorkArea;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.DoctorOrganization;
import business.organization.Organization;
import business.userAccount.UserAccount;
import userInterface.Ambulance.*;
import business.workQueue.EmergencyPatientRequest;
import business.workQueue.DoctorWorkRequest;
import business.workQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sandeep
 */
public class EmergencyDoctorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmergencyAmbulanceUserJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Enterprise enterprise;
    Network network;
    EcoSystem business;
    
    public EmergencyDoctorWorkAreaJPanel(JPanel userProcessContainer, 
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
        DefaultTableModel model = (DefaultTableModel) WorkRequestTable.getModel();
        model.setRowCount(0);
        System.out.println("Total workreq "+account.getWorkQueue().getWorkRequestList().size());
        
         Organization doctorOrg = null;
                     for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
                    {
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                           if (organization instanceof DoctorOrganization ) {

                               doctorOrg = organization;
                               break;
                           }
                       }
                    }
          for(UserAccount ua : doctorOrg.getUserAccountDirectory().getUserAccountList())
                               {
        for (WorkRequest wr : ua.getWorkQueue().getWorkRequestList()) {
            System.out.println("ua" + ua.getUsername());
            System.out.println("account" +account.getUsername() );
               
            if(ua.getUsername().equals(account.getUsername()))
            {
            if(wr instanceof DoctorWorkRequest) {
                System.out.println(wr);
                DoctorWorkRequest epr = (DoctorWorkRequest)wr;
                  System.out.println("epr" + wr);
                Object[] row = new Object[model.getColumnCount()];
                row[0] = epr;
                row[1] = epr.getPatient().getPatientName();//epr.getSender().getEmployee().getName();
                row[2] = epr.getPatient().getPatientName();
                row[3] = epr.getPatient().getAddress();
                row[4] = epr.getCriticality();
                row[5] = epr.getStatus();// epr.getRequestdate();
                row[6] = epr.getRequestDate();
                row[7] = epr.getPatient().getPhoneNumber();
                //row[8] = "" ;
               // row[9] = "";//epr.getEmergencyDoctor() != null ? epr.getEmergencyDoctor().;
                model.addRow(row);
            }
            }
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
        WorkRequestTable = new javax.swing.JTable();
        btnAcknowledge = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        btnCompleteRequest = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WorkRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "RequestId", "Sender", "Patient Name", "Patient Address", "Criticality", "Status", "Request Date", "Phone Number"
            }
        ));
        jScrollPane1.setViewportView(WorkRequestTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 81, 778, 169));

        btnAcknowledge.setText("Accept Request");
        btnAcknowledge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcknowledgeActionPerformed(evt);
            }
        });
        add(btnAcknowledge, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 280, 150, -1));

        btnReject.setText("Reject Request");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 280, 150, -1));

        btnCompleteRequest.setText("Complete Request");
        btnCompleteRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteRequestActionPerformed(evt);
            }
        });
        add(btnCompleteRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 280, 150, -1));

        btnProcess.setText("Process Request");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 280, 150, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMERGENCY DOCTOR WORK AREA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 19, 857, 32));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/doctor2.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 880, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcknowledgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcknowledgeActionPerformed
        int count = WorkRequestTable.getSelectedRowCount();
        if(count != 1) {
            JOptionPane.showMessageDialog(null, "Select a request");
        }else {
            int selectedRow = WorkRequestTable.getSelectedRow();
            DoctorWorkRequest emerReq = (DoctorWorkRequest) WorkRequestTable.getValueAt(selectedRow, 0);
            if(emerReq.getStatus().equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Request is already Rejected");
            }else if(emerReq.getStatus().equals("Accepted")) {
                JOptionPane.showMessageDialog(null, "Request is already Accepted");
            }else if(emerReq.getStatus().equals("Processing")) {
                JOptionPane.showMessageDialog(null, "Request is already Processing");
            }else if(emerReq.getStatus().equals("Completed")) {
                JOptionPane.showMessageDialog(null, "Request is already Completed");
            }else if(emerReq.getStatus().equals("Cancelled")) {
                JOptionPane.showMessageDialog(null, "Request is already cancelled by sender");
            }else {
                String msg = JOptionPane.showInputDialog("Additional Message");
                  if(msg != null)
                {
                emerReq.setStatus("Accepted");
                emerReq.setMessage(msg);
                
                }
               populateTable();
            }
            //emerReq.setStatus("Accepted");
        }
    }//GEN-LAST:event_btnAcknowledgeActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        int count = WorkRequestTable.getSelectedRowCount();
        if(count != 1) {
            JOptionPane.showMessageDialog(null, "Select a request");
        }else {
            int selectedRow = WorkRequestTable.getSelectedRow();
            DoctorWorkRequest emerReq = (DoctorWorkRequest) WorkRequestTable.getValueAt(selectedRow, 0);
            if(emerReq.getStatus().equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Request is already Rejected");
            }else if(emerReq.getStatus().equals("Accepted")) {
                JOptionPane.showMessageDialog(null, "Request is already Accepted");
            }else if(emerReq.getStatus().equals("Processing")) {
                JOptionPane.showMessageDialog(null, "Request is already Accepted and Processing");
            }else if(emerReq.getStatus().equals("Completed")) {
                JOptionPane.showMessageDialog(null, "Request is already Completed");
            }else if(emerReq.getStatus().equals("Cancelled")) {
                JOptionPane.showMessageDialog(null, "Request is already cancelled by sender");
            }else {
                String msg = JOptionPane.showInputDialog("Additional Message");
                  if(msg != null)
                {
                emerReq.setStatus("Rejected");
                emerReq.setMessage(msg);
                }
                populateTable();
            }
        }
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnCompleteRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteRequestActionPerformed
        int count = WorkRequestTable.getSelectedRowCount();
        if(count != 1) {
            JOptionPane.showMessageDialog(null, "Select a request");
        }else {
            int selectedRow = WorkRequestTable.getSelectedRow();
            DoctorWorkRequest emerReq = (DoctorWorkRequest) WorkRequestTable.getValueAt(selectedRow, 0);
            if(emerReq.getStatus().equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Request is already Rejected");
            }else if(emerReq.getStatus().equals("Accepted")) {
                JOptionPane.showMessageDialog(null, "Request should be in processing state before marking complete");
            }else if(emerReq.getStatus().equals("Completed")) {
                JOptionPane.showMessageDialog(null, "Request is already Completed");
            }else if(emerReq.getStatus().equals("Cancelled")) {
                JOptionPane.showMessageDialog(null, "Request is already cancelled by sender");
            }else if(emerReq.getStatus().equals("Requested")) {
                JOptionPane.showMessageDialog(null, "Request is not yet Accepted");
            }else {
                String msg = JOptionPane.showInputDialog("Additional Message");
                  if(msg != null)
                {
                emerReq.setStatus("Completed");
                emerReq.setMessage(msg);
                }
                populateTable();
            }
        }
    }//GEN-LAST:event_btnCompleteRequestActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        int count = WorkRequestTable.getSelectedRowCount();
        if (count != 1) {
            JOptionPane.showMessageDialog(null, "Select one row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            int selectedRow = WorkRequestTable.getSelectedRow();
            DoctorWorkRequest emerReq = (DoctorWorkRequest) WorkRequestTable.getValueAt(selectedRow, 0);
            if(emerReq.getStatus().equals("Cancelled")) {
                JOptionPane.showMessageDialog(null, "Request is already cancelled by sender");
            }else if(emerReq.getStatus().equals("Processing")){
                JOptionPane.showMessageDialog(null, "Request is already Processing");
            }else if(emerReq.getStatus().equals("Rejected")){
                JOptionPane.showMessageDialog(null, "Request is already Rejected");
            }else if(emerReq.getStatus().equals("Completed")){
                JOptionPane.showMessageDialog(null, "Request is already Completed");
            }else if(emerReq.getStatus().equals("Requested")) {
                JOptionPane.showMessageDialog(null, "Request is not yet Accepted");
            }else {
                String msg = JOptionPane.showInputDialog("Additional Message");
                  if(msg != null)
                {
                emerReq.setStatus("Processing");
                emerReq.setMessage(msg);
                }
                populateTable();
            }
        }
    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable WorkRequestTable;
    private javax.swing.JButton btnAcknowledge;
    private javax.swing.JButton btnCompleteRequest;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
