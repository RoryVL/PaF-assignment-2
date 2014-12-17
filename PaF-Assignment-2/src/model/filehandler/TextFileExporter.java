/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.filehandler;

import java.io.FileWriter;
import java.io.PrintWriter;
import model.datahandler.Context;
import model.datahandler.Participant;
import model.datahandler.Pattern;
import model.datahandler.Relation;
import model.datahandler.Subject;

/**
 *
 * @author Izak
 */
public class TextFileExporter extends Exporter {

    @Override
    public boolean exportFile(String name, String path, Pattern pattern) {
        try{
            System.out.println("test 1" + pattern);
            FileWriter fw = new FileWriter("" + path + "\\name" + ".txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println("patNam_" + pattern.getName());
            pw.println("patPro_" + pattern.getProblem());
            pw.println("patSol_" + pattern.getSolution());
            pw.println("patCon_" + pattern.getConsequences());
            
            for(Context c: pattern.getAllContexts()){
                pw.println("conNam_" + c.getName());
            }
            for(Participant p: pattern.getAllParticipants()){
                pw.println("parNam_" + p.getName());
                pw.println("parVis_" + p.getVisibility());
                pw.println("parInt_" + p.isIsInterface());
                pw.println("parSta_" + p.isIsStatic());
                pw.println("parAbs_" + p.isIsAbstract());
                for(Relation r: p.getAllRelations()){
                    pw.println("relSor_" + r.getSortRelation());
                    pw.println("relRel_" + r.getRelatedParticipant().getName());
                }
                for(Subject s: p.getAllSubjects()){
                    pw.println("subTyp_" + s.getType());
                    pw.println("subNam_" + s.getName());
                    pw.println("subVis_" + s.getVisibility());
                    pw.println("subSta_" + s.isIsStatic());
                    pw.println("subAbs_" + s.isIsAbstract());
                }
                System.out.println("test 2");
            }
            pw.close();
            return true;
        } catch(Exception e){
            System.out.println("test 3");
            e.printStackTrace();
            return false;
        }
    }
}
