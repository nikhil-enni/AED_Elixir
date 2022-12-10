/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

import business.medicalEmployment.Ambulance;
import business.medicalEmployment.Doctor;
import business.medicalEmployment.Patient;
import business.network.Network;
import business.organization.Organization;
import business.userAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author singh
 */
public class EmergencyPatientRequest extends WorkRequest {
    
    
    private Organization senderOrganization;
    private Organization recieverOrganization;
    private Network senderNetwork;
    private Network recieverNetwork;
    private Patient patient  ;
    private String criticality; //MEdium . low . High
    Doctor EmergencyDoctor ;
    Doctor  patientLastDoctor ;
    String emergencyRequestId ;
    Ambulance ambulance;
    Date requestdate;
    Date acknowledgeDate;
    Date resolveDate;
    String Status ;
    UserAccount acceptedUser;
    int min = 100;
    int max = 999;

    public EmergencyPatientRequest() {
        int randomNum = (int)(Math.random() * (max - min + 1) + min);
        emergencyRequestId= "ER"+randomNum;
        
    }

    public Ambulance getAmbulance() {
        return ambulance;
    }

    public void setAmbulance(Ambulance ambulance) {
        this.ambulance = ambulance;
    }

    public UserAccount getAcceptedUser() {
        return acceptedUser;
    }

    public void setAcceptedUser(UserAccount acceptedUser) {
        this.acceptedUser = acceptedUser;
    }
    
    
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getCriticality() {
        return criticality;
    }

    public void setCriticality(String criticality) {
        this.criticality = criticality;
    }



    public Doctor getEmergencyDoctor() {
        return EmergencyDoctor;
    }

    public void setEmergencyDoctor(Doctor EmergencyDoctor) {
        this.EmergencyDoctor = EmergencyDoctor;
    }

    public Doctor getPatientLastDoctor() {
        return patientLastDoctor;
    }

    public void setPatientLastDoctor(Doctor patientLastDoctor) {
        this.patientLastDoctor = patientLastDoctor;
    }

    public String getEmergencyRequestId() {
        return emergencyRequestId;
    }

    public void setEmergencyRequestId(String emergencyRequestId) {
        this.emergencyRequestId = emergencyRequestId;
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
    
    
    @Override
    public String toString() {
        return emergencyRequestId;
    }
    
    
}
