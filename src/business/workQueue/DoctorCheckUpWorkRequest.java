/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

import Business.MedicalEmployment.Doctor;
import Business.MedicalEmployment.Patient;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.VitalSigns.VitalSigns;
import java.util.Date;

/**
 *
 * @author Sandeep
 */
public class DoctorCheckUpWorkRequest extends WorkRequest {
    private VitalSigns checkUp;
    private Organization senderOrganization;
    private Organization recieverOrganization;
    private Network senderNetwork;
    private Network recieverNetwork;
    private Patient patient  ;
    private Doctor doctor;
    Date requestdate;
    Date acknowledgeDate;
    Date resolveDate;
    String Status ;
    String checkupRequestId ;
      int min = 100;
    int max = 999;

    public DoctorCheckUpWorkRequest() {
        checkUp = new VitalSigns();
        int randomNum = (int)(Math.random() * (max - min + 1) + min);
        checkupRequestId= "CHK"+randomNum;
    }

    public String getCheckupRequestId() {
        return checkupRequestId;
    }

    public void setCheckupRequestId(String checkupRequestId) {
        this.checkupRequestId = checkupRequestId;
    }

    
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    
    public VitalSigns getCheckUp() {
        return checkUp;
    }

    public void setCheckUp(VitalSigns checkUp) {
        this.checkUp = checkUp;
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

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
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
    
    
}
