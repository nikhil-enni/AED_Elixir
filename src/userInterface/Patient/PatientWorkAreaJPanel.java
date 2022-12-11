/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.Patient;
import org.apache.log4j.Logger;
import business.EcoSystem;
import business.enterprise.EmergencyUnit;
import business.enterprise.Enterprise;
import static business.enterprise.Enterprise.EnterpriseType.ManagementUnit;
import business.enterprise.ManagementUnit;
import business.medicalEmployment.Doctor;
import business.medicalEmployment.Patient;
import business.medicalEmployment.PatientList;
import business.network.Network;
import business.organization.DoctorOrganization;
import business.organization.EmergencyOrganization;
import business.organization.LabOrganization;
import business.organization.Organization;
import business.organization.PatientOrganization;
import business.userAccount.UserAccount;
import business.workQueue.DoctorCheckUpWorkRequest;
import business.workQueue.EmergencyPatientRequest;
import business.workQueue.LabWorkRequest;
import business.workQueue.WorkRequest;

import com.toedter.calendar.JDateChooser;
import java.util.Date;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author amisha03
 */
public class PatientWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientWorkArea
     */
     private EcoSystem ecoSystem;
     private JPanel userProcessContainer;
     private UserAccount userAccount;
     PatientList patientList;
     Patient patient;
     EmergencyPatientRequest emergencyRequest;
     Network network;
     Organization organization;
     Enterprise enterprise;
    private static Logger log = Logger.getLogger(PatientWorkAreaJPanel.class);
    private static final String CLASS_NAME = PatientWorkAreaJPanel.class.getName();
     
    public PatientWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,EcoSystem ecoSystem, Network network,
            Organization organization,Enterprise enterprise) {
        initComponents();
        this.ecoSystem =ecoSystem;
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.userAccount = account;
        this.patientList = ecoSystem.getPatientDirectory();
        this.organization = organization;
        
        for(Network netwrk : ecoSystem.getNetworkList())
        {
            for( Enterprise enprise : netwrk.getEnterpriseDirectory().getEnterpriseList())
            {
                if(enprise instanceof ManagementUnit)
                {
                     this.enterprise = enprise;
                }

            }
        }
        
         for( Patient patient :  ecoSystem.getPatientDirectory().getPatientList())
        {
            if(patient.getPatientName().equals(userAccount.getEmployee().getName()))
            {
                this.patient = patient;
            }
        }   
        
        populatePatientFields();
        //valueLabel.setText(account.getEmployee().getName());
        //populateRequestTable();
        populateRequestTable();
        populateRequestCheckupTable();
        populateTable();
    }
    
     public void populatePatientFields()
    {
      log.info("Info for populatePatientFields");
//        DefaultTableModel ordModel = (DefaultTableModel) workRequestJTable.getModel();
//                    ordModel.setRowCount(0);
        for( Patient patient :  ecoSystem.getPatientDirectory().getPatientList())
        {
            if(patient.getPatientName().equals(userAccount.getEmployee().getName()))
            {
                lblName.setText(patient.getPatientName());
                txtpatientname.setText(patient.getPatientName());
                txtage.setText(String.valueOf(patient.getAge()));
                txtEmailAdd.setText(patient.getEmailAddress());
               // txtbloodgroup.setText(patient.getBloodGrp());
                txtPhoneNum.setText(patient.getPhoneNumber());
               // txtgender.setText(patient.getGender());
                txtAddress.setText(patient.getAddress());
                txtPatientId.setText(String.valueOf(patient.getPatientId()));
                txtAssigDoc.setText(patient.getDoctor());
               // txtgender.setText(patient.getGender());
                txtLocation.setText(patient.getLocation());
                cbGender.setSelectedItem(patient.getGender());
                cbBloodGrp.setSelectedItem(patient.getBloodGrp());
                
            }
            
        }
        
        Organization patientOrg = null;
        for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
        {
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
               if (organization instanceof PatientOrganization) {

                   patientOrg = organization;
                   break;
               }
           }
        }
        String UserName = "";
        String Password ="";
                
        for(UserAccount useraccount : patientOrg.getUserAccountDirectory().getUserAccountList())
            {
                if(useraccount.getEmployee().getName().equals(patient.getPatientName()))
                {
                    System.out.println(useraccount);
                    UserName = useraccount.getUsername();
                    Password = useraccount.getUsername();
                }
            }
           txtUserName.setText(UserName);
                txtPassword.setText(Password);
    }
     
       public void populateTable()
    {
        
         DefaultTableModel model = (DefaultTableModel) tblEmerReq1.getModel();
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
                        row[1] = lwr.getSpecimenType();  
                        row[2] = lwr.getLabTestName();          
                        row[3] = lwr.getLabTestAdminFeedback();
                        row[4] = lwr.getRequestdate();
                        row[5] = lwr.getStatus();

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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        txtpatientname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPhoneNum = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEmailAdd = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtAssigDoc = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        cbBloodGrp = new javax.swing.JComboBox<>();
        cbGender = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSOS = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitalSign = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmerReq = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnCreateCheckupReq = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEmerReq1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        jSplitPane1.setDividerLocation(300);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtpatientname, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 180, 154, -1));

        jLabel2.setText("Patient Name :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 185, -1, -1));

        jLabel6.setText("Patient Gender :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 228, -1, -1));

        jLabel7.setText("Blood Group :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 273, -1, -1));

        jLabel8.setText("Patient Age :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 319, -1, -1));

        txtage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtageActionPerformed(evt);
            }
        });
        jPanel1.add(txtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 314, 154, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Hi..");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        lblName.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/patient1.png"))); // NOI18N
        lblName.setText("<Name>");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 6, 300, 850));

        jLabel16.setText("Patient Id :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 141, -1, -1));

        txtPatientId.setEditable(false);
        jPanel1.add(txtPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 136, 151, -1));

        jLabel9.setText("Phone Number :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 363, -1, -1));
        jPanel1.add(txtPhoneNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 358, 154, -1));

        jLabel10.setText("Email Address :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 407, 77, -1));
        jPanel1.add(txtEmailAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 402, 154, -1));

        jLabel11.setText("Patient Address :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 451, 84, -1));
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 446, 154, -1));

        btnUpdate.setText("Update ");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 635, 146, -1));

        jLabel12.setText("Assgined Doctor :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 539, -1, -1));

        txtAssigDoc.setEditable(false);
        jPanel1.add(txtAssigDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 534, 153, -1));

        jLabel14.setText("Location :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 495, -1, -1));
        jPanel1.add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 490, 153, -1));

        jButton2.setText("Update Location");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 588, -1, -1));

        txtUserName.setEditable(false);
        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserNameFocusLost(evt);
            }
        });
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 48, 151, -1));

        jLabel15.setText("User Name :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 53, -1, 17));

        txtPassword.setEditable(false);
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 92, 151, -1));

        jLabel17.setText("Password :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 97, -1, -1));

        cbBloodGrp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jPanel1.add(cbBloodGrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 269, 154, -1));

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Female" }));
        cbGender.setToolTipText("");
        jPanel1.add(cbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 224, 154, -1));

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 8)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 0, 51));
        jLabel18.setText("Location will help up to reach you in emergency time");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 572, -1, -1));
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 6, 80, 30));

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Checkup History");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 6, 161, 26));

        btnSOS.setBackground(new java.awt.Color(255, 51, 51));
        btnSOS.setText("SOS");
        btnSOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSOSActionPerformed(evt);
            }
        });
        jPanel2.add(btnSOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 540, 42));

        tblVitalSign.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Heart Rate", "Blood Pressure", "Respiratory Rate", "Weight", "Appointment Date", "Checkup Date", "Doctor"
            }
        ));
        jScrollPane1.setViewportView(tblVitalSign);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 38, 540, 100));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Emeregency Request History");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 209, 26));

        tblEmerReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Request iD", "Request Date", "Status", "Treatment Date"
            }
        ));
        jScrollPane2.setViewportView(tblEmerReq);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 540, 100));

        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("For Emergency Please click below button, Emeregency Request automatically created");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 461, -1));

        btnCreateCheckupReq.setBackground(new java.awt.Color(0, 153, 153));
        btnCreateCheckupReq.setText("Create Appoinment for Checkup Request");
        btnCreateCheckupReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCheckupReqActionPerformed(evt);
            }
        });
        jPanel2.add(btnCreateCheckupReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 163, 540, -1));

        tblEmerReq1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request iD", "Specimen Type", "Lab Test Name", "Test Feedback", "Request Date", "Status"
            }
        ));
        jScrollPane3.setViewportView(tblEmerReq1);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 540, 118));

        jLabel13.setText("Lab Test Request Table");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/doctor1.png"))); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 630, 860));

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSOSActionPerformed
        // TODO add your handling code here:
        Organization Emeorg = null;
       for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())  
       {
         for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
             if(organization instanceof EmergencyOrganization)
             {
                    Emeorg = organization;
                    break;
                }
            }
       }
       
        for (WorkRequest wr : Emeorg.getWorkQueue().getWorkRequestList()) {
            if(wr instanceof EmergencyPatientRequest) {
                
                    EmergencyPatientRequest epr = (EmergencyPatientRequest)wr;
                    if(epr.getPatient().equals(patient) && !epr.getStatus().equals("Completed"))
                    {
                         JOptionPane.showMessageDialog(null, "SOS Request already created and Emergency Team will be there in few minutes.");
                         return;
                    }
            }
        }





        


        emergencyRequest = new EmergencyPatientRequest();
        emergencyRequest.setPatient(patient);
        emergencyRequest.setRecieverNetwork(network);
        emergencyRequest.setSenderNetwork(network);
        emergencyRequest.setRequestdate(new Date());
        emergencyRequest.setStatus("Requested");
        emergencyRequest.setCriticality("High");
        emergencyRequest.setSender(userAccount);
          
        
        emergencyRequest.setRecieverOrganization(Emeorg);
         for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
             if(organization instanceof PatientOrganization)
             {
                   emergencyRequest.setSenderOrganization(organization); 
                    break;
                }
            }
        
        Emeorg.getWorkQueue().addWorkRequest(emergencyRequest);
        JOptionPane.showMessageDialog(null, "SOS Request has created and Emergency Team will be there in few minutes.");
        System.out.println(emergencyRequest.getEmergencyRequestId());
        populateRequestTable();
        
         
    }//GEN-LAST:event_btnSOSActionPerformed

    public void populateRequestTable()
     {
          DefaultTableModel ordModel = (DefaultTableModel) tblEmerReq.getModel();
                    ordModel.setRowCount(0);
       for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
       {
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) 
          {
        
            for(WorkRequest workrequest :  organization.getWorkQueue().getWorkRequestList())  
            {
                if(organization instanceof EmergencyOrganization)
                {
                    
                    EmergencyPatientRequest epr = (EmergencyPatientRequest)workrequest;
                    if(epr.getPatient() == patient)
                    {

                          Object [] row = new Object[4];
                                row[0] = epr.getEmergencyRequestId();
                                row[1] = epr.getRequestdate();
                                row[2] = epr.getStatus();
                                row[3] = epr.getResolveDate();
                                ordModel.addRow(row);
                    }
                }
            }
         }
       }
            
                    
         
     }
    
    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageActionPerformed

    private void btnCreateCheckupReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCheckupReqActionPerformed
        // TODO add your handling code here:
        
        
        JDateChooser jd = new JDateChooser();
        jd.setMinSelectableDate(new Date());
     //   jd.setMaxSelectableDate(new Date().);
        //new Date().
        Date referenceDate = new Date();
        Calendar c = Calendar.getInstance(); 
        c.setTime(referenceDate); 
        c.add(Calendar.MONTH, 3);
        System.out.println("C.gettime "+ c.getTime());
        jd.setMaxSelectableDate(c.getTime());
