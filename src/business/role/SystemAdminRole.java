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
//import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

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
