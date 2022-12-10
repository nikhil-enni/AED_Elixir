/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import Business.Role.EmergencyAdminRole;
import Business.Role.PatientRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vaishnaviyadamreddy
 */
public class PatientOrganization extends Organization{

    public PatientOrganization() {
        super(Organization.Type.PatientDepartment.getValue());
    }
      public PatientOrganization(String name) {
        super(name);
    }
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PatientRole());
        return roles;
    }
    
     @Override
    public Type getType() {
        return Organization.Type.PatientDepartment;
    } 
    
}
