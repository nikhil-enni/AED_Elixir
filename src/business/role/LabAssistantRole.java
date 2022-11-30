/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.EmergencyUnitAdminArea.EmergencyUnitAdminWorkAreaJPanel;
import userinterface.LabWorkArea.LabWorkAreaJPanel;

/**
 *
 * @author sandeep
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
