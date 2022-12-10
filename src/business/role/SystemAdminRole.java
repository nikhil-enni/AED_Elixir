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
//import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;
import userInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

  
    public JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,Organization organization,Enterprise enterprise,Network network,
            EcoSystem business) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, business);
    
       //return null;
    }
    
     @Override
    public String toString(){
        return (RoleType.SystemAdminRole.getValue());
    }
    
}
