/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.enterprise.EmergencyUnit;
import business.role.EmergencyAdminRole;
import java.util.ArrayList;

/**
 *
 * @author sri_sai_nikhil_enni
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory()
    {
        organizationList = new ArrayList<Organization>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    public Organization createOrganization(Organization.Type type,String name) {
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.EmergencyDepartment.getValue())) {
            organization = new EmergencyOrganization(name);
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Organization.Type.LabDepartment.getValue())) {
            organization = new LabOrganization(name);
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Organization.Type.DoctorDepartment.getValue())){
                    organization=new DoctorOrganization(name);
                    organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.BillingDepartment.getValue())){
                    organization=new BillingOrganization(name);
                    organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.AmbulanceDepartment.getValue())){
                    organization=new AmbulanceOrganization(name);
                    organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.MedicineDepartment.getValue())){
                  organization=new MedicineOrganization(name);
                  organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.PatientDepartment.getValue())){
                  organization=new PatientOrganization(name);
                  organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.EquipmentDepartment.getValue())){
                 organization=new EquipmentOrganization(name);
                 organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.PersonDepartment.getValue())){
                 organization=new PersonOrganization(name);
                 organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.ReceptionistDepartment.getValue())){
                 organization=new ReceptionistOrganization(name);
                 organizationList.add(organization);
        }
        
        return organization;
    }
    
}
