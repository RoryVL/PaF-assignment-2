/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.filehandler;

/**
 *
 * @author Izak
 */
public abstract class Importer {
    
    public Importer(){
        
    }
    
    public abstract boolean importFile(String path);
}
