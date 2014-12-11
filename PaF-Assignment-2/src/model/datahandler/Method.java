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
public class Method extends Subject{

    public Method(String name, String visibility, boolean isStatic, boolean isAbstract) {
        this.name = name;
        this.visibility = visibility;
        this.isStatic = isStatic;
        this.isAbstract = isAbstract;
    }
    
}
