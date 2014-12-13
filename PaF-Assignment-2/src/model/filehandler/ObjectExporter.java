/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.filehandler;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.datahandler.Pattern;

/**
 *
 * @author Izak
 */
public class ObjectExporter extends Exporter {

	@Override
	public boolean exportFile(String name, String path, Pattern pattern) {
		try {
			FileOutputStream fout = new FileOutputStream("" + path);
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(pattern);
			oos.close();
			return true;
		} catch (IOException e) {
			return false;
		}
	}

}
