/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.EmergencyDoctorRole;
import business.role.LabAssistantRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author sandeep
 */
public class LabOrganization extends Organization {

    public LabOrganization() {
        super(Organization.Type.LabDepartment.getValue());
    }
     public LabOrganization(String name){
        super(name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LabAssistantRole());
        return roles;
    }

    @Override
    public Type getType(){
        return Organization.Type.LabDepartment;
    } 
}
