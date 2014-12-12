/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.image.BufferedImage;
import java.lang.reflect.Array;
import java.util.ArrayList;
import model.datahandler.DataHandler;
import model.datahandler.Pattern;
import model.filehandler.FileHandler;

/**
 *
 * @author Izak
 * All methods have still to be implemented
 */
public class Facade {
    private DataHandler dataHandler;
    private FileHandler fileHandler;
    
    public Facade(){
        DataHandler d = new DataHandler();
        FileHandler f = new FileHandler();
        setDataHandler(d);
        setFileHandler(f);
    }
    
    public ArrayList<String> getAllPaternNames(){
        ArrayList<Pattern> allPaternNames = new ArrayList<Pattern>();
        allPaternNames = dataHandler.getAllPatterns();
        ArrayList<String> allNames = new ArrayList<String>();
        for (Pattern a: allPaternNames){
            allNames.add(a.getName());
        }
        return allNames;
    }
    
    public Pattern getPattern(String name){
        return dataHandler.getPattern(name);
    }
    
    public boolean exportPattern(String patternname, String filename, String path, String type){
        
    }
    
    public boolean importPattern(String path){
        
    }
    
    public boolean addPattern(String name, String problem, String solution, String consequences, BufferedImage image){
        dataHandler.addPattern(name, problem, solution, consequences, image);
    }
    
    public boolean deletePattern(String name){
        
    }

    /**
     * @return the dataHandler
     */
    public DataHandler getDataHandler() {
        return dataHandler;
    }

    /**
     * @param dataHandler the dataHandler to set
     */
    public void setDataHandler(DataHandler dataHandler) {
        this.dataHandler = dataHandler;
    }

    /**
     * @return the fileHandler
     */
    public FileHandler getFileHandler() {
        return fileHandler;
    }

    /**
     * @param fileHandler the fileHandler to set
     */
    public void setFileHandler(FileHandler fileHandler) {
        this.fileHandler = fileHandler;
    }
}
