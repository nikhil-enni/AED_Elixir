/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;


//import Business.Customer.CustomerDirectory;
//import Business.DeliveryMan.DeliveryManDirectory;
//import Business.Restaurant.RestaurantDirectory;
import business.enterprise.Enterprise;
import business.equipment.EquipmentList;
import business.medicalEmployment.DoctorList;
import business.medicalEmployment.PatientList;
import business.medicalEmployment.AmbulanceList;
import business.network.Network;
import business.Organization.Organization;
import business.role.Role;
import business.role.SystemAdminRole;
import business.userAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
     private ArrayList<Network> networkList;
     private PatientList patientDirectory;
     private DoctorList doctroDirectory;
     private AmbulanceList ambulanceDirectory;
     private EquipmentList equipmentList;
//    private RestaurantDirectory restaurantDirectory;
//    private CustomerDirectory customerDirectory;
//    private DeliveryManDirectory deliveryManDirectory;
    public EcoSystem(String name) {
        
//        this.restaurantDirectory = restaurantDirectory;
//        this.customerDirectory = customerDirectory;
//        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    private EcoSystem(){
        super(null);
        networkList = new ArrayList<Network>();
        patientDirectory = new PatientList();
        doctroDirectory = new DoctorList();
        ambulanceDirectory = new AmbulanceList();
        equipmentList = new EquipmentList();

       
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    
    public boolean checkIfUserIsUnique(String userName){
         if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            return false;
        }

        for (Network network : this.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getUsername().equalsIgnoreCase(userName)) {
                        return false;
                    }
                }
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getUsername().equalsIgnoreCase(userName)) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
    
//     public boolean checkIfUserIsUnique(String userName, EcoSystem ecoSys){
//        if(ecoSys==null){
//            System.out.println("BUSINESS IS NULL");
//        }
//        for (Network network : ecoSys.getNetworkList()) {
//            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
//                for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
//                    if (ua.getUsername().equalsIgnoreCase(userName)) {
//                        return false;
//                    }
//                }
//                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
//                    for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
//                        if (ua.getUsername().equalsIgnoreCase(userName)) {
//                            return false;
//                        }
//                    }
//                }
//            }
//        }
//
//        return true;
//        
//    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }

    public DoctorList getDoctroDirectory() {
        return doctroDirectory;
    }

    public void setDoctroDirectory(DoctorList doctroDirectory) {
        this.doctroDirectory = doctroDirectory;
    }

    public AmbulanceList getAmbulanceDirectory() {
        return ambulanceDirectory;
    }

    public void setAmbulanceDirectory(AmbulanceList ambulanceDirectory) {
        this.ambulanceDirectory = ambulanceDirectory;
    }

    public EquipmentList getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(EquipmentList equipmentList) {
        this.equipmentList = equipmentList;
    }



    public PatientList getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientList patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    
}
