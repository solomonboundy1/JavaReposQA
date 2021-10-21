package com.qa.manager;

import java.util.ArrayList;

import com.qa.dragon.Dragon;

public class Manager {
	
	Dragon charizard = new Dragon("Fire", true, "Charlie", 10);
	Dragon dragonite = new Dragon("Fire", true, "dragonite", 15);
	
	ArrayList<Dragon> animalList = new ArrayList<>();
	
	public void addDragons() {
		
		animalList.add(charizard);
		
	}
	
	public void viewDragons() {
		
		System.out.println(animalList);
	}

}