//return c.getTime()
        
        String message ="Choose Appointment date:\n";
        Object[] params = {message,jd};
        JOptionPane.showConfirmDialog(null,params,"Start date", JOptionPane.PLAIN_MESSAGE);
        
        
                String s="";
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        JDateChooser date =(JDateChooser)params[1];//Casting params[1] makes me able to get its information
        System.out.println(date.getDate());
        
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
        
        String docterName = txtAssigDoc.getText();
                     
         for(Doctor doc : ecoSystem.getDoctroDirectory().getDoctorList())
        {
           if(doc.getDocName().equals(docterName))
           {
               for(UserAccount ua : doctorOrg.getUserAccountDirectory().getUserAccountList())
               {
                   if(ua.getEmployee().getName().equals(docterName))
                   {  
                       System.out.println("Apppoint date "+ date);
                        DoctorCheckUpWorkRequest cur = new DoctorCheckUpWorkRequest() ;
                        cur.setDoctor(doc);
                        cur.setSender(userAccount);
                        cur.setReceiver(ua);
                        cur.setPatient(patient);
                        cur.setStatus("Request"); 
                        cur.setRequestdate(date.getDate());
                        cur.setSenderNetwork(network);
                        cur.setSenderOrganization(organization);
                        cur.setRecieverNetwork(network);
                        cur.setRecieverOrganization(organization);
                        ua.getWorkQueue().addWorkRequest(cur);
                         JOptionPane.showMessageDialog(null, "Check up Request created");
                   }   
               }
           }
        }
         
         
         populateRequestCheckupTable();
        
        
        //JOptionPane.showMessageDialog(null,"Donor details added1");
        //  wr.setTestResult(result);
