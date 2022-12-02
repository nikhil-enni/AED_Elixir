/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;


import business.role.BillingAdminRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author vaishnaviyadamreddy
 */
public class AccountingUnit extends Enterprise {
    public AccountingUnit(String name) {
    super(name, Enterprise.EnterpriseType.AccountingUnit);
}

@Override    
public ArrayList<Role> getSupportedRole() {
    roles = new ArrayList<Role>();
    roles.add(new BillingAdminRole());
   //  roles.add(new PoliceHead());
    return roles;
}
    
}
