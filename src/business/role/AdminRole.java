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
=======
//import business.Customer.CustomerDirectory;
import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.MedicalEmployment.PatientList;
import business.Network.Network;

import business.Organization.Organization;
//import business.Restaurant.RestaurantDirectory;
import business.UserAccount.UserAccount;
//import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.EmergencyUnitAdminArea.EmergencyUnitAdminWorkAreaJPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author vaishanviyadamreddy
 * 
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
