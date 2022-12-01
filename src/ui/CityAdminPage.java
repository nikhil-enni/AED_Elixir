/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author sri_sai_nikhil_enni
 */
public class CityAdminPage extends javax.swing.JPanel {

    /**
     * Creates new form CityAdminPage
     */
    public CityAdminPage() {
        initComponents();
        jCityList.setModel(new javax.swing.DefaultComboBoxModel(populateCities().toArray()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jCommunityForm = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jComName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jZipcode = new javax.swing.JTextField();
        jComSave = new javax.swing.JButton();
        jComClear = new javax.swing.JButton();
        jCityList = new javax.swing.JComboBox<>();
        jCityForm = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jCityName = new javax.swing.JTextField();
        jCitySave = new javax.swing.JButton();
        jCityClear = new javax.swing.JButton();
        jHospitalForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jHosName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jHosCity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jHosPhnNum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jHosEmail = new javax.swing.JTextField();
        jHosSave = new javax.swing.JButton();
        jHosClear = new javax.swing.JButton();
        jHosComList = new javax.swing.JComboBox<>();

        jLabel8.setText("Community Name:");

        jLabel9.setText("City:");

        jLabel10.setText("Zip Code:");

        jComSave.setText("Save");
        jComSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComSaveActionPerformed(evt);
            }
        });

        jComClear.setText("Clear");

