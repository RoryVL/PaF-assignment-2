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
    public Purpose superPurpose = null;

    public Purpose(String name) {
        this.name = name;
    }
    
    public void addSuperPurpose(Purpose p){
        this.superPurpose = p;
    }
    
    public void deleteSuperPurpose(){
        superPurpose = null;
    }
    
    public Purpose getSuperPurpose() {
        return superPurpose;
    }
}
