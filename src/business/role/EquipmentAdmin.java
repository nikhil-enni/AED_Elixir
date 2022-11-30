/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
import userinterface.EquipmentUnitAdminArea.EquipmentUnitAdminWorkArea2JPanel;
import userinterface.EquipmentWorkArea.EquipmentWorkAreaJPanel;

/**
 *
 * @author singh
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
