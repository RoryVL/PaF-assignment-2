/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.filehandler;

import model.datahandler.Pattern;

/**
 *
 * @author Izak
 */
public abstract class Exporter {
    
    public Exporter(){
        
    }
    
    public abstract boolean exportFile(String name,String path, Pattern pattern);
}
