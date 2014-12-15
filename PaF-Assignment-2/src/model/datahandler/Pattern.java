/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.datahandler;

import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Rory
 */
public class Pattern implements Serializable {
    private String name, problem, solution, consequences;
    private BufferedImage image;

    private ArrayList<Pattern> allRelatedPatterns = new ArrayList<>();
    private ArrayList<Context> allContexts = new ArrayList<>();
    private ArrayList<Participant> allParticipants = new ArrayList<>();
    
    public Pattern(){
        
    }
    
    public Pattern(String name, String problem, String solution, String consequences, BufferedImage image) {
        this.name = name;
        this.problem = problem;
        this.solution = solution;
        this.consequences = consequences;
        this.image = image;
    }
    
    public boolean addRelatedPattern(Pattern p){
        for(Pattern pa : allRelatedPatterns){
            if(pa == p)
                return false;
        }
        allRelatedPatterns.add(p);
        return true;
    }
    
    public boolean deleteRelatedPattern(Pattern p){
        return allRelatedPatterns.remove(p);
    }
    
    public boolean addContext(Context c){
        for(Context co : allContexts){
            if(co == c)
                return false;
        }
        allContexts.add(c);
        return true;
    }
    
    public boolean deleteContext(Context c){
        return allContexts.remove(c);
    }
    
    public boolean addParticipant(String name, String visibility, boolean isInterface, 
                                                    boolean isStatic, boolean isAbstract){
        for(Participant p : allParticipants){
            if(p.getName().equals(name))
                return false;
        }
        allParticipants.add(new Participant(name, visibility, isInterface, isStatic, isAbstract));
        return true;
    }
    
    public boolean deleteParticipant(Participant p){
        return allParticipants.remove(p);
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getConsequences() {
        return consequences;
    }

    public void setConsequences(String consequences) {
        this.consequences = consequences;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public ArrayList<Pattern> getAllRelatedPatterns() {
        return allRelatedPatterns;
    }

    public ArrayList<Participant> getAllParticipants() {
        return allParticipants;
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

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
