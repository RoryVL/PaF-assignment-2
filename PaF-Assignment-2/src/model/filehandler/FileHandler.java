/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.filehandler;

import java.io.File;
import java.util.ArrayList;
import model.datahandler.Context;
import model.datahandler.Pattern;

/**
 *
 * @author Rory
 */
public class FileHandler {
    private static FileHandler instance = null;
    
    public FileHandler(){}
    
    public static FileHandler getInstance(){
        if(instance == null)
            instance = new FileHandler();
        return instance;
    }
    
    public String checkFileFormat(String file){
        return file.substring(file.length() - 3);
    }
    
    public Pattern importFile(String path){
        Pattern p = new Pattern();
        Importer i = new TextFileImporter();
        String format = checkFileFormat(path);
        System.out.println("test 1");
        if(format.equals("obj")){
            i = new ObjectImporter();
            System.out.println("test 2");
        } else if(format.equals("txt")){
            i = new TextFileImporter();
            System.out.println("test 3");
        } else {
            System.out.println("test 4");
            return p;
        }
        System.out.println("test 5");
        return i.importFile(path);
    }
    
    public void exportContexts(ArrayList<Context> allContexts){
        ObjectExporter oe = new ObjectExporter();
        oe.exportContexts(allContexts);
    }
    
    public boolean exportFile(String name, String type, String path, Pattern pattern){
    	Exporter e = new TextFileExporter();
    	if (type.equals("textfile")){
    		e = new TextFileExporter();
    	} else if (type.equals("objectfile")){
    		e = new ObjectExporter();
    	} else {
    		return false;
    	}
    	return e.exportFile(name, path, pattern);
    }
    
    public static void setInstance(FileHandler fh){
        instance = fh;
    }
}