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
////import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
//import userinterface.CustomerRole.CustomerAreaJPanel;
import javax.swing.JPanel;
import userinterface.Patient.PatientWorkAreaJPanel;

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
