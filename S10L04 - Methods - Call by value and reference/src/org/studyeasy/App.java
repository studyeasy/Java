package org.studyeasy;

public class App {

	public static void main(String[] args) {
		String[] names = {"Chaand", "John","Steve","Pooja","Rahul"};
		App app = new App();
		app.displayNames(names);
		System.out.println("*************");
		System.out.println(names[0]);
	}
	
    void displayNames(String[] names){
    	names[0] = "Salim";
    
    	for(String name: names){
    		System.out.println(name);
    	}
    }

}
