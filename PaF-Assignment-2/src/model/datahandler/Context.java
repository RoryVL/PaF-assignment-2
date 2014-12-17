/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.datahandler;

/**
 *
 * @author Rory
 */
public abstract class Context {
    protected String name;
    protected Context superContext;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public abstract void setSuperContext(Context superContext);

    /**
     * @return the superContext
     */
    public Context getSuperContext() {
        return superContext;
    }
}
