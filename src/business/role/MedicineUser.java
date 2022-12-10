/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.EmergencyUnitAdminArea.EmergencyUnitAdminWorkAreaJPanel;
import userInterface.MedicineUnitAdminArea.MedicineUnitAdminWorkAreaJPanel;
import userInterface.MedicineUnitArea.PharmacyWorkArea;
import userInterface.MedicineUnitArea.PharmacyWorkArea2;

/**
 *
 * @author singh
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
