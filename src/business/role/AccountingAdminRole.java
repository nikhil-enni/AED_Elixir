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
import userInterface.AccountingUnitAdminArea.AccountingUnitAdminWorkAreaJPanel;
import userInterface.AccountingUnitAdminArea.AccountingUnitAdminWorkAreaJPanel;

/**
 *
 * @author ashleshagokhale
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