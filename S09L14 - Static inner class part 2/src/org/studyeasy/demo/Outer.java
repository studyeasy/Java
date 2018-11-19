package org.studyeasy.demo;

public class Outer {
	
	public static void testOuterMethod(){
		System.out.println("Value of inner class variable: "+Inner.x);
		Inner.testingInnerMethod();
	}
	
	public static class Inner {
        public static int x = 0;
		public static void testingInnerMethod() {
			System.out.println("Testing inner class method.");
		}
	}

}
