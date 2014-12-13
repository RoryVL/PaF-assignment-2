/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paf.assignment.pkg2;

import model.Facade;
import model.datahandler.Context;
import model.datahandler.Pattern;
import model.datahandler.Purpose;
import model.datahandler.Scope;

/**
 *
 * @author Rory
 */
public class PafAssignment2 {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		Facade f = new Facade();
		System.out.println("Test");
		
		Context c1 = new Scope("scope1");
		Context c2 = new Purpose("purpose");
		Pattern p = new Pattern("pName", "pProblem", "pSolution", "pConsequences", null);
		p.addContext(c1);
		p.addContext(c2);
		
		
		
		}

}
