/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import Business.Role.AdminRole;
import Business.Role.EmergencyAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author singh
 */
public class AdminOrganizatiion extends Organization{

    public AdminOrganizatiion(){
         super(Organization.Type.AdminDepartment.getValue());
    }
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
    
        @Override
    public Type getType() {
        return Organization.Type.AdminDepartment;
    } 

}
