/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
import userinterface.MedicineUnitAdminArea.MedicineUnitAdminWorkAreaJPanel;
import userinterface.MedicineUnitArea.PharmacyWorkArea;
import userinterface.MedicineUnitArea.PharmacyWorkArea2;

/**
 *
 * @author amisha03
 */
public class MedicineUser extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization,Enterprise enterprise,Network network, EcoSystem business) {
        return new PharmacyWorkArea( userProcessContainer,account,organization,enterprise,network, business);
    }
    
     @Override
    public String toString(){
        return (RoleType.MedicineUser.getValue());
    }
}