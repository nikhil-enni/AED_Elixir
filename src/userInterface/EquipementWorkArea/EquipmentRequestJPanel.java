/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.EquipementWorkArea;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.equipment.Equipment;
import business.network.Network;
import business.organization.BillingOrganization;
import business.organization.EmergencyOrganization;
import business.organization.EquipmentOrganization;
import business.organization.Organization;
import business.organization.PatientOrganization;
import business.userAccount.UserAccount;
import business.workQueue.BillingWorkRequest;
import business.workQueue.EmergencyPatientRequest;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author amisha03
 */
public class EquipmentRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EquipmentRequestJPanel
     */
     JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem ecosystem;
    Network network;
    UserAccount userAccount;
    Organization organization;
    public EquipmentRequestJPanel(JPanel userProcessContainer, Network network,Enterprise enterprise,Organization organization
            ,UserAccount userAccount, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.enterprise = enterprise;
        this.network = network;
        this.userAccount =userAccount;
        this.organization = organization;
        System.out.println("Beofre conmbo");
        populateCombo();
        populateRequestTable();
    }

    public void populateRequestTable()
    {
        DefaultTableModel model = (DefaultTableModel) tblEquipReq.getModel();

        model.setRowCount(0);
         Organization Billingorg = null;
       for(Network network : ecosystem.getNetworkList())
       {
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())  
            {
              for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                  if(organization instanceof BillingOrganization)
                  {
                         Billingorg = organization;
                         break;
                     }
                 }
            }
       }
       
       for(WorkRequest wr : Billingorg.getWorkQueue().getWorkRequestList())
       {
           if(wr instanceof BillingWorkRequest )
           {
               BillingWorkRequest billWrkReq = (BillingWorkRequest)wr;
                Object[] row = new Object[10];
                
                row[0] = billWrkReq;
                row[1] = billWrkReq.getSender().getEmployee().getName();
                row[2] = billWrkReq.getEquipmentId();
                row[3] = billWrkReq.getEquipmentName();
                row[4] = billWrkReq.getEquipment().getAvailableQuant() ;
                row[5] = billWrkReq.getEquipment().getCost();
                row[6] = billWrkReq.getEquipmentPrice();
                row[7] = billWrkReq.getStatus();
                row[8] = billWrkReq.getRequestdate();
                row[9] = billWrkReq.getResolveDate();
                model.addRow(row);
           }
           
       }
           //BillingWorkRequest
    }
    
     private void populateCombo() {
        equipJComboBox.removeAllItems();
        
        for(Equipment equipment : ecosystem.getEquipmentList().getEquipmentList())
        {
            equipJComboBox.addItem(equipment);
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
        jLabel3 = new javax.swing.JLabel();
        txtEquipCost = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtquant = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTotalCost = new javax.swing.JTextField();
        btnBillingReq = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEquipReq = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        equipJComboBox = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("EQUIPMENT REQUEST PAGE");

        jLabel3.setText("Equipment Price :");

        jLabel4.setText("Equipment Qunatity :");

        txtquant.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtquantFocusLost(evt);
            }
        });
        txtquant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtquantActionPerformed(evt);
            }
        });

        jLabel5.setText("Total Cost :");

        txtTotalCost.setEditable(false);

        btnBillingReq.setBackground(new java.awt.Color(0, 153, 153));
        btnBillingReq.setText("Request for Fund");
        btnBillingReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillingReqActionPerformed(evt);
            }
        });

        tblEquipReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "BillingRequestId", "Sender", "EquipmentId", "EquipmentName", "No of Units", "Equipment Price", "totalEquipmentCost", "Status", "Request Date", "Resolve Date"
            }
        ));
        jScrollPane2.setViewportView(tblEquipReq);

        jLabel6.setText("Select Equipment :");

        equipJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        equipJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipJComboBoxActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 153, 153));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtquant, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEquipCost, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equipJComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 179, Short.MAX_VALUE)
                            .addComponent(txtTotalCost)
                            .addComponent(btnBillingReq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1087, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBillingReq, equipJComboBox, txtEquipCost, txtTotalCost, txtquant});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(equipJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEquipCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtquant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBillingReq)
                    .addComponent(btnBack))
                .addContainerGap(300, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBillingReq, equipJComboBox, txtEquipCost, txtTotalCost, txtquant});

    }// </editor-fold>//GEN-END:initComponents

    private void equipJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipJComboBoxActionPerformed
        // TODO add your handling code here:
        Equipment equipment = (Equipment) equipJComboBox.getSelectedItem();
        if (equipment != null){
          txtEquipCost.setText(String.valueOf(equipment.getCost()));
          
          //Double totalcost = Integer.parseInt(txtquant.getText()) * Double.parseDouble(txtEquipCost.getText());
         // txtTotalCost.setText(String.valueOf(totalcost));
          
        }
    }//GEN-LAST:event_equipJComboBoxActionPerformed

    private void btnBillingReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillingReqActionPerformed
        // TODO add your handling code here:
        Equipment equipment = (Equipment) equipJComboBox.getSelectedItem();
         Organization Billingorg = null;
       for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())  
       {
         for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
             if(organization instanceof BillingOrganization)
             {
                    Billingorg = organization;
                    break;
                }
            }
       }
         
        
        BillingWorkRequest billingReq = new BillingWorkRequest();
        billingReq.setEquipmentId(equipment.getEquipmentID());
        billingReq.setEquipmentName(equipment.getEquipmetName());
        billingReq.setEquipment(equipment);
        billingReq.setSender(userAccount);
        billingReq.setSenderNetwork(network);
        billingReq.setSenderOrganization(organization);
        billingReq.setRecieverNetwork(network);
        billingReq.setRecieverOrganization(Billingorg);
        billingReq.setEquipmentPrice(Double.parseDouble(txtTotalCost.getText()));
        billingReq.setNoOfUnits(Integer.parseInt(txtquant.getText()));
        billingReq.setRequestdate(new Date());
        billingReq.setStatus("Fund Requested");
        
       
          
        
        //billingReq.setRecieverOrganization(Emeorg);
         for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
             if(organization instanceof EquipmentOrganization                        )
             {
                   billingReq.setSenderOrganization(organization); 
                    break;
                }
            }
        
        Billingorg.getWorkQueue().addWorkRequest(billingReq);
        //System.out.println(billingReq.getEmergencyRequestId());
        populateRequestTable();
        
        
        
    }//GEN-LAST:event_btnBillingReqActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
             userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        EquipmentWorkAreaJPanel sysAdminwjp = (EquipmentWorkAreaJPanel) component;
        sysAdminwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtquantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtquantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtquantActionPerformed

    private void txtquantFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtquantFocusLost
        // TODO add your handling code here:
        String qunat = txtquant.getText();
        if(!qunat.isEmpty())
        {
         Double totalcost = Integer.parseInt(txtquant.getText()) * Double.parseDouble(txtEquipCost.getText());
         txtTotalCost.setText(String.valueOf(totalcost));
        }
    }//GEN-LAST:event_txtquantFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBillingReq;
    private javax.swing.JComboBox equipJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEquipReq;
    private javax.swing.JTextField txtEquipCost;
    private javax.swing.JTextField txtTotalCost;
    private javax.swing.JTextField txtquant;
    // End of variables declaration//GEN-END:variables
}
