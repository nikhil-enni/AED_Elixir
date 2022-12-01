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
import userinterface.MedicineUnitAdminArea.MedicineUnitAdminWorkAreaJPanel;
import userinterface.MedicineUnitAdminArea.MedicineUnitAdminWorkAreaJPanel;

/**
 *
 * @author amisha03
 */
public class MedicineAdmin extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization,Enterprise enterprise,Network network, EcoSystem business) {
        return new MedicineUnitAdminWorkAreaJPanel( userProcessContainer,enterprise, business);
    }
    
     @Override
    public String toString(){
        return (RoleType.MedicineAdmin.getValue());
    }
}
