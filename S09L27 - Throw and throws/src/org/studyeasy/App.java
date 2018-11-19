package org.studyeasy;

import java.io.FileNotFoundException;

public class App {

	public static void main(String[] args) {
		try {
			someMethod();
		} catch (FileNotFoundException e) {
			System.out.println("catch block of main method");
		} catch (Exception e) {
			System.out.println("catch block of main method (Exception)");
		}
		
		
	}
	public static void someMethod() throws Exception{
		System.out.println("Message from someMethod");
		throw new Exception();
		
	}
}
