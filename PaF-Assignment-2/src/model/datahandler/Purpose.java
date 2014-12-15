/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.datahandler;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Rory
 */
public class Purpose extends Context implements Serializable{
    public ArrayList<Purpose> allSubPurposes = new ArrayList<>();

    public Purpose(String name) {
        this.name = name;
    }
    
    public boolean addSubPurpose(Purpose p){
        for(Purpose pu : allSubPurposes){
            if(pu==p)
                return false;
        }
        allSubPurposes.add(p);
        return true;
    }
    
    public boolean deleteSubPurpose(Purpose p){
        return allSubPurposes.remove(p);
    }
    
    public ArrayList<Purpose> getAllSubPurposes() {
        return allSubPurposes;
    }
}
