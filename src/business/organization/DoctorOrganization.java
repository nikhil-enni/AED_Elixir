/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.medicine.Prescription;
import business.role.DoctorRole;
import business.role.EmergencyDoctorRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author sandeep
 */
public class DoctorOrganization extends Organization {

    private ArrayList<Prescription> prescriptionlist;
    
    
    public DoctorOrganization() {
        super(Organization.Type.DoctorDepartment.getValue());
        prescriptionlist=new ArrayList<Prescription>();
    }
     public DoctorOrganization(String name){
        super(name);
    }

     public ArrayList<Prescription> getPrescriptionlist() {
        return prescriptionlist;
    }

    public void setPrescriptionlist(ArrayList<Prescription> prescriptionlist) {
        this.prescriptionlist = prescriptionlist;
    }
    
     
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EmergencyDoctorRole());
        roles.add(new DoctorRole());
        return roles;
    }
    
    @Override
    public Type getType() {
        return Organization.Type.DoctorDepartment;
    } 
    
    public void addPrescription(Prescription prescription){
        
         prescriptionlist.add(prescription);
         
        
    }


}
