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
import userInterface.BillingWorkArea.BillingWorkArea;

/**
 *
 * @author vaishnaviyadamreddy
 */
public class BillingAdminRole extends Role{
    public JPanel createWorkArea(JPanel userProcessContainer, 
          UserAccount account,Organization organization,Enterprise enterprise,Network network,EcoSystem business) {
        return  new BillingWorkArea(userProcessContainer ,network,enterprise, organization , account,  business);
    }
    
     
    @Override
    public String toString(){
        return (RoleType.BillingAdminRole.getValue());
    }
}