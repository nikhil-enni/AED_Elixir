/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AccountingUnitAdminArea;

import business.EcoSystem;
import business.employee.Employee;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.role.Role;
import business.userAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ashleshagokhale
 */
public class AccountUnitManageUsersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AccountUnitManageUsersJPanel
     */
    
     private JPanel userContainer;
    private Enterprise enterprise;
    private EcoSystem ecosystem;
    
    public AccountUnitManageUsersJPanel(JPanel userContainer,Enterprise enterprise,EcoSystem ecosystem) {
        initComponents();
        this.enterprise = enterprise;
        this.userContainer = userContainer;
        this.ecosystem = ecosystem;
        populateOrgComboBox();
       // employeeJComboBox.removeAllItems();
        populateData();
    }

    public void populateOrgComboBox(){
       orgJComboBox.removeAllItems();
        for(Organization organization :enterprise.getOrganizationDirectory().getOrganizationList() ){
            orgJComboBox.addItem(organization);
        }
        
    }
    
    public void populateEmployeeComboBox(Organization organization){
         employeeJCombo.removeAllItems();
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            employeeJCombo.addItem(employee);
        }
    }
    
    public void populateRoleComboBox(Organization organization){
        roleJComboBox.removeAllItems();
          for (Role role : organization.getSupportedRole()){
            roleJComboBox.addItem(role);
        }
    }
    
    
    public void populateData(){
        
        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
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

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        orgJComboBox = new javax.swing.JComboBox();
        employeeJCombo = new javax.swing.JComboBox();
        roleJComboBox = new javax.swing.JComboBox();
        createUserJButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userJTable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        userJTable.setForeground(new java.awt.Color(25, 56, 82));
        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userJTable.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(userJTable);
        if (userJTable.getColumnModel().getColumnCount() > 0) {
            userJTable.getColumnModel().getColumn(0).setHeaderValue("User Name");
            userJTable.getColumnModel().getColumn(1).setHeaderValue("Role");
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 93, 500, 179));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE USER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 200, 26));

        jLabel2.setText("Organization:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 308, 116, 24));

        jLabel3.setText("Role:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 395, 116, 24));

        jLabel4.setText("Password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 485, 116, 24));

        jLabel5.setText("Employee:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 70, 24));

        jLabel6.setText("UserName:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 441, 116, 24));

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 440, 228, -1));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 484, 228, -1));

        orgJComboBox.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        orgJComboBox.setForeground(new java.awt.Color(25, 56, 82));
        orgJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgJComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(orgJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 305, 228, -1));

        employeeJCombo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        employeeJCombo.setForeground(new java.awt.Color(25, 56, 82));
        employeeJCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        employeeJCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeJComboActionPerformed(evt);
            }
        });
        jPanel1.add(employeeJCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 350, 228, -1));

        roleJComboBox.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        roleJComboBox.setForeground(new java.awt.Color(25, 56, 82));
        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleJComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(roleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 395, 228, -1));

        createUserJButton.setBackground(new java.awt.Color(255, 255, 255));
        createUserJButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        createUserJButton.setForeground(new java.awt.Color(25, 56, 82));
        createUserJButton.setText("Create");
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(createUserJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 546, 210, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/accounting.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 800, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void orgJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgJComboBoxActionPerformed
        Organization organization = (Organization) orgJComboBox.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_orgJComboBoxActionPerformed

    private void employeeJComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeJComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeJComboActionPerformed

    private void roleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleJComboBoxActionPerformed

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        if(!userName.isEmpty() && !password.isEmpty()){
            Organization organization = (Organization) orgJComboBox.getSelectedItem();
            if(ecosystem.checkIfUserIsUnique(userName)){
                Employee employee = (Employee) employeeJCombo.getSelectedItem();
                Role role = (Role) roleJComboBox.getSelectedItem();
                organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
                populateData();
                JOptionPane.showMessageDialog(null, "User account Created!");
                txtUserName.setText("");
                txtPassword.setText("");
            } else{
                JOptionPane.showMessageDialog(null, "Username already exists!");
            }

        } else{
            JOptionPane.showMessageDialog(null, "Enter all fields!");
        }
    }//GEN-LAST:event_createUserJButtonActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createUserJButton;
    private javax.swing.JComboBox employeeJCombo;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox orgJComboBox;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables
}
