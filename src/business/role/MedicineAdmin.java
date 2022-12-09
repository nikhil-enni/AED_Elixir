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
import javax.swing.JPanel;
import userInterface.emergencyUnitAdminArea.EmergencyUnitAdminWorkAreaJPanel;
import userinterface.medicineUnitAdminArea.MedicineUnitAdminWorkAreaJPanel;
import userinterface.medicineUnitAdminArea.MedicineUnitAdminWorkAreaJPanel;

/**
 *
 * @author sri_sai_nikhil_enni
=======
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.EmergencyUnitAdminArea.EmergencyUnitAdminWorkAreaJPanel;
import userinterface.MedicineUnitAdminArea.MedicineUnitAdminWorkAreaJPanel;
import userinterface.MedicineUnitAdminArea.MedicineUnitAdminWorkAreaJPanel;

/**
 *
 * @author amisha03
>>>>>>> branchA
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
