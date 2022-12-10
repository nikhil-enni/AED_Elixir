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
////import Business.Restaurant.RestaurantDirectory;
import business.userAccount.UserAccount;
//import userinterface.CustomerRole.CustomerAreaJPanel;
import javax.swing.JPanel;
import userInterface.Patient.PatientWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class PatientRole extends Role{

    
    public JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,Organization organization,Enterprise enterprise,Network network,
            EcoSystem business) {
        return new PatientWorkAreaJPanel(userProcessContainer, account, business , network,organization,enterprise);
        //return null;
        //return new CustomerAreaJPanel(userProcessContainer, account,business);
    }
    
     @Override
    public String toString(){
        return (RoleType.PatientRole.getValue());
    }
}
