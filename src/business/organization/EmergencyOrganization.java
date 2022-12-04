/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.EmergencyDoctorRole;
import business.role.EmergencyAdminRole;
import business.role.EmergencyUserRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author sri_sai_nikhil_enni
 */
public class EmergencyOrganization extends Organization {

    public EmergencyOrganization() {
        super(Organization.Type.EmergencyDepartment.getValue());
        
    }
    
    public EmergencyOrganization(String name){
        super(name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
       
        roles.add(new EmergencyUserRole());
        return roles;
    }
    
    @Override
    public Type getType() {
        return Organization.Type.EmergencyDepartment;
    } 


}
