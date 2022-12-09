/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

//import business.Customer.CustomerDirectory;
import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.MedicalEmployment.PatientList;
import business.Network.Network;

import business.Organization.Organization;
////import business.Restaurant.RestaurantDirectory;
import business.UserAccount.UserAccount;
//import userinterface.CustomerRole.CustomerAreaJPanel;
import javax.swing.JPanel;
import userinterface.Ambulance.EmergencyAmbulanceUserJPanel;

/**
 *
 * @author vaishnaviyadamreddy
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
