/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import Business.Role.MedicineAdmin;
import Business.Role.PersonRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vaishnaviyadamreddy
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
