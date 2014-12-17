/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.datahandler;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author Rory
 */
public class DataHandler {
    private ArrayList<Context> allContexts = new ArrayList<>();
    private ArrayList<Pattern> allPatterns = new ArrayList<>();
    private static DataHandler instance = null;
    
    protected DataHandler(){}
    
    public static DataHandler getInstance(){
        if(instance == null)
            instance = new DataHandler();
        return instance;
    }
    
    public boolean addContext(Context context){
        for(Context c : allContexts){
            if(c.getName().equals(context.getName()))
                return false;
        }
        allContexts.add(context);
        return true;
    }
    
    public boolean deleteContext(String name){
        for(Context c : allContexts){
            if(c.getName().equals(name))
                return allContexts.remove(c);
        }
        return false;
    }

    public boolean addPattern(String name, String problem, String solution, 
                                    String consequences, BufferedImage image){
        for(Pattern p : allPatterns){
            if(p.getName().equals(name))
                return false;
        }
        allPatterns.add(new Pattern(name, problem, solution, consequences, image));
        return true;
    }
    
    public boolean deletePattern(String name){
        for(Pattern p : allPatterns){
            if(p.getName().equals(name))
                return allPatterns.remove(p);
        }
        return false;
    }
    
    public Pattern getPattern(String name){
        Pattern x = null;
        for(Pattern p: allPatterns){
            if(p.getName().equals(name)){
                x = p;
            }
        }
        return x;
    }

    public ArrayList<Pattern> getAllPatterns() {
        return allPatterns;
    }
    
    public ArrayList<Context> getAllContexts() {
        return allContexts;
    }
    
    public ArrayList<Purpose> getAllPurposes() {
        ArrayList<Purpose> p = new ArrayList<>();
        for(Context c : allContexts){
            if(c.getName().equals("Purpose")){
                p.add((Purpose)c);
            }
        }
        return p;
    }
    
    public ArrayList<Scope> getAllScopes() {
        ArrayList<Scope> s = new ArrayList<>();
        for(Context c : allContexts){
            if(c.getName().equals("Scope")){
                s.add((Scope)c);
            }
        }
        return s;
    }
    
    public static void setInstance(DataHandler dh){
        instance = dh;
    }
}
