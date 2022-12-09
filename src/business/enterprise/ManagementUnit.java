/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.role.MedicineAdmin;
import business.role.PersonRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author sri_sai_nikhil_enni
 */
public class ManagementUnit extends Enterprise {
    public ManagementUnit(String name){
        super(name, Enterprise.EnterpriseType.ManagementUnit);
    }
    
      @Override    
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new PersonRole());
       //  roles.add(new PoliceHead());
        return roles;
    }
    
}
