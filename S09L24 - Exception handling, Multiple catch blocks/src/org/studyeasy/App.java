package org.studyeasy;

public class App {

	public static void main(String[] args) {
		int x = 0;
		try{
		
		    System.out.println("We don't know, what will be the outcome "+x/0);
		
		}catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurred");
		}catch (Exception e) {
			System.out.println("Inside exception block");
		}
	}

}
