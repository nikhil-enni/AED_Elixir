/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;
import business.organization.Organization;
import business.organization.OrganizationDirectory;
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes

/**
 *
 * @author sri_sai_nikhil_enni
 */
public abstract class Enterprise extends Organization {
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private Organization organization;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }


    public enum EnterpriseType{
        EmergencyUnit("Emergency Unit"), 
        AccountingUnit("Account Unit"), 
        ManagementUnit("Management Unit"),   /*, FundsOperatingUnit("Funds Operating Unit")*/
        MedicalUnit("Medical Unit"),
        EquipmentUnit("Equipment Unit");
        
        
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
    
    
}
