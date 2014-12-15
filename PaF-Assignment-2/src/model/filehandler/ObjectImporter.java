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
            System.out.println("test test 1");
            try {
                    System.out.println("test test 2");
		FileInputStream fis = new FileInputStream(path);
                    System.out.println("path " + path);
                System.out.println("test test 3");
                ObjectInputStream ois = new ObjectInputStream(fis);
                System.out.println("test test 4");
                Object obj = ois.readObject();
                System.out.println("test test 5");
                if (obj instanceof Pattern){
                    System.out.println("test test 6");
                    p = (Pattern)obj;
                    System.out.println(p.getName());
                    System.out.println("test test 7");
                }
                System.out.println("test test 8");
		return p;
            } catch(Exception e){
                e.printStackTrace();
                System.out.println("test test 9");
                return p;
            }
	}
   
}
