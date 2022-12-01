/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import Business.Role.BillingAdminRole;
import Business.Role.MedicineAdmin;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author amisha03
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
