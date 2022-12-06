/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import Business.Role.AmbulanceRole;
import Business.Role.EmergencyAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vaishnaviyadamreddy
 */
public class AmbulanceOrganization extends Organization {

    public AmbulanceOrganization() {
        super(Organization.Type.AmbulanceDepartment.getValue());
    }
    
      public AmbulanceOrganization(String name) {
        super(name);
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AmbulanceRole());
        return roles;
    }
    
        @Override
    public Type getType() {
        return Organization.Type.AmbulanceDepartment;
    } 

}
