/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.MedicalEmployment.PatientList;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.log4j.Logger;

/**
 *
 * @author ashleshagokhale
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private UserAccount userAccount;
    private JPanel userProcessContainer;
    private PatientList patientList;
      private static Logger log = Logger.getLogger(MainJFrame2.class);
    private static final String CLASS_NAME = MainJFrame2.class.getName();
    
    public MainJFrame() {
        initComponents();
         system = dB4OUtil.retrieveSystem();
      
         setBounds(200,20,1150,800);
        patientList = new PatientList();
        loginJPanel.setVisible(true);
        container.setVisible(false);
        leftPanel.setVisible(false);
//        logoutbtn2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        loginJPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginJButton = new javax.swing.JButton();
        logoutJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        leftPanel = new javax.swing.JPanel();
        logoutbtn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        container.setBackground(new java.awt.Color(0, 153, 153));
        container.setToolTipText("");
        container.setLayout(new java.awt.CardLayout());

        loginJPanel.setBackground(new java.awt.Color(41, 113, 103));
        loginJPanel.setPreferredSize(new java.awt.Dimension(1000, 900));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/usergreen.png"))); // NOI18N

        loginJButton.setBackground(new java.awt.Color(0, 153, 153));
        loginJButton.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        loginJButton.setForeground(new java.awt.Color(255, 255, 255));
        loginJButton.setText("LOGIN");
        loginJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 149, 118), 3));
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        logoutJButton.setBackground(new java.awt.Color(0, 153, 153));
        logoutJButton.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        logoutJButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutJButton.setText("LOGOUT");
        logoutJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 149, 118), 3));
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/user.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        userNameJTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 149, 118), 3));
        userNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameJTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/password.png"))); // NOI18N

        passwordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 149, 118), 3));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout loginJPanelLayout = new javax.swing.GroupLayout(loginJPanel);
        loginJPanel.setLayout(loginJPanelLayout);
        loginJPanelLayout.setHorizontalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addGap(435, 435, 435)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(593, Short.MAX_VALUE))
        );
        loginJPanelLayout.setVerticalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        leftPanel.setBackground(new java.awt.Color(0, 153, 153));

        logoutbtn2.setBackground(new java.awt.Color(41, 113, 103));
        logoutbtn2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        logoutbtn2.setForeground(new java.awt.Color(255, 255, 255));
        logoutbtn2.setText("LOGOUT");
        logoutbtn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 149, 118), 3));
        logoutbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addContainerGap(904, Short.MAX_VALUE)
                .addComponent(logoutbtn2)
                .addGap(387, 387, 387))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(logoutbtn2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(loginJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTextFieldActionPerformed

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // TODO add your handling code here:
        // Get user name
        String userName = userNameJTextField.getText();
        // Get Password
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);
        
        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount=system.getUserAccountDirectory().authenticateUser(userName, password);
        
       // Enterprise inEnterprise=null;
        Organization inOrganization=null;
        Enterprise inEnterprise = null;
        Network inNetwork = null;
        
        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Network network:system.getNetworkList()){
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if(userAccount==null){
                       //Step 3:check against each organization for each enterprise
                       for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                           userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                           if(userAccount!=null){
                               inEnterprise=enterprise;
                               inOrganization=organization;
                               inNetwork = network;
                               break;
                           }
                       }
                        
                    }
                    else{
                       inEnterprise=enterprise;
                       inNetwork = network;
                       break;
                    }
                    if(inOrganization!=null){
                        break;
                    }  
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }
//        
        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            CardLayout layout=(CardLayout)container.getLayout();
            log.info("User " + userName +" Successfully login ");
             log.debug("User " + userName +" Successfully login ");
             
            container.add("workArea",userAccount.getRole().createWorkArea(container, userAccount, inOrganization,inEnterprise,inNetwork, system));
            layout.next(container);
            loginJButton.setEnabled(false);
            loginJPanel.setVisible(false);
            container.setVisible(true);
            leftPanel.setVisible(true);
            logoutJButton.setEnabled(true);
            userNameJTextField.setEnabled(false);
            passwordField.setEnabled(false);
        }
//        
//        
            
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        // TODO add your handling code here:
       // logoutJButton.setEnabled(false);
        //userNameJTextField.setEnabled(true);
       // passwordField.setEnabled(true);
        //loginJButton.setEnabled(true);

        userNameJTextField.setText("");
        passwordField.setText("");

        //container.removeAll();
       // JPanel blankJP = new JPanel();
        //container con = new Container()
        //container.add("blank", jPanel2);
       // CardLayout crdLyt = (CardLayout) container.getLayout();
       // crdLyt.next(container);
      //  dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void logoutbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtn2ActionPerformed
        // TODO add your handling code here:
        //logoutbtn2
        container.removeAll();
        logoutJButton.setEnabled(false);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);
        
        loginJPanel.setVisible(true);
        container.setVisible(false);
        leftPanel.setVisible(false);
        passwordField.setVisible(true);
        logoutJButton.setEnabled(true);
        
        userNameJTextField.setText("");
        passwordField.setText("");

        
//        JPanel blankJP = new JPanel();
        //container con = new Container()
//        container.add("blank", jPanel2);
//        CardLayout crdLyt = (CardLayout) container.getLayout();
//        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutbtn2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton loginJButton;
    private javax.swing.JPanel loginJPanel;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JButton logoutbtn2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
