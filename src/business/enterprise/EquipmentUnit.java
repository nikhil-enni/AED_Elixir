/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.role.EquipmentAdmin;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author singh
 */
public class EquipmentUnit extends Enterprise {
   public EquipmentUnit(String name) {
    super(name, Enterprise.EnterpriseType.EquipmentUnit);
   }
    @Override
    
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new EquipmentAdmin());
       //  roles.add(new PoliceHead());
        return roles;
    }
}
