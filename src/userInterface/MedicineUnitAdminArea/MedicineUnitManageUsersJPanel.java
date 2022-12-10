/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.MedicineUnitAdminArea;

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
 * @author vaishnaviyadamreddy
 */
public class MedicineUnitManageUsersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MedicineUnitManageUsersJPanel
     */
      private JPanel userContainer;
    private Enterprise enterprise;
    private EcoSystem ecosystem;
    
    public MedicineUnitManageUsersJPanel(JPanel userContainer,Enterprise enterprise,EcoSystem ecosystem) {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        orgJComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        employeeJCombo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        createUserJButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE MEDICINE USERS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 20, 338, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 500, 181));

        jLabel2.setText("Organization");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 296, -1, 24));

        orgJComboBox.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        orgJComboBox.setForeground(new java.awt.Color(25, 56, 82));
        orgJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgJComboBoxActionPerformed(evt);
            }
        });
        add(orgJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 291, 250, 29));

        jLabel5.setText("Employee");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 355, -1, 24));

        employeeJCombo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        employeeJCombo.setForeground(new java.awt.Color(25, 56, 82));
        employeeJCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        employeeJCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeJComboActionPerformed(evt);
            }
        });
        add(employeeJCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 350, 250, 29));

        jLabel3.setText("Role");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 410, 35, 24));

        roleJComboBox.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        roleJComboBox.setForeground(new java.awt.Color(25, 56, 82));
        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleJComboBoxActionPerformed(evt);
            }
        });
        add(roleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 409, 250, 29));

        jLabel6.setText("UserName");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 470, -1, 24));

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 468, 250, 29));

        jLabel4.setText("Password");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 529, -1, 24));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 527, 250, 29));

        createUserJButton.setBackground(new java.awt.Color(255, 255, 255));
        createUserJButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        createUserJButton.setForeground(new java.awt.Color(25, 56, 82));
        createUserJButton.setText("Create");
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });
        add(createUserJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 586, 250, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/medicine.jpg"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 800, 480));
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox orgJComboBox;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables
}
