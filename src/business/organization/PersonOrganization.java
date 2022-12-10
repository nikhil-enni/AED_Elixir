/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.MedicineAdmin;
import business.role.PersonRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author singh
 */
public class PersonOrganization extends Organization {
    
    public PersonOrganization(){
        super(Organization.Type.PersonDepartment.getValue());
    }
    public PersonOrganization(String name){
        super(name);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PersonRole());
        return roles;
    }
    @Override
    public Type getType() {
        return Organization.Type.PersonDepartment;
    } 
}
