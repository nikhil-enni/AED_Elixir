/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Receptionist;

import business.EcoSystem;
import business.Employee.Employee;
import business.Enterprise.Enterprise;
import business.MedicalEmployment.Doctor;
import business.MedicalEmployment.DoctorList;
import business.MedicalEmployment.PatientList;
import business.Network.Network;
import business.Organization.DoctorOrganization;
import business.Organization.Organization;
import business.Organization.PatientOrganization;
import business.Role.DoctorRole;
import business.Role.EmergencyDoctorRole;
import business.Role.PatientRole;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author amisha03
 */

    

public class CreateDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateDoctorJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecoSystem;
    DoctorList  doctorList;
    Network network;
    Doctor doctor;
    public CreateDoctorJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, DoctorList doctorList, 
            Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem  = ecoSystem;
        this.doctorList = doctorList;
        this.network = network   ;     
        btnUpdate.setVisible(false);
    }
    
    public CreateDoctorJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, DoctorList doctorList, 
            Network network,Doctor doctor) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem  = ecoSystem;
        this.doctorList = doctorList;
        this.network = network   ;   
        this.doctor= doctor;
        jLabel1.setText("Update Doctor");
        populatefield();
        txtDocName.setEditable(false);      
        txtUserName.setEditable(false);
        txtPassword.setEditable(false);
        btnCreate.setVisible(false);
                          
    }

    public void populatefield()
    {
         txtDocName.setText(doctor.getDocName());
      txtQualification.setText(doctor.getQualification());
        txtSpecilization.setText(doctor.getSpecilizationName());
        
    
        chkboxEmeDoc.setSelected(doctor.getEmergencyDoctor());
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
                String UserName = "" ;
                String Password = ""; 
            for(Doctor doctor : doctorList.getDoctorList())
            {
                
                for(UserAccount useraccount : doctorOrg.getUserAccountDirectory().getUserAccountList())
                {
                    if(useraccount.getEmployee().getName().equals(doctor.getDocName()))
                    {
                        UserName = useraccount.getUsername();
                        Password = useraccount.getUsername();
                    }
                }
            }
              txtUserName.setText(UserName);
                txtPassword.setText(Password);
            
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
        txtDocName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtQualification = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSpecilization = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        chkboxEmeDoc = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnUpdate = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE DOCTOR");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 26, 194, 39));

        jLabel2.setText("Doctor Name :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 214, 95, -1));
        jPanel1.add(txtDocName, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 209, 209, -1));

        jLabel3.setText("Qualification :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 275, -1, -1));
        jPanel1.add(txtQualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 265, 209, -1));

        jLabel4.setText("Specilization in :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 326, -1, -1));
        jPanel1.add(txtSpecilization, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 321, 209, -1));

        btnCreate.setText("Create ");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 430, 87, -1));

        jLabel5.setText("User Name :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 100, -1, -1));
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 95, 209, -1));

        jLabel6.setText("Password :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 158, -1, -1));

        jButton2.setText("<< Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 430, 100, -1));

        jLabel7.setText("Emergency Doctor :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 377, -1, -1));
        jPanel1.add(chkboxEmeDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 377, 209, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/business/Images/folder/doctor-clinic-illustration_1270-69.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 6, 134, 117));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 153, 209, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 430, 87, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/doctor2.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 920, 540));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 509));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        String name = txtDocName.getText();
        String qualification = txtQualification.getText();
        String specilization = txtSpecilization.getText();
        String userName = txtUserName.getText();
         char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);
        //String password = txtPassword.getText();
        Boolean emergencyDoc = chkboxEmeDoc.isSelected();
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
         doctorList.addNewDoctor(name,qualification,specilization,emergencyDoc);
        Employee employee = ecoSystem.getEmployeeDirectory().createEmployee(name);
        if(emergencyDoc)
        {
            UserAccount usserAccount = doctorOrg.getUserAccountDirectory().createUserAccount(userName, password, employee, new EmergencyDoctorRole());
        }
        else
        {
            
            UserAccount usserAccount = doctorOrg.getUserAccountDirectory().createUserAccount(userName, password, employee, new DoctorRole());
        }

        JOptionPane.showMessageDialog(null, "Doctor Profile Created");
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PatientListJPanel mcjp = (PatientListJPanel) component;
        mcjp.populateDocTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
       // String name = txtDocName.getText();
        String qualification = txtQualification.getText();
        String specilization = txtSpecilization.getText();
     //   String userName = txtUserName.getText();
      //   char[] passwordCharArray = txtPassword.getPassword();
      //  String password = String.valueOf(passwordCharArray);
        //String password = txtPassword.getText();
        Boolean emergencyDoc = chkboxEmeDoc.isSelected();
        doctor.setEmergencyDoctor(emergencyDoc);
        doctor.setQualification(qualification);
        doctor.setSpecilizationName(specilization);
      

        JOptionPane.showMessageDialog(null, "Doctor Profile Update");
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox chkboxEmeDoc;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDocName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtQualification;
    private javax.swing.JTextField txtSpecilization;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
