/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

<<<<<<< HEAD
import business.role.BillingAdminRole;
import business.role.MedicineAdmin;
import business.role.Role;
=======
import business.Role.BillingAdminRole;
import business.Role.MedicineAdmin;
import business.Role.Role;
>>>>>>> branchA
import java.util.ArrayList;

/**
 *
<<<<<<< HEAD
 * @author singh
=======
 * @author amisha03
>>>>>>> branchA
 */
public class MedicineUnit extends Enterprise{

    public MedicineUnit(String name) {
        super(name,EnterpriseType.MedicalUnit);
    }
    
    @Override    
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new MedicineAdmin());
       //  roles.add(new PoliceHead());
        return roles;
    }
    
}
