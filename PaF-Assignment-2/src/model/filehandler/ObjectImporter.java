/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.filehandler;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import model.datahandler.Pattern;

/**
 *
 * @author Izak
 */
public class ObjectImporter extends Importer {

	@Override
	public Pattern importFile(String path) {
            Pattern p = new Pattern();
            try {
		InputStream file = new FileInputStream(path);
                InputStream buffer = new BufferedInputStream(file);
                ObjectInput input = new ObjectInputStream (buffer);
                if (input instanceof Pattern){
                    p = (Pattern)input;
                }
		return p;
            } catch(Exception e){
                return p;
            }
	}
   
}
