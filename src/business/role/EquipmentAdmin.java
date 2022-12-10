/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
<<<<<<< HEAD
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.userAccount.UserAccount;
=======
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
>>>>>>> branchA
import javax.swing.JPanel;
import userInterface.EmergencyUnitAdminArea.EmergencyUnitAdminWorkAreaJPanel;
import userInterface.EquipmentUnitAdminArea.EquipmentUnitAdminWorkArea2JPanel;
import userInterface.EquipmentWorkArea.EquipmentWorkAreaJPanel;

/**
 *
 * @author amisha03
 */
public class EquipmentAdmin extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization,Enterprise enterprise,Network network, EcoSystem business) {
        return new EquipmentWorkAreaJPanel( userProcessContainer,account,network,enterprise,organization, business);
    }
    
     @Override
    public String toString(){
        return (RoleType.EquipmentAdmin.getValue());
    }
}
