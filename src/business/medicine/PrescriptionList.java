/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.medicine;

import java.util.ArrayList;

/**
 *
 * @author amisha03
 */
public class PrescriptionList {
      private ArrayList<Prescription> prescriptionList;
    
    public PrescriptionList(){
        prescriptionList=new ArrayList<Prescription>();
    }

    public ArrayList<Prescription> getPrescriptionList() {
        return prescriptionList;
    }

    public void setPrescriptionList(ArrayList<Prescription> prescriptionList) {
        this.prescriptionList = prescriptionList;
    }
    
    public Prescription addPrescription(Prescription prescription){
//        Prescription prescription=new Prescription();
         prescriptionList.add(prescription);
         return prescription;
        
    }
}
