/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

<<<<<<< HEAD
import business.role.EquipmentAdmin;
import business.role.Role;
=======
import business.Role.EquipmentAdmin;
import business.Role.Role;
>>>>>>> branchA
import java.util.ArrayList;

/**
 *
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< HEAD
 * @author singh
=======
 * @author amisha03
>>>>>>> branchA
=======
 * @author vaishnaviyadamreddy
>>>>>>> Stashed changes
=======
 * @author vaishnaviyadamreddy
>>>>>>> Stashed changes
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
