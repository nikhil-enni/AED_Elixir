/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import Business.Role.EmergencyDoctorRole;
import Business.Role.LabAssistantRole;
import Business.Role.ReceptionistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sandeep
 */
public class ReceptionistOrganization extends Organization {

    public ReceptionistOrganization() {
        super(Organization.Type.ReceptionistDepartment.getValue());
    
    }  
    public ReceptionistOrganization(String name) {
            super(name);
    }
        

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ReceptionistRole());
        return roles;
    }
    
     @Override
    public Type getType() {
        return Organization.Type.ReceptionistDepartment;
    } 

}
