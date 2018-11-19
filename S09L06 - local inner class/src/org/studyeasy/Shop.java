package org.studyeasy;

import org.studyeasy.shop.Door;

public class Shop {

	public static void main(String[] args) {
		Door door = new Door();
		if(door.isLocked(args[0])){
			System.out.println("Shop has closed, visit later");
		}else{
			System.out.println("Welcome, we are open :)");
		}
		System.out.println(args[1]);
		System.out.println(args[2]);


	}
}
