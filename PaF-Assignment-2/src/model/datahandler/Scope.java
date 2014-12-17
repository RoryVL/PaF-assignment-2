/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.datahandler;

import java.io.Serializable;

/**
 *
 * @author Rory
 */
public class Scope extends Context implements Serializable {
    private Scope superScope;

    public Scope(String name) {
        this.name = name;
    }
    
    public void addSuperScope(Scope s){
        this.superScope = s;
    }
    
    public void deleteSuperScope(){
        superScope = null;
    }
    
    public Scope getSuperScope() {
        return superScope;
    }
}
