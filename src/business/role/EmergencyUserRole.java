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
//import Business.Restaurant.RestaurantDirectory;
import business.userAccount.UserAccount;
//import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;
import userInterface.EmergencyUserWorkArea.EmergencyPatientAdminWorkArea;
import userInterface.EmergencyUnitAdminArea.EmergencyUnitAdminWorkAreaJPanel;
import userInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author amisha03
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
