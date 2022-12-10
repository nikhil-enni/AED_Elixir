/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.BillingAdminRole;
import business.role.PatientRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author singh
 */
public class BillingOrganization extends Organization {

    double funds;
    
    public BillingOrganization() {
        super(Organization.Type.BillingDepartment.getValue());
    }
    public BillingOrganization(String name){
        super(name);
    }

    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new BillingAdminRole());
        return roles;
    }
    
    @Override
    public Type getType() {
        return Organization.Type.BillingDepartment;
    } 

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    
    
}
