/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.DoctorWorkArea;

import business.EcoSystem;
import business.employee.Employee;
import business.enterprise.Enterprise;
import business.medicalEmployment.Doctor;
import business.medicalEmployment.Patient;
import business.network.Network;
//import business.Mail.Mail;
import business.organization.LabOrganization;
import business.organization.Organization;
import business.userAccount.UserAccount;
import business.workQueue.LabTestWorkRequest;
import business.workQueue.LabWorkRequest;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
////import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author sri_sai_nikhil_enni
 */
public class RequestLabTestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestLabTestJPanel
     */
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Patient patient;
    private EcoSystem ecosystem;
    Organization organization;
    Doctor doctor;
    Network network;
    
    public RequestLabTestJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Patient patient,
            Doctor doctor, Organization organization,Network network, EcoSystem business) {
        initComponents();
         this.ecosystem = business;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.patient = patient;
        this.doctor = doctor;
        this.organization = organization;
        this.network = network;
        
        populateTable();

        //valueLabel.setText(enterprise.getName());
        lblDocName.setText(doctor.getDocName());
        lblPatientName.setText( patient.getPatientName());
    }
    
     public void populateTable()
    {
        
         DefaultTableModel model = (DefaultTableModel) tblLabRequest.getModel();
        model.setRowCount(0);
        
         Organization org = null;
       for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())  
       {
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof LabOrganization) {
                    System.out.println(organization.getType());
                    org = organization;
                    break;
                }
            }
       }
        if (org != null) {
            for(WorkRequest wr : org.getWorkQueue().getWorkRequestList())
            {
                if(wr instanceof LabWorkRequest)
                {
                    LabWorkRequest lwr = (LabWorkRequest)wr;
                    if(lwr.getPatient().equals(patient))
                    {
                        Object[] row = new Object[6];
                        row[0] = lwr.getLabTestRequestId();
                        row[1] = lwr.getPatient().getPatientName();
                        row[2] = lwr.getSpecimenType();               
                        row[3] = lwr.getLabTestName();
                        row[4] = lwr.getLabTestAdminFeedback();
                        row[5] = lwr.getRequestdate();

                        model.addRow(row);
                    }
                    
                }
            }
            //userAccount.getWorkQueue().getWorkRequestList().add(request);
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
        tblLabRequest = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblDocName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSpecimenType = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLabTestName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        requestTestJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblLabRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Patient", "Specimen Type", "Lab Test  Name", "Lab Test Feedback", "Request Date"
            }
        ));
        jScrollPane1.setViewportView(tblLabRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 88, 663, 129));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LAB TEST REQUEST PAGE");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, 28));

        jLabel1.setText("Patient Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 247, -1, -1));

        lblPatientName.setText("<Name>");
        add(lblPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 247, 135, -1));

        jLabel2.setText("Doctor Name: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 247, -1, -1));

        lblDocName.setText("<Name>");
        add(lblDocName, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 247, 135, -1));

        jLabel3.setText("Specimen Type :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 296, -1, -1));
        add(txtSpecimenType, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 291, 189, -1));

        jLabel5.setText("Lab Test Name :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 352, -1, -1));
        add(txtLabTestName, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 347, 189, -1));

        jLabel4.setText("Message :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 408, -1, -1));
        add(txtMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 403, 189, -1));

        requestTestJButton.setText("Request Test");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 459, 175, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 459, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/labadmin.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        String message = txtMessage.getText();
        String labTestName = txtLabTestName.getText();
        String labSpecimen = txtSpecimenType.getText();
        // String message = messageJTextField.getText();
//        if (message.equals("") || message.isEmpty() || !message.matches("[a-zA-Z]+")) {
//            JOptionPane.showMessageDialog(null, "Please enter something to send.");
//            return;
//        }

        LabWorkRequest request = new LabWorkRequest();
        request.setMessage(message);
        request.setSender(userAccount);
        request.setLabTestName(labTestName);
        request.setSpecimenType(labSpecimen);
        request.setStatus("Requested");
        request.setPatient(patient);
        request.setDoctor(doctor);
        request.setRequestdate(new Date());
        System.out.println(patient.getPatientName());
        //   patient.getPdr().addRequest(request);

        Organization org = null;
       for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())  
       {
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof LabOrganization) {
                    org = organization;
                    break;
                }
            }
       }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            //userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
        JOptionPane.showMessageDialog(null, "Request message sent");
        populateTable();
        //        String[] to = {"nauka.salot2910@gmail.com", "naukasalot@yahoo.com"};
        //
        //        try {
            //            if (Mail.sendMail("neucare12@gmail.com", "northeastern", "New Test Requested", to)) {
                //                System.out.println("sent");
                //            } else {
                //                System.out.println("serror");
                //            }
            //
            //// TODO add your handling code here:
            //            // TODO add your handling code here:
            //        } catch (MessagingException ex) {
            //            Logger.getLogger(DoctorWorkAreaJPanel2.class.getName()).log(Level.SEVERE, null, ex);
            //        }
        //        JOptionPane.showMessageDialog(this, "Email Sent!");
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        //        userProcessContainer.remove(this);
        //        Component[] componentArray = userProcessContainer.getComponents();
        //        Component component = componentArray[componentArray.length - 1];
        //        DoctorWorkAreaJPanel2 dwajp= (DoctorWorkAreaJPanel2) component;
        //        dwajp.populateTable();
        //        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        //        layout.previous(userProcessContainer);
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;

        //DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel2) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDocName;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTable tblLabRequest;
    private javax.swing.JTextField txtLabTestName;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtSpecimenType;
    // End of variables declaration//GEN-END:variables
}
