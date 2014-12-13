/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.filehandler;

import java.io.File;
import model.datahandler.Pattern;

/**
 *
 * @author Rory
 */
public class FileHandler {
    public FileHandler(){
        
    }
    
    public String checkFileFormat(String file){
        return file.substring(file.length() - 3);
    }
    
    public boolean importFile(String path){
        @SuppressWarnings("UnusedAssignment")
        ObjectImporter i = new Importer() {};
        String format = checkFileFormat(path);
        if(format.equals("obj")){
            i = new ObjectImporter();
        } else if(format.equals("txt")){
            i = new TextFileImporter();
        } else {
            return false;
        }
        return i.importFile(path);
    }
    
    public boolean exportFile(String name, String type, String path, Pattern pattern){
        
    }
}