/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.MedicineUnitArea;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.medicine.Medicine;
import business.medicine.MedicineList;
import business.network.Network;
import business.organization.MedicineOrganization;
import business.organization.Organization;

import business.userAccount.UserAccount;


import business.workQueue.WorkRequest;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author sri_sai_nikhil_enni
 */
public class PharmacyWorkArea2 extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyWorkArea2
     */
    JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private EcoSystem ecoSystem;
//    private MedicalInventoryList mil;
    private Organization org;
    private MedicineOrganization pharmorg;
    private Network network;
    private static Logger log = Logger.getLogger(PharmacyWorkArea2.class);
    private static final String CLASS_NAME = PharmacyWorkArea2.class.getName();

    public PharmacyWorkArea2(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, 
            Network network,EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
//        this.pharmorg = organization;
        this.network = network;
        this.ecoSystem = ecoSystem;
        reorderTable();
//        populateDocTable();
        log.debug(userAccount+" "+"logged in");
    }

    public void reorderTable() {
        int rowCount = reorderTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) reorderTable.getModel();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for (Medicine mi : pharmorg.getMedList()) {
            Object row[] = new Object[6];
            row[0] = mi;
            row[1] = mi.getSerialNumber();
            row[2] = mi.getAvailQuantity();
            row[3] = mi.getRequiredQuantity();
            row[4] = mi.getReorderStatus();
            //row[5] = mi.getReorderStatus();
            model.addRow(row);
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
        reorderTable = new javax.swing.JTable();
        serialNumLbl = new javax.swing.JLabel();
        serialNumberTxtField = new javax.swing.JTextField();
        medicineNameLbl = new javax.swing.JLabel();
        medicineNameTxtField = new javax.swing.JTextField();
        availQuantityLbl = new javax.swing.JLabel();
        availQuantityTxtField = new javax.swing.JTextField();
        reqQuantityLbl = new javax.swing.JLabel();
        addMedicineBtn = new javax.swing.JButton();
        pharmacyLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reorderTable.setBorder(new javax.swing.border.MatteBorder(null));
        reorderTable.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        reorderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICINE NAME", "SERIAL NUMBER ", "AVAILABILE QUANTITY", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reorderTable.setRowHeight(25);
        jScrollPane1.setViewportView(reorderTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 111, 871, 160));

        serialNumLbl.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 24)); // NOI18N
        serialNumLbl.setForeground(new java.awt.Color(0, 0, 102));
        serialNumLbl.setText("SERIAL NUMBER: ");
        add(serialNumLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 240, 23));

        serialNumberTxtField.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        add(serialNumberTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 382, 252, 30));

        medicineNameLbl.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 24)); // NOI18N
        medicineNameLbl.setForeground(new java.awt.Color(0, 0, 102));
        medicineNameLbl.setText("MEDICINE NAME: ");
        add(medicineNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 240, 25));

        medicineNameTxtField.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        add(medicineNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 423, 252, 30));

        availQuantityLbl.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 24)); // NOI18N
        availQuantityLbl.setForeground(new java.awt.Color(0, 0, 102));
        availQuantityLbl.setText("AVAILABLE QUANTITY:");
        add(availQuantityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 467, 282, -1));

        availQuantityTxtField.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        add(availQuantityTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 252, 30));

        reqQuantityLbl.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 24)); // NOI18N
        reqQuantityLbl.setForeground(new java.awt.Color(0, 0, 102));
        reqQuantityLbl.setText("Status :");
        add(reqQuantityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, -1, -1));

        addMedicineBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 24)); // NOI18N
        addMedicineBtn.setForeground(new java.awt.Color(0, 0, 102));
        addMedicineBtn.setText("ADD MEDICINE");
        addMedicineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMedicineBtnActionPerformed(evt);
            }
        });
        add(addMedicineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 251, -1));

        pharmacyLbl.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 48)); // NOI18N
        pharmacyLbl.setForeground(new java.awt.Color(0, 0, 102));
        pharmacyLbl.setText("Pharmacy Work Area");
        add(pharmacyLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pharamacy.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/medicine.jpg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 570, 110, 60));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 250, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void addMedicineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMedicineBtnActionPerformed
        // TODO add your handling code here:

        Medicine m = new Medicine();
        String name = medicineNameTxtField.getText().trim();
        String error_message = "";
        String avail = availQuantityTxtField.getText();
        try {
            Integer.parseInt(avail);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Available quantity must be integer");
            return;

        }
        if(name.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter the name ");
            return;
        }
        
        m.setMedicineName(medicineNameTxtField.getText());
        try{
        int availableQuantity = Integer.parseInt(availQuantityTxtField.getText());
        m.setAvailQuantity(availableQuantity);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "serial number must be integer!");
            return;
        }
        try{
        int serialNumber = Integer.parseInt(serialNumberTxtField.getText());
        m.setSerialNumber(serialNumber);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "serial number must be integer!");
            return;
        }
        //String req = reqQuantityTxtField.getText();
        try {
           
           // m.setRequiredQuantity( Integer.parseInt(req));
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Required quantity must be integer!");
            return;
        }
       
//        ArrayList<String> medicineCheck = new ArrayList<>();
//        for(MedicalInventory mc:pharmorg.getMedList())
//        {
//            medicineCheck.add(mc.getMedicineName().toLowerCase());
//        }
//        if(medicineCheck.contains(name.toLowerCase()))
//        {
//            JOptionPane.showMessageDialog(null, "medicine already existed please update the quantity by clicking on view details");
//            return;
//        }
        pharmorg.addMedicine(m);
        m.setReorderStatus("N");

        DefaultTableModel dtm = (DefaultTableModel) reorderTable.getModel();

        dtm.setRowCount(0);
        for (Medicine mi : pharmorg.getMedList()) {
            Object row[] = new Object[5];
            row[0] = mi;
            row[1] = mi.getSerialNumber();
            row[2] = mi.getAvailQuantity();
            row[3] = mi.getRequiredQuantity();
            row[4] = mi.getReorderStatus();
            dtm.addRow(row);
        }

        JOptionPane.showMessageDialog(null, "Medicine Added Successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);
        log.debug("medicine added successfully");
        serialNumberTxtField.setText("");
        medicineNameTxtField.setText("");
        availQuantityTxtField.setText("");
        //reqQuantityTxtField.setText("");

    }//GEN-LAST:event_addMedicineBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMedicineBtn;
    private javax.swing.JLabel availQuantityLbl;
    private javax.swing.JTextField availQuantityTxtField;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel medicineNameLbl;
    private javax.swing.JTextField medicineNameTxtField;
    private javax.swing.JLabel pharmacyLbl;
    private javax.swing.JTable reorderTable;
    private javax.swing.JLabel reqQuantityLbl;
    private javax.swing.JLabel serialNumLbl;
    private javax.swing.JTextField serialNumberTxtField;
    // End of variables declaration//GEN-END:variables
}