        javax.swing.GroupLayout jCommunityFormLayout = new javax.swing.GroupLayout(jCommunityForm);
        jCommunityForm.setLayout(jCommunityFormLayout);
        jCommunityFormLayout.setHorizontalGroup(
            jCommunityFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCommunityFormLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jCommunityFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCommunityFormLayout.createSequentialGroup()
                        .addComponent(jComSave)
                        .addGap(18, 18, 18)
                        .addComponent(jComClear))
                    .addGroup(jCommunityFormLayout.createSequentialGroup()
                        .addGroup(jCommunityFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jCommunityFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComName)
                            .addComponent(jZipcode)
                            .addComponent(jCityList, 0, 180, Short.MAX_VALUE))))
                .addContainerGap(359, Short.MAX_VALUE))
        );
        jCommunityFormLayout.setVerticalGroup(
            jCommunityFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCommunityFormLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jCommunityFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jCommunityFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jCityList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jCommunityFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jCommunityFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComSave)
                    .addComponent(jComClear))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Community Form", jCommunityForm);

        jLabel7.setText("City Name:");

        jCityName.setToolTipText("");

        jCitySave.setText("Save");
        jCitySave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCitySaveActionPerformed(evt);
            }
        });

        jCityClear.setText("Clear");

        javax.swing.GroupLayout jCityFormLayout = new javax.swing.GroupLayout(jCityForm);
        jCityForm.setLayout(jCityFormLayout);
        jCityFormLayout.setHorizontalGroup(
            jCityFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCityFormLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jCityFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCityFormLayout.createSequentialGroup()
                        .addComponent(jCitySave)
                        .addGap(18, 18, 18)
                        .addComponent(jCityClear))
                    .addGroup(jCityFormLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(378, Short.MAX_VALUE))
        );
        jCityFormLayout.setVerticalGroup(
            jCityFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCityFormLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jCityFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jCityFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCitySave)
                    .addComponent(jCityClear))
                .addContainerGap(231, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("City Form", jCityForm);

        jLabel1.setText("Hospital Name:");

        jLabel2.setText("Address:");

        jLabel3.setText("City:");

        jLabel4.setText("Community:");

        jLabel5.setText("Phone Number:");

        jLabel6.setText("Email:");

        jHosSave.setText("Save");
        jHosSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHosSaveActionPerformed(evt);
            }
        });

        jHosClear.setText("Clear");

        jHosComList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jHospitalFormLayout = new javax.swing.GroupLayout(jHospitalForm);
        jHospitalForm.setLayout(jHospitalFormLayout);
        jHospitalFormLayout.setHorizontalGroup(
            jHospitalFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jHospitalFormLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jHospitalFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jHospitalFormLayout.createSequentialGroup()
                        .addComponent(jHosSave)
                        .addGap(18, 18, 18)
                        .addComponent(jHosClear))
                    .addGroup(jHospitalFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jHospitalFormLayout.createSequentialGroup()
                            .addGroup(jHospitalFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGroup(jHospitalFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jHospitalFormLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jHospitalFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jHosName, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                        .addComponent(jAddress)
                                        .addComponent(jHosCity)))
                                .addGroup(jHospitalFormLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jHosComList, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jHospitalFormLayout.createSequentialGroup()
                            .addGroup(jHospitalFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(jHospitalFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jHosPhnNum)
                                .addComponent(jHosEmail)))))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        jHospitalFormLayout.setVerticalGroup(
            jHospitalFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jHospitalFormLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jHospitalFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jHosName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jHospitalFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jHospitalFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jHosCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jHospitalFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jHosComList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jHospitalFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jHosPhnNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jHospitalFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jHosEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jHospitalFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jHosSave)
                    .addComponent(jHosClear))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hospital Form", jHospitalForm);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jHosSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHosSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jHosSaveActionPerformed

    public ArrayList populateCities(){
        ArrayList<String> city_list=new ArrayList<>();
        
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Elixir", "root", "password");
            String query_cities = "SELECT city_name FROM Cities";

                    Statement sta = connection.createStatement();
                    ResultSet rs = sta.executeQuery(query_cities);
                    while (rs.next()) {
                        String cityName = rs.getString("city_name");
                        city_list.add(cityName);
                    }
                    connection.close();
        } catch (Exception exception) {
                    exception.printStackTrace();
        }

        return city_list;
    }
    
    private void jCitySaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCitySaveActionPerformed
        String cityName=jCityName.getText();
        
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Elixir", "root", "password");
            String query_pat = "INSERT INTO Cities VALUES(null,'" + cityName + "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query_pat);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(jCitySave, "This alredy exists");
                    } else {
                        JOptionPane.showMessageDialog(jCitySave,
                            "Welcome, City is sucessfully saved");
                    }
                    connection.close();
        } catch (Exception exception) {
                    exception.printStackTrace();
        }
        
        jCityList.setModel(new javax.swing.DefaultComboBoxModel(populateCities().toArray()));
    }//GEN-LAST:event_jCitySaveActionPerformed

    private void jComSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComSaveActionPerformed
        String communityName=jComName.getText();
        int zipcode=Integer.valueOf(jZipcode.getText());
        String cityName=jCityList.getSelectedItem().toString();
        
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Elixir", "root", "password");
            Statement sta = connection.createStatement();
            
            String query_city = "SELECT city_id FROM Cities WHERE city_name='" + cityName + "'";
                    ResultSet rs = sta.executeQuery(query_city);
                    int city_id=0;
                    while(rs.next()){
                        city_id= Integer.valueOf(rs.getString("city_id"));
                    }
            String query_community = "INSERT INTO Communities VALUES(null,'" + communityName + "','" + zipcode + "','" + city_id + "')";
                    int y = sta.executeUpdate(query_community);
                    if (y == 0) {
                        JOptionPane.showMessageDialog(jComSave, "This alredy exists");
                    } else {
                        JOptionPane.showMessageDialog(jComSave,
                            "Welcome, Community is sucessfully saved");
                    }
                    connection.close();
        } catch (Exception exception) {
                    exception.printStackTrace();
        }
    }//GEN-LAST:event_jComSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAddress;
    private javax.swing.JButton jCityClear;
    private javax.swing.JPanel jCityForm;
    private javax.swing.JComboBox<String> jCityList;
    private javax.swing.JTextField jCityName;
    private javax.swing.JButton jCitySave;
    private javax.swing.JButton jComClear;
    private javax.swing.JTextField jComName;
    private javax.swing.JButton jComSave;
    private javax.swing.JPanel jCommunityForm;
    private javax.swing.JTextField jHosCity;
    private javax.swing.JButton jHosClear;
    private javax.swing.JComboBox<String> jHosComList;
    private javax.swing.JTextField jHosEmail;
    private javax.swing.JTextField jHosName;
    private javax.swing.JTextField jHosPhnNum;
    private javax.swing.JButton jHosSave;
    private javax.swing.JPanel jHospitalForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jZipcode;
    // End of variables declaration//GEN-END:variables
}
