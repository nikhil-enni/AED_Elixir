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
import userinterface.Ambulance.EmergencyAmbulanceUserJPanel;

/**
 *
 * @author raunak
 */
public class AmbulanceRole extends Role{

    
    public JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,Organization organization,Enterprise enterprise,Network network,
            EcoSystem business) {
        return new EmergencyAmbulanceUserJPanel(userProcessContainer, account,organization,enterprise,network,business);
        //return null;
        //return new CustomerAreaJPanel(userProcessContainer, account,business);
    }
    
     @Override
    public String toString(){
        return (RoleType.AmbulanceRole.getValue());
    }
}
