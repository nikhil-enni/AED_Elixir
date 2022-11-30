/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.role.AmbulanceRole;
import business.role.EmergencyDoctorRole;
import business.role.Role;
import java.util.ArrayList;
import business.role.EmergencyAdminRole;
import business.role.LabAssistantRole;
import business.role.PatientRole;
import business.role.ReceptionistRole;

/**
 *
 * @author Sandeep
 */
public class EmergencyUnit extends Enterprise {
    
    public EmergencyUnit(String name) {
        super(name, Enterprise.EnterpriseType.EmergencyUnit);
    }

    @Override
    
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new EmergencyAdminRole());
        roles.add(new EmergencyDoctorRole());
        roles.add(new AmbulanceRole());
        roles.add(new PatientRole());
        roles.add(new LabAssistantRole());
        roles.add(new ReceptionistRole());
       //  roles.add(new PoliceHead());
        return roles;
    }
    
}
