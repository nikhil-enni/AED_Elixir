/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.medicine.Medicine;
import business.role.LabAssistantRole;
import business.role.MedicineAdmin;
import business.role.MedicineUser;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author vaishnaviyadamreddy
 */
public class MedicineOrganization extends Organization{
    private ArrayList<Medicine> medList;
    
    public MedicineOrganization() {
        super(Organization.Type.MedicineDepartment.getValue());
    }
    public MedicineOrganization(String name){
        super(name);
          medList=new ArrayList<Medicine>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
       // roles.add(new MedicineAdmin());
        roles.add(new MedicineUser());
        return roles;
    }
    
    @Override
    public Type getType() {
        return Organization.Type.MedicineDepartment;
    } 

     public ArrayList<Medicine> getMedList() {
        return medList;
    }

    public void setMedList(ArrayList<Medicine> medList) {
        this.medList = medList;
    }
    
     public void addMedicine(Medicine mi)
    {
       
        medList.add(mi);
        
    }
}
