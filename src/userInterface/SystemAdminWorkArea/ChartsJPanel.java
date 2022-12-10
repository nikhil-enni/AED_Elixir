/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemAdminWorkArea;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.equipment.Equipment;
import business.medicalEmployment.Patient;
import business.medicalEmployment.PatientList;
import business.network.Network;
import business.organization.EmergencyOrganization;
import business.organization.Organization;
import business.workQueue.EmergencyPatientRequest;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import userInterface.Charts.PieChartJPanel;

/**
 *
 * @author Sandeep
 */
  
public class ChartsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ChartsJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public ChartsJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("PieChart of Patient");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Emergency Request Chart");
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
                .addGap(84, 84, 84)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(200, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultPieDataset dataset=new DefaultPieDataset();  
        for(Equipment equipment : ecosystem.getEquipmentList().getEquipmentList())
        {
             dataset.setValue(equipment.getEquipmetName(),  Double.parseDouble(equipment.getAvailableQuant()));  
        }
        
         
//        dataset.setValue("80-100",  120);  
//        dataset.setValue("60-79", 80);  
//        dataset.setValue("40-59", 20);  
//        dataset.setValue("20-39", 7);  
//        dataset.setValue("0-19", 3);   
        
         JFreeChart chart = ChartFactory.createPieChart(  
        "Equipment Availability Chart",  
        dataset,  
        true,   
        true,  
        false);  
         PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator(  
        "Equipment {0} : ({1})", new DecimalFormat("0"), new DecimalFormat("0"));  
         
    ((PiePlot) chart.getPlot()).setLabelGenerator(labelGenerator);  
    
          ChartFrame chartFrame = new ChartFrame("Medicines",chart,true);
        chartFrame.setVisible(true);
        chartFrame.setSize(2000,1000);
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.BLACK);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int Requestcount = 0;
        int ResolveCount = 0;
        int inProgressCount = 0;
          Organization Emeorg = null;
        for(Network network : ecosystem.getNetworkList())
        {
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())  
            {
              for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                  if(organization instanceof EmergencyOrganization)
                  {
                         Emeorg = organization;
                         for(WorkRequest wr : Emeorg.getWorkQueue().getWorkRequestList())
                         {
                             if(wr instanceof EmergencyPatientRequest)
                             {
                                 EmergencyPatientRequest epr = (EmergencyPatientRequest) wr;
                                 if(!epr.getStatus().equals("Completed"))
                                 {
                                     inProgressCount++;
                                 }
                                 else
                                 {
                                     ResolveCount++;
                                 }
                             }
                             
                         }
                     }
                 }
            }
        }
        
        

        // Population in 2005
        dataset.addValue(inProgressCount, "Inprogress", "Inprogress");
        dataset.addValue(ResolveCount, "Completed", "Completed");
//        dataset.addValue(20, "China", "2005");
//
//        // Population in 2010
//        dataset.addValue(15, "USA", "2010");
//        dataset.addValue(20, "India", "2010");
//        dataset.addValue(25, "China", "2010");
//
//        // Population in 2015
//        dataset.addValue(20, "USA", "2015");
//        dataset.addValue(25, "India", "2015");
//        dataset.addValue(30, "China", "2016");

        JFreeChart chart=ChartFactory.createBarChart(
            "Emeregency Request Report", //Chart Title
            "Request", // Category axis
            "Number of Request", // Value axis
            dataset,
            PlotOrientation.VERTICAL,
            true,true,false
        );
        ChartFrame chartFrame = new ChartFrame("Medicines",chart,true);
        chartFrame.setVisible(true);
        chartFrame.setSize(2000,1000);
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.BLACK);

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
