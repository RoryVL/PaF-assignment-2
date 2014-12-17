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
public class Scope extends Context implements Serializable {
    //private ArrayList<Scope> allSubScopes = new ArrayList<>();

    public Scope(String name) {
        this.name = name;
    }
    
    @Override
    public void setSuperContext(Context superContext) {
        if(superContext instanceof Scope && superContext != this){
            this.superContext = superContext;
        }
    }
    
    /*public boolean addSubScope(Scope s){
        for(Scope sc : allSubScopes){
            if(sc==s)
                return false;
        }
        allSubScopes.add(s);
        return true;
    }*/
    
    /*public boolean deleteSubScope(Scope s){
        return allSubScopes.remove(s);
    }*/
    
    /*public ArrayList<Scope> getAllSubScopes() {
        return allSubScopes;
    }*/
}
