/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import java.util.ArrayList;

/**
 *
 * @author ashleshagokhale
 */
public class EnterpriseDirectory {
     private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList();
    }

     
     
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
     
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.EmergencyUnit) {
            enterprise = new EmergencyUnit(name);
            enterpriseList.add(enterprise);
        }
        
        else if (type == Enterprise.EnterpriseType.AccountingUnit) {
            enterprise = new AccountingUnit(name);
            enterpriseList.add(enterprise);
        }
         
        else if (type == Enterprise.EnterpriseType.EquipmentUnit) {
         enterprise = new EquipmentUnit(name);
         enterpriseList.add(enterprise);
        }
        
        else if (type == Enterprise.EnterpriseType.ManagementUnit) {
            enterprise = new ManagementUnit(name);
            enterpriseList.add(enterprise);
        }
        
         else if (type == Enterprise.EnterpriseType.MedicalUnit) {
            enterprise = new MedicineUnit(name);
            enterpriseList.add(enterprise);
        }
        
        
        
//        if (type == Enterprise.EnterpriseType.Home) {
//            enterprise = new HomeEnterprise(name);
//            enterpriseList.add(enterprise);
//        }
//        if (type == Enterprise.EnterpriseType.Government) {
//            enterprise = new GovernmentEnterprise(name);
//            enterpriseList.add(enterprise);
//        }

        return enterprise;
    }
     
}
