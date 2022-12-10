/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.vitalSigns;

import java.util.ArrayList;

/**
 *
 * @author Sandeep
 */
public class VitalSignsHistory {
    private ArrayList<VitalSigns> history;
    
    public VitalSignsHistory()
    {
        history = new ArrayList();
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    
}
