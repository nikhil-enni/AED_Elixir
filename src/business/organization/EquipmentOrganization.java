/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.EquipmentAdmin;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author singh
 */
public class EquipmentOrganization extends Organization {
    
    public EquipmentOrganization() {
        super(Organization.Type.EquipmentDepartment.getValue());
    }

    public EquipmentOrganization(String name){
        super(name);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EquipmentAdmin());
        return roles;
    }
    @Override
    public Type getType() {
        return Organization.Type.EquipmentDepartment;
    } 

    
}
