/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.datahandler;

/**
 *
 * @author Rory
 */
public class Relation {
    private String sortRelation;
    private Participant relatedParticipant;
    
    public Relation(String sort, Participant p){
        this.sortRelation = sort;
        this.relatedParticipant = p;
    }

    public String getSortRelation() {
        return sortRelation;
    }

    public void setSortRelation(String sortRelation) {
        this.sortRelation = sortRelation;
    }

    public Participant getRelatedParticipant() {
        return relatedParticipant;
    }

    public void setRelatedParticipant(Participant relatedParticipant) {
        this.relatedParticipant = relatedParticipant;
    }       
}
