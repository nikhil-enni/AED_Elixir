/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

//import Business.Customer.CustomerDirectory;
import business.EcoSystem;
import business.enterprise.Enterprise;
import business.medicalEmployment.PatientList;
import business.network.Network;

import business.organization.Organization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
         AccountingAdminRole("AccountingAdminRole"),
        AdminRole("AdminRole"),
        AmbulanceRole("AmbulanceRole"),
        BillingAdminRole("BillingAdminRole"),
        DoctorRole("DoctorRole"),
        EmergencyAdminRole("EmergencyAdminRole"),
        EmergencyDoctorRole("EmergencyDoctorRole"),
        EmergencyUserRole("EmergencyUserRole"),
        EquipmentAdmin("EquipmentAdmin"),
        LabAssistantRole("LabAssistantRole"),
        ManagementAdminRole("ManagementAdminRole"),
        MedicineAdmin("MedicineAdmin"),
        MedicineUser("MedicineUser"),
        PatientRole("PatientRole"),
        PersonRole("PersonRole"),
        ReceptionistRole("ReceptionistRole"),
        SystemAdminRole("SystemAdminRole");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,Organization organization,Enterprise enterprise,Network network,
            EcoSystem business);

    @Override
    public String toString() {
       return  this.getClass().getName();
    }
    
    
}