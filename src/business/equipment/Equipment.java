/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.equipment;

/**
 *
 * @author sri_sai_nikhil_enni
 */
public class Equipment {
    
    private String equipmentID;
    private String equipmetName;
    private String availableQuant;
    private String desc;
    private double cost;
    private double TotalCost;
     int min = 100;
    int max = 999;

    public Equipment(String equipmetName, String desc, String availableQuant, double cost, double totalcost) {
        this.equipmentID = equipmentID;
        this.equipmetName = equipmetName;
        this.availableQuant = availableQuant;
        this.cost = cost;
        this.desc = desc;
        this.TotalCost = totalcost;
          int randomNum = (int)(Math.random() * (max - min + 1) + min);
        equipmentID= "EQ-"+randomNum;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    
    
    
    public String getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(String equipmentID) {
        this.equipmentID = equipmentID;
    }

    public String getEquipmetName() {
        return equipmetName;
    }

    public void setEquipmetName(String equipmetName) {
        this.equipmetName = equipmetName;
    }

    public String getAvailableQuant() {
        return availableQuant;
    }

    public void setAvailableQuant(String availableQuant) {
        this.availableQuant = availableQuant;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    @Override
    public String toString()
    {
        return this.equipmetName;
    }
    
    
}
