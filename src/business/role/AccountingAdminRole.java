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
import userinterface.AccountingUnitAdminArea.AccountingUnitAdminWorkAreaJPanel;
import userinterface.AccountingUnitAdminArea.AccountingUnitAdminWorkAreaJPanel;

/**
 *
 * @author vaishnaviyadamreddy
 */
public class AccountingAdminRole extends Role{
    public JPanel createWorkArea(JPanel userProcessContainer, 
          UserAccount account,Organization organization,Enterprise enterprise,Network network,EcoSystem business) {
          return new AccountingUnitAdminWorkAreaJPanel(userProcessContainer, enterprise, business);
    }
    
    
    @Override
    public String toString(){
        return (RoleType.AccountingAdminRole.getValue());
    }
}