package org.studyeasy;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
	
		try {
			FileReader in = new FileReader("file.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}	
}
