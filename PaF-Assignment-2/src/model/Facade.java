/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import model.datahandler.DataHandler;
import model.datahandler.Pattern;
import model.filehandler.FileHandler;

/**
 *
 * @author Izak
 */
public class Facade {
    private static DataHandler dataHandler;
    private static FileHandler fileHandler;
    private static Facade instance = null; 
    
    public static Facade getInstance(){
        if(instance == null){
            instance = new Facade();
            dataHandler = DataHandler.getInstance();
            fileHandler = FileHandler.getInstance();
        } 
        return instance;
        
    }
    
    protected Facade(){
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
    
    public boolean exportPattern(String filename, String type, String path, String patternname){
        Pattern p = dataHandler.getPattern(patternname);
        return fileHandler.exportFile(filename, type, path, p);
    }
    
    public boolean importPattern(String path){
        try{
            Pattern p = fileHandler.importFile(path);
            System.out.println("1");
            System.out.println(p.getName());
            dataHandler.getAllPatterns().add(p);
            System.out.println(p.getName() + "gfdcagsdhkf");
            return true;
        } catch(Exception e){
            System.out.println("2");
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean addPattern(String name, String problem, String solution, String consequences, BufferedImage image){
        return dataHandler.addPattern(name, problem, solution, consequences, image);
    }
    
    public boolean deletePattern(String name){
        return dataHandler.deletePattern(name);
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
