/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

//import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.MedicalEmployment.PatientList;
import Business.Network.Network;

import Business.Organization.Organization;
//import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
//import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;
import userInterface.EmergencyUnitAdminArea.EmergencyUnitAdminWorkAreaJPanel;
import userInterface.EmergencyUserWorkArea.EmergencyPatientAdminWorkArea;
import userInterface.EmergencyUnitAdminArea.EmergencyUnitAdminWorkAreaJPanel;
import userInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author sri_sai_nikhil_enni
 */
public class EmergencyAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization,Enterprise enterprise,Network network, EcoSystem business) {
        return new EmergencyUnitAdminWorkAreaJPanel( userProcessContainer,enterprise, business);
        
        //userProcessContainer, business, account,restaurantDirectory
//        return null;
       // return new AdminWorkAreaJPanel(userProcessContainer, business, account,restaurantDirectory);
       
    }

     @Override
    public String toString(){
        return (RoleType.EmergencyAdminRole.getValue());
    }
    
    
}
