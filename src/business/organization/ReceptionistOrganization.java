/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.EmergencyDoctorRole;
import business.role.LabAssistantRole;
import business.role.ReceptionistRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author sri_sai_nikhil_enni
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
