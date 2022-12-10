/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Patient;
import userInterface.Receptionist.*;
import userinterface.Patient.*;
import static com.teamdev.jxbrowser.engine.RenderingMode.*;

import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import com.teamdev.jxbrowser.view.swing.BrowserView;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import userInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author Sandeep
 */
public class PatientLocationMap extends javax.swing.JPanel {

    /**
     * Creates new form LocationMap
     */
    JPanel userProcessContainer;
    private static final int MIN_ZOOM = 0;
    private static final int MAX_ZOOM = 21;
    private static final String setMarkerScript =
            "var myLatlng = new google.maps.LatLng(48.4431727,23.0488126);\n" +
                    "var marker = new google.maps.Marker({\n" +
                    "    position: myLatlng,\n" +
                    "    map: map,\n" +
                    "    title: 'Hello World!'\n" +
                    "});";
    
     /**
     * In map.html file default zoom value is set to 4.
     */
    private static int zoomValue = 4;
     Browser browser;
    public PatientLocationMap(JPanel userProcessContainer) {
        initComponents();
        //System.setProperty("jxbrowser.license.key", "1BNDJDKIKHWOX1U3PXOY2P0DPBSV2UGSQ7X45V01TXXE2EIKFS8QWQD29G8JX7OZ180C02");
          this.userProcessContainer = userProcessContainer;
            EngineOptions options =
                EngineOptions.newBuilder(HARDWARE_ACCELERATED).licenseKey("1BNDJDKIKHWOX1U3PXOY2P0DPBSV2UGSQ7X45V01TXXE2EIKFS8QWQD29G8JX7OZ180C02").build();
        Engine engine = Engine.newInstance(options);
        browser = engine.newBrowser();
        BrowserView view = BrowserView.newInstance(browser);
        browser.navigation().loadUrl("https://www.google.com/maps");

      //  String rootPath = System.getProperty("user.dir");
      //      browser.navigation().loadUrl("file://"+rootPath+"/HTML_GMAP.html");
       // browser.navigation().loadUrlAndWait("../HTML_GMAP.html");
       
        
        canvasMap.setLayout(new BorderLayout());
      //  JPanel panel = new JPanel(new BorderLayout());
      //  panel.add(view, BorderLayout.CENTER);
        canvasMap.add(view,BorderLayout.CENTER);
         
//
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.add(panel, BorderLayout.CENTER);
//        frame.setSize(700, 500);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//
//        browser.navigation().loadUrlAndWait("https://www.google.com/maps");
        
    }
    
//    public static void location()
//    {
//        
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvasMap = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout canvasMapLayout = new javax.swing.GroupLayout(canvasMap);
        canvasMap.setLayout(canvasMapLayout);
        canvasMapLayout.setHorizontalGroup(
            canvasMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        canvasMapLayout.setVerticalGroup(
            canvasMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        jButton1.setText("Mark Location");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Location Cordinates");

        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(canvasMap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jLabel1, txtSearch});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(30, 30, 30)
                .addComponent(jButton2))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(canvasMap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jLabel1, txtSearch});

    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {

            if (browser.url()!= null) {

                System.out.println(browser.url());
                String[] a = browser.url().split("!3d", 0);
                String[] b = a[1].split("!4d");
                System.out.println("Lat" + b[0] + "  " + "Lon" + b[1]);
                double lat = Double.parseDouble(b[0]);
                double lon = Double.parseDouble(b[1]);
               // locationPoint.setLatitude(lat);
               // locationPoint.setLongitude(lon);
                System.out.println("Lat " + lat+ " " + lon);
                txtSearch.setText(lat+ "," + lon);
                
            }
           

            //userProcessContainer.remove(this);
            //Component[] componentArray = userProcessContainer.getComponents();
//            if (userProcessContainer.getComponent(componentArray.length - 1) instanceof EmergencyManageOrganizationJPanel) {
//                EmergencyManageOrganizationJPanel orgManagement = (EmergencyManageOrganizationJPanel) userProcessContainer.getComponent(componentArray.length - 1);
//                orgManagement.populateLongituteLatitude(locationPoint);
//            }else if (userProcessContainer.getComponent(componentArray.length - 1) instanceof IncidentManagerManageOrganizationJPanel) {
//                IncidentManagerManageOrganizationJPanel orgManagement = (IncidentManagerManageOrganizationJPanel) userProcessContainer.getComponent(componentArray.length - 1);
//                orgManagement.populateLongituteLatitude(locationPoint);
//            }else if (userProcessContainer.getComponent(componentArray.length - 1) instanceof VoluntaryOperatingUnitManageOrganizationsJPanel) {
//                VoluntaryOperatingUnitManageOrganizationsJPanel orgManagement = (VoluntaryOperatingUnitManageOrganizationsJPanel) userProcessContainer.getComponent(componentArray.length - 1);
//                orgManagement.populateLongituteLatitude(locationPoint);
//            }else if (userProcessContainer.getComponent(componentArray.length - 1) instanceof UserRegistrationJPanel) {
//                UserRegistrationJPanel orgManagement = (UserRegistrationJPanel) userProcessContainer.getComponent(componentArray.length - 1);
//                orgManagement.populateLongituteLatitude(locationPoint);
//            }else if(userProcessContainer.getComponent(componentArray.length - 1) instanceof ReportingAdminManageSceneJPanel){
//                ReportingAdminManageSceneJPanel reportingComponent = (ReportingAdminManageSceneJPanel) userProcessContainer.getComponent(componentArray.length - 1);
//                reportingComponent.populateLongituteLatitude(locationPoint);
//            }else if(userProcessContainer.getComponent(componentArray.length - 1) instanceof IndividualAdminManageSceneJPanel){
//                IndividualAdminManageSceneJPanel reportingComponent = (IndividualAdminManageSceneJPanel) userProcessContainer.getComponent(componentArray.length - 1);
//                reportingComponent.populateLongituteLatitude(locationPoint);
//            }else if(userProcessContainer.getComponent(componentArray.length - 1) instanceof HospitalAdminManageSceneJPanel){
//                HospitalAdminManageSceneJPanel reportingComponent = (HospitalAdminManageSceneJPanel) userProcessContainer.getComponent(componentArray.length - 1);
//                reportingComponent.populateLongituteLatitude(locationPoint);
//            }else if(userProcessContainer.getComponent(componentArray.length - 1) instanceof NGOAdminManageSceneJPanel){
//                NGOAdminManageSceneJPanel reportingComponent = (NGOAdminManageSceneJPanel) userProcessContainer.getComponent(componentArray.length - 1);
//                reportingComponent.populateLongituteLatitude(locationPoint);
//            }else if(userProcessContainer.getComponent(componentArray.length - 1) instanceof CompanyAdminManageSceneJPanel){
//                CompanyAdminManageSceneJPanel reportingComponent = (CompanyAdminManageSceneJPanel) userProcessContainer.getComponent(componentArray.length - 1);
//                reportingComponent.populateLongituteLatitude(locationPoint);
//            }else{
//                System.out.println("ELSE LOCATION " + componentArray.length);
//                System.out.println("ELSE CONTAINER " + userProcessContainer.toString());
//            }
         

//            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//            layout.previous(userProcessContainer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Set Position first");
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          userProcessContainer.remove(this);
           Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PatientWorkAreaJPanel sysAdminwjp = (PatientWorkAreaJPanel) component;
//           Component[] componentArray = userProcessContainer.getComponents();
//            CreatePatientJPanel reportingComponent = (CreatePatientJPanel) userProcessContainer.getComponent(componentArray.length - 1);
            sysAdminwjp.ppopulateLongituteLatitude(txtSearch.getText());
             CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel canvasMap;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
