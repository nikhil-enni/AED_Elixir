/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.equipment;

import java.util.ArrayList;

/**
 *
 * @author sri_sai_nikhil_enni
 */
public class EquipmentList {
    private ArrayList<Equipment> equipmentList;

    public EquipmentList() {
        this.equipmentList = new ArrayList();
    }
    
    public Equipment addNewEquip(String equipmetName, String Desc, String availableQuant, double cost,double totalcost)
    {
        Equipment equipment = new Equipment(equipmetName, Desc, availableQuant, cost,totalcost);
        equipmentList.add(equipment);
        return equipment;
        
    }

    public ArrayList<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(ArrayList<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }
    
    
}
