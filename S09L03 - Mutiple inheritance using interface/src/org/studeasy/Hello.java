package org.studeasy;

import org.studeasy.person.NonVegan;
import org.studeasy.person.Person;
import org.studeasy.person.Vegan;

public class Hello {

	public static void main(String[] args) {
		Person john = new Vegan();
		john.breathe();
		john.eat();
		john.speak();
		john.message();
		

	}

}
