/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.datahandler;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Rory
 */
public class Participant implements Serializable{
    private String name, visibility;
    private boolean isInterface, isStatic, isAbstract;

    private ArrayList<Subject> allSubjects = new ArrayList<>();
    private ArrayList<Relation> allRelations = new ArrayList<>();
    
    public Participant(String name, String visibility, boolean isInterface, boolean isStatic, boolean isAbstract) {
        this.name = name;
        this.visibility = visibility;
        this.isInterface = isInterface;
        this.isStatic = isStatic;
        this.isAbstract = isAbstract;
    }
    
    public boolean addSubject(String type, String name, String visibility, boolean isStatic, 
                                                boolean isAbstract){
        for(Subject s : allSubjects){
            if(s.getName().equals(name))
                return false;
        }
        Subject s = new Subject(type, name, visibility, isStatic, isAbstract);
        return allSubjects.add(s);
    }
    
    public boolean deleteSubject(String name){
        for(Subject s : allSubjects){
            if(s.getName().equals(name))
                return allSubjects.remove(s);
        }
        return false;
    }
    
    public void addRelation(String sort, Participant p){
        allRelations.add(new Relation(sort, p));
    }
    
    public boolean deleteRelation(Relation r){
        return allRelations.remove(r);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public boolean isIsInterface() {
        return isInterface;
    }

    public void setIsInterface(boolean isInterface) {
        this.isInterface = isInterface;
    }

    public boolean isIsStatic() {
        return isStatic;
    }

    public void setIsStatic(boolean isStatic) {
        this.isStatic = isStatic;
    }

    public boolean isIsAbstract() {
        return isAbstract;
    }

    public void setIsAbstract(boolean isAbstract) {
        this.isAbstract = isAbstract;
    }

    public ArrayList<Subject> getAllSubjects() {
        return allSubjects;
    }

    public ArrayList<Relation> getAllRelations() {
        return allRelations;
    }
    
    
}
