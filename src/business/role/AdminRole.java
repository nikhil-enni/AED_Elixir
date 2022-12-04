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
import userInterface.EmergencyUnitAdminArea.EmergencyUnitAdminWorkAreaJPanel;
import userInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author amisha03
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,Organization organization,Enterprise enterprise,Network network,
            EcoSystem business) {
       // return null;
        
        //userProcessContainer, business, account,restaurantDirectory
//        return null;
        return new EmergencyUnitAdminWorkAreaJPanel(userProcessContainer, enterprise, business);
       
    }

    @Override
    public String toString(){
        return (RoleType.AdminRole.getValue());
    }
    
}