//        cur.getCheckUp().setRespiratoryRate(rr);
//        cur.getCheckUp().setBloodPressure(bp);
//        cur.getCheckUp().setHeartRate(hr);
//        cur.getCheckUp().setWeight(weight);
//        cur.getCheckUp().setDate(new Date());

        
    }//GEN-LAST:event_btnCreateCheckupReqActionPerformed

    public void populateRequestCheckupTable()
    {
        System.out.println("PopulateCheck table");
        DefaultTableModel ordModel = (DefaultTableModel) tblEmerReq1.getModel();
        ordModel.setRowCount(0);
         DefaultTableModel vitalModel = (DefaultTableModel) tblVitalSign.getModel();
        vitalModel.setRowCount(0);
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

          //  for(Doctor doc : ecoSystem.getDoctroDirectory().getDoctorList())
    //    {
         //  System.out.println("DOC " +doc.getDocName());
               for(UserAccount ua : doctorOrg.getUserAccountDirectory().getUserAccountList())
               {
                    System.out.println("UA-" +ua.getUsername());
                   for(WorkRequest wr : ua.getWorkQueue().getWorkRequestList())
                   {  
                       System.out.println("wr-"+wr);
                        if(wr instanceof DoctorCheckUpWorkRequest)
                        {
                            DoctorCheckUpWorkRequest epr = (DoctorCheckUpWorkRequest)wr;
                            if(epr.getPatient() == patient)
                            {
                                System.out.println("For loop Table row added");

//                                                                   
                                        if(epr.getCheckUp() != null)
                                        {
                                            Object [] row2 = new Object[8];
                                                    row2[0] = epr.getCheckupRequestId();
                                                    row2[1] = epr.getCheckUp().getHeartRate() ;
                                                    row2[2] = epr.getCheckUp().getBloodPressure();
                                                    row2[3] = epr.getCheckUp().getRespiratoryRate();
                                                    row2[4] =  epr.getCheckUp().getWeight();
                                                    row2[5] = epr.getRequestdate();
                                                    row2[6] = epr.getCheckUp().getDate();
                                                    row2[7] = epr.getDoctor().getDocName();
                                                    vitalModel.addRow(row2);
                                        }
                            }
                        }
                
                   }
                }
           
    //    }
                    
                    
                    
                    
                    
//        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) 
//            {
//                 if(organization instanceof DoctorOrganization)
//                {     
//            for(WorkRequest workrequest :  organization.getWorkQueue().getWorkRequestList())  
//            {
//               
//                    
//                    DoctorCheckUpWorkRequest epr = (DoctorCheckUpWorkRequest)workrequest;
//                    if(epr.getPatient() == patient)
//                    {
//
//                          Object [] row = new Object[3];
//                                row[0] = epr.getCheckupRequestId();
//                                row[1] = epr.getRequestdate();
//                                row[2] = epr.getStatus();
//                                ordModel.addRow(row);
//                    }
//                }
//            }
//        }
    }
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
//        if(txtpatientname.getText().isEmpty() ||  txtEmailAdd.getText().isEmpty() ||
//            txtPhoneNum.getText().isEmpty() || 
//            txtAddress.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "First Name, Email address , User Name, Password,  Phone number  and Address Fields cannot be left empty");
//            return;
//        }

        boolean flag ;

        String email = txtEmailAdd.getText();

        flag = email.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");

        if(!flag) {
            JOptionPane.showMessageDialog(null, "Email Address must be in format of X@Y.Z");
            return;
        }

        for(Patient patient : ecoSystem.getPatientDirectory().getPatientList()) {
            if(patient != patient)
            {
                if(patient.getEmailAddress().equals(email))
                {
                    JOptionPane.showMessageDialog(null, "Email Address already exists");
                }
            }
        }

        String phoneNumber = txtPhoneNum.getText();

        if(phoneNumber.length() != 10) {
            JOptionPane.showMessageDialog(null, "PhoneNumber must be of 10 digits");
            return;
        }

        flag = phoneNumber.matches("^[0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "Phone Number must have digits only");
            return;
        }
        for(Patient patient : patientList.getPatientList()) {
            if(patient != patient)
            {
                if(patient.getPhoneNumber().equals(phoneNumber)) {
                    JOptionPane.showMessageDialog(null, "Phone Number already exists");
                }
            }
        }

        int age = 0;

        try {

            if(!txtage.getText().isEmpty())
            {
                age = Integer.parseInt(txtage.getText());
            }

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Age must have integers only");
            return;
        }

        String firstname = txtpatientname.getText() ;
        // String email = txtEmailAdd.getText();
        String phone = txtPhoneNum.getText();
        String address = txtAddress.getText();
        // String age = txtAge.getText();
       // String userName= txtUserName.getText();
       // String password = txtPassword.getText();
      

        patient.setPatientName(firstname);
        patient.setEmailAddress(email);
        patient.setPhoneNumber(phone);
        patient.setAge(age);
        patient.setAddress(address);
       

        JOptionPane.showMessageDialog(null, "Patient Profile Updated");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        PatientLocationMap createPatient = new PatientLocationMap(userProcessContainer);
        userProcessContainer.add("CreatePatientJPanel",createPatient);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtUserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusLost
        // TODO add your handling code here:
        if(txtUserName.getText().isEmpty())
        {
            return;
        }
        String userName = txtUserName.getText();
        for(UserAccount account : ecoSystem.getUserAccountDirectory().getUserAccountList()) {
            if(account.getUsername().equals(userName)) {
                JOptionPane.showMessageDialog(null, "Username Already exists");
                txtUserName.setText(null);
                return;
            }
        }
    }//GEN-LAST:event_txtUserNameFocusLost

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed
    public void ppopulateLongituteLatitude(String locationPoint)
       {
           txtLocation.setText(locationPoint);
       }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateCheckupReq;
    private javax.swing.JButton btnSOS;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbBloodGrp;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblEmerReq;
    private javax.swing.JTable tblEmerReq1;
    private javax.swing.JTable tblVitalSign;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAssigDoc;
    private javax.swing.JTextField txtEmailAdd;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPhoneNum;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtpatientname;
    // End of variables declaration//GEN-END:variables
}
