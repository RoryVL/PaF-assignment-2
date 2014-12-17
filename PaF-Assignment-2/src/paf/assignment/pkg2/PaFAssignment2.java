/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paf.assignment.pkg2;

import model.Facade;
import model.datahandler.Context;
import model.datahandler.Participant;
import model.datahandler.Pattern;
import model.datahandler.Purpose;
import model.datahandler.Scope;
import view.MainView;

/**
 *
 * @author Rory
 */
public class PaFAssignment2 {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
//		Facade f = new Facade();
//		System.out.println("Test");
//		
//		Context s1 = new Scope("scope1");
//                Context s2 = new Scope("scope2");
//                s2.setSuperContext(s1);
//		Context c1 = new Purpose("purpose1");
//                Context c2 = new Purpose("purpose2");
//                c2.setSuperContext(c1);
//                f.getDataHandler().addContext(s1);
//                f.getDataHandler().addContext(s2);
//                f.getDataHandler().addContext(c1);
//                f.getDataHandler().addContext(c2);
//                f.getDataHandler().addPattern("pName", "pProblem", "pSolution", "pConsequences", null);
//                Pattern p = f.getPattern("pName");
//		p.addContext(s1);
//		p.addContext(s2);
//                p.addContext(c1);
//		p.addContext(c2);
//                p.addParticipant("p1Name", "p1Visibility", false, false, false);
//		p.addParticipant("p2Name", "p2Visibility", false, false, false);
//		p.getAllParticipants().get(1).addRelation("subclass", p.getAllParticipants().get(0));
//                p.getAllParticipants().get(0).addSubject("method", "methodName", "methodVisibility", false, false);
//                p.getAllParticipants().get(0).addSubject("attribute", "attributeName", "attributeVisibility", false, false);
//                
//                f.getFileHandler().exportContexts(null);
//                f.exportPattern("test", "textfile", "C:\\Users\\Izak\\Desktop", "pName");
                
                /*f.importPattern("C:\\Users\\Izak\\Desktop\\name.obj");
                for(Pattern ppp: f.getDataHandler().getAllPatterns()){
                
                    System.out.println(ppp.getName()+"sdfgv");
                    for(Participant asd: ppp.getAllParticipants()){
                        System.out.println(asd.getName());
                    }
                }*/
		MainView mw = new MainView();
	}

}
