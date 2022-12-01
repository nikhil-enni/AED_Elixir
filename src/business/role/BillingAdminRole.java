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
import userinterface.BillingWorkArea.BillingWorkArea;

/**
 *
 * @author amisha03
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