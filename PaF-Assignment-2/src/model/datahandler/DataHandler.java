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
    
    public DataHandler(){}
    
    public boolean addContext(String name, String type){
        for(Context c : allContexts){
            if(c.getName().equals(name))
                return false;
        }
        if(type.equals("Scope"))
            allContexts.add(new Scope(name));
        else if(type.equals("Purpose"))
            allContexts.add(new Purpose(name));
        return true;
    }
    
    public boolean deleteContext(String name){
        for(Context c : allContexts){
            if(c.getName().equals(name))
                return allContexts.remove(c);
        }
        return false;
    }
    
    public void addPattern(String problem, String solution, 
                                        String consequences, BufferedImage image){
        allPatterns.add(new Pattern(problem, solution, consequences, image));
    }
    
    public boolean deletePattern(Pattern p){
        return allPatterns.remove(p);
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
}