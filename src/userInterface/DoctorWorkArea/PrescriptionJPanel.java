/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorWorkArea;
import Business.Medicine.Prescription;
import Business.Medicine.PrescriptionList;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.MedicalEmployment.Doctor;
import Business.MedicalEmployment.Patient;
import Business.Medicine.Medicine;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.MedicineOrganization;

import Business.Organization.Organization;
/////import Business.Organization.PharmacyOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorWorkRequest;
//import Business.WorkQueue.PharmacyWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
/**
 *
 * @author sri_sai_nikhil_enni
 */
public class PrescriptionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PrescriptionJPanel
     */
      private Organization organization;
    private Enterprise enterprise;

    private UserAccount userAccount;
    private JPanel userProcessContainer;
    //private Prescription prescription;
    private DoctorWorkRequest docreq;
    private Network network;
    private EcoSystem system;
    private static Logger log = Logger.getLogger(PrescriptionJPanel.class);
    private static final String CLASS_NAME = PrescriptionJPanel.class.getName();
    private static final String filePath = "./prescription data.txt";
    private Patient patient;
    private Doctor doctor;
    public PrescriptionJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, 
            Organization organization, 
            EcoSystem system, Network network,Patient patient,Doctor doctor) {
        initComponents();
         this.doctor = doctor;
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.organization = organization;
        this.network = network;
        this.system = system;
        this.patient = patient;
        
        //populateWorkRequestTable();
        DateChooser.setMinSelectableDate(new Date());
        populatefields();
        populateMedicineCmb();
        //populateWorkRequestTable();
    }
    
    public void populatefields()
    {
        txtName.setText(patient.getPatientName());
        txtAge.setText(String.valueOf(patient.getAge()));
        txtGender.setText(patient.getGender());
    }

    public void populateMedicineCmb()
    {
        cbMedicine.removeAllItems();
        cbMedicine.addItem("Select");
        for(Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList())
        {
            for(Organization org : enter.getOrganizationDirectory().getOrganizationList())
            {
                if(org instanceof MedicineOrganization)
                {
                    MedicineOrganization medOrg = (MedicineOrganization) org;
                    for(Medicine med : medOrg.getMedList())
                    {
                        cbMedicine.addItem(med.getMedicineName());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbMedicine = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        noofTimesTxt = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        noofDaysTxt = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        prescriptionJTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("DOCTOR PRESCRIPTION");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 17, 312, 40));

        jLabel2.setText("Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 90, -1, -1));

        txtName.setEditable(false);
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 85, 167, -1));

        jLabel3.setText("Age:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 146, -1, -1));

        txtAge.setEditable(false);
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 141, 167, -1));

        jLabel4.setText("Gender");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 202, -1, -1));

        txtGender.setEditable(false);
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 197, 167, -1));

        jLabel5.setText("Medicine:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 257, -1, -1));

        cbMedicine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cbMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 253, 167, -1));

        jLabel6.setText("Times a Day:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 315, -1, -1));
        add(noofTimesTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 310, 167, -1));

        jLabel7.setText("For:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 371, -1, -1));
        add(noofDaysTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 366, 167, -1));

        jButton1.setText("Add to Prescription");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 267, -1));

        jLabel8.setText("Date: ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 422, -1, -1));

        prescriptionJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Medicine", "No of Times", "Days"
            }
        ));
        jScrollPane1.setViewportView(prescriptionJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 557, 560, 139));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 190, -1));

        jButton2.setText("Send Prescription To Customer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 230, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        log.debug("going back to Doctors work area");
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         Prescription p = new Prescription();
       // p.setDaignosis(diagnosisComboBox.getSelectedItem().toString());
        p.setMedicineName(cbMedicine.getSelectedItem().toString());
        p.setNoofTimesInaday((Integer) noofTimesTxt.getValue());
        p.setTotalDays((Integer) noofDaysTxt.getValue());
        p.setNetworkName(network.getName());
        
        
        
//        String age = ageTxtField.getText();
        boolean flag = true;
        try {
           // Integer.parseInt(age);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Age must be integer!");
            flag = false;
            return;
        }

       // if (p.getDaignosis().equals("")) {
           // JOptionPane.showMessageDialog(null, "Please enter the daignosis!");
          //  flag = false;
          //  return;
        //} else 
//        if (nameTxtField.getText().equals("")) {
//            JOptionPane.showMessageDialog(null, "Please enter the patient name!");
//            flag = false;
//            return;
//
//        }
         if(((Integer) noofTimesTxt.getValue())==0|| ((Integer) noofDaysTxt.getValue())==0)
                {
                     JOptionPane.showMessageDialog(null, "Please enter the no of days or no times !");
             flag = false;
             return;
                }
         if(DateChooser.getDate()==null)
         {
             JOptionPane.showMessageDialog(null, "Please select the date !");
             flag = false;
             return;
         }
         System.out.println("cbMedicine.getSelectedIndex() "+  cbMedicine.getSelectedIndex());
         if(cbMedicine.getSelectedIndex()<=0)
         {
             JOptionPane.showMessageDialog(null, "Please select the Medication Name !");
             flag = false;
         }
//         if(sexcomboBox.getSelectedIndex()<=0)
//         {
//          JOptionPane.showMessageDialog(null, "Please select the Medication Name !");
//             flag = false;   
//             return;
//         }

        
        if (flag == true) {
            
            
            patient.getPrescriptionlist().addPrescription(p);

//            PharmacyWorkRequest request = new PharmacyWorkRequest();
//
//            request.setMedicationName(medicationCombobox.getSelectedItem().toString());
//            request.setQuantity(((Integer) noofTimesTxt.getValue()) * ((Integer) noofDaysTxt.getValue()));
//            request.setSender(userAccount);
//            request.setStatus("Sent");
//            System.out.println(request.getMedicationName());
//            JOptionPane.showMessageDialog(null, "Prescription added successfully");
//
//            System.out.println("****" + enterprise.getName());
//            Organization org = null;
//
//                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
//                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
//                        if (organization instanceof PharmacyOrganization) {
//                            org = organization;
//                            System.out.println("****" + org);
//                            log.debug(org);
//                            log.debug("Current Enterprise\t" +enterprise);
//                               log.debug("Current Organization\t" +org);
//                               log.debug("Current Network\t" +network);
//                            break;
//                        }
//                    }
//                }
//            
//            if (org != null) {
//
//                org.getWorkQueue().getWorkRequestList().add(request);
//                userAccount.getWorkQueue().getWorkRequestList().add(request);
//                log.debug("request sent to Pharmacy");
//            }
            
           

            populateWorkRequestTable();
            saveRecord(p.getNetworkName(),p.getDaignosis(),p.getMedicineName(),p.getNoofTimesInaday(),p.getTotalDays());
           // txtName.setText("");
           // ageTxtField.setText("");
             noofTimesTxt.setValue(0);
             noofDaysTxt.setValue(0);
           //  sexcomboBox.setSelectedIndex(0);
             cbMedicine.setSelectedIndex(0);
            
        }

        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void populateWorkRequestTable() {

        DefaultTableModel model = (DefaultTableModel) prescriptionJTable.getModel();

        model.setRowCount(0);

        for (Prescription prescription : patient.getPrescriptionlist().getPrescriptionList()) {
           
                Object[] row = new Object[5];
                row[0] = prescription.getMedicineName();
                row[1] = prescription.getNoofTimesInaday();
                row[2] = prescription.getTotalDays();         
                model.addRow(row);
        }

    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        log.info("Prescritopn Send to Customer");
        String prescrip ="";
        for (Prescription prescription : patient.getPrescriptionlist().getPrescriptionList()) {
           
               
               prescrip += "Medicine Name : "+prescription.getMedicineName();
               prescrip += ", No of times a Day : " + prescription.getNoofTimesInaday();
              prescrip  += ", No of Days" + prescription.getTotalDays();         
            
        }
        
        SendEmail(patient.getEmailAddress(),prescrip);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    public void saveRecord(String network,String disease,String medicine,int times, int days){
        try {
            FileWriter file = new FileWriter(filePath,true);
            BufferedWriter bw = new BufferedWriter(file);
            PrintWriter pw = new PrintWriter(bw);
            pw.println("Medicine Name - " + medicine+", No of Times "+times + ", No of Days"+days);
            pw.flush();
            pw.close();
            log.debug("saving prescription details to prescription data.txt");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(PrescriptionJPanel.class.getName()).log(Level.SEVERE, null, ex);
            log.error("prescription data.txt" +ex);
           
        }
        
    }
    
    public void SendEmail(String emailAddress, String Prescription)
    {
        System.out.println("Inside Email ");
         String to = emailAddress;
        String from = "donotreplymedicalemergency@gmail.com";
        String pass = "Password@123";
// Assuming you are sending email from localhost
// String host = "192.168.0.16";

// Get system properties
        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";

        properties.put("mail.smtp.starttls.enable", "true");

        properties.put("mail.smtp.ssl.trust", host);
        properties.put("mail.smtp.user", from);
// properties.put("mail.smtp.password", pass);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");

// Setup mail server
// properties.setProperty("mail.smtp.host", host);
// properties.put("mail.smtp.starttls.enable", "true");
// Get the default Session object.
        Session session = Session.getDefaultInstance(properties);

        try {
// Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

// Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

// Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            String htmlText = ("<div style=\"color:red;\">BRIDGEYE</div>");
            message.setContent(htmlText, "text/html");

// Set Subject: header field
            message.setSubject("Patient Registration");
            
            
            String msg = "Doctor Prescription - ";
            msg += Prescription;
                    
// String text= "<table><tr><td>EmpId</td><td>Emp name</td><td>age</td></tr><tr><td>value</td><td>value</td><td>value</td></tr></table>";
            message.setText(msg);
// Send message
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
                JOptionPane.showMessageDialog(null,"Sent message successfully....");
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Invalid email id");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cbMedicine;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner noofDaysTxt;
    private javax.swing.JSpinner noofTimesTxt;
    private javax.swing.JTable prescriptionJTable;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
