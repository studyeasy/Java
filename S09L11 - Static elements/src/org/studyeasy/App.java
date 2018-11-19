package org.studyeasy;

import org.studyeasy.testrun.TestStatic;

public class App {

	public static void main(String[] args) {
	 
	   System.out.println("Current variable value: "+TestStatic.getStaticVariable());
	   TestStatic.setStaticVariable(1);
	   System.out.println("Current variable value: "+TestStatic.getStaticVariable());
	   TestStatic.setStaticVariable(24);
	   System.out.println("Current variable value: "+TestStatic.getStaticVariable());
	}

}
