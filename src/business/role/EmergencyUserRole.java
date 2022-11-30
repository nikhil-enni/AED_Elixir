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
import userinterface.EmergencyUserWorkArea.EmergencyPatientAdminWorkArea;
import userinterface.EmergencyUnitAdminArea.EmergencyUnitAdminWorkAreaJPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class EmergencyUserRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization,Enterprise enterprise,Network network, EcoSystem business) {
        return new EmergencyPatientAdminWorkArea( userProcessContainer, account, organization, 
         enterprise,  network, business);
        
        //userProcessContainer, business, account,restaurantDirectory
//        return null;
       // return new AdminWorkAreaJPanel(userProcessContainer, business, account,restaurantDirectory);
       
    }
    
     @Override
    public String toString(){
        return (RoleType.EmergencyUserRole.getValue());
    }

    
    
}
