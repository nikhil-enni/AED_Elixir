 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

import Business.Equipment.Equipment;
import Business.MedicalEmployment.Doctor;
import Business.MedicalEmployment.Patient;
import Business.Network.Network;
import Business.Organization.Organization;
import java.util.Date;

/**
 *
 * @author singh
 */
public class BillingWorkRequest extends WorkRequest {
    
    
    private Organization senderOrganization;
    private Organization recieverOrganization;
    private Network senderNetwork;
    private Network recieverNetwork;
    private String billingRequestId;
    private String EquipmentId;
    private String EquipmentName;
    private int noOfUnits;
    private double fundsAvailable;
    private double equipmentPrice;
    private double totalEquipmentCost;
    private Equipment equipment;
    private double fundAllocated;
    private String status;
    Date requestdate;
    Date acknowledgeDate;
    Date resolveDate;
    String Status ;
    int min = 100;
    int max = 999;

    public BillingWorkRequest () {
        int randomNum = (int)(Math.random() * (max - min + 1) + min);
        billingRequestId= "BR"+randomNum;
        
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public String getBillingRequestId() {
        return billingRequestId;
    }

    public String getEquipmentId() {
        return EquipmentId;
    }

    public void setEquipmentId(String EquipmentId) {
        this.EquipmentId = EquipmentId;
    }

    public void setBillingRequestId(String billingRequestId) {
        this.billingRequestId = billingRequestId;
    }

    public double getFundAllocated() {
        return fundAllocated;
    }

    public void setFundAllocated(double fundAllocated) {
        this.fundAllocated = fundAllocated;
    }
    
   
    public Date getRequestdate() {
        return requestdate;
    }

    public void setRequestdate(Date requestdate) {
        this.requestdate = requestdate;
    }

    public Date getAcknowledgeDate() {
        return acknowledgeDate;
    }

    public void setAcknowledgeDate(Date acknowledgeDate) {
        this.acknowledgeDate = acknowledgeDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Organization getSenderOrganization() {
        return senderOrganization;
    }

    public void setSenderOrganization(Organization senderOrganization) {
        this.senderOrganization = senderOrganization;
    }

    public Organization getRecieverOrganization() {
        return recieverOrganization;
    }

    public void setRecieverOrganization(Organization recieverOrganization) {
        this.recieverOrganization = recieverOrganization;
    }

    public Network getSenderNetwork() {
        return senderNetwork;
    }

    public void setSenderNetwork(Network senderNetwork) {
        this.senderNetwork = senderNetwork;
    }

    public Network getRecieverNetwork() {
        return recieverNetwork;
    }

    public void setRecieverNetwork(Network recieverNetwork) {
        this.recieverNetwork = recieverNetwork;
    }

    public String getEquipmentName() {
        return EquipmentName;
    }

    public void setEquipmentName(String EquipmentName) {
        this.EquipmentName = EquipmentName;
    }

    public int getNoOfUnits() {
        return noOfUnits;
    }

    public void setNoOfUnits(int noOfUnits) {
        this.noOfUnits = noOfUnits;
    }

    public double getFundsAvailable() {
        return fundsAvailable;
    }

    public void setFundsAvailable(double fundsAvailable) {
        this.fundsAvailable = fundsAvailable;
    }

    public double getEquipmentPrice() {
        return equipmentPrice;
    }

    public void setEquipmentPrice(double equipmentPrice) {
        this.equipmentPrice = equipmentPrice;
    }

    public double getTotalEquipmentCost() {
        return totalEquipmentCost;
    }

    public void setTotalEquipmentCost(double totalEquipmentCost) {
        this.totalEquipmentCost = totalEquipmentCost;
    }
    
    
    @Override
    public String toString() {
        return billingRequestId;
    }
    
    
}
