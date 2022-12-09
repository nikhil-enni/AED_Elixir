/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.EmergencyUnitAdminArea.EmergencyUnitAdminWorkAreaJPanel;
import userinterface.LabWorkArea.LabWorkAreaJPanel;

/**
 *
 * @author sri_sai_nikhil_enni
 */
public class LabAssistantRole extends Role {

  
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
         return new LabWorkAreaJPanel(userProcessContainer,account,organization,enterprise,network,business);
    }

     @Override
    public String toString(){
        return (RoleType.LabAssistantRole.getValue());
    }
}
