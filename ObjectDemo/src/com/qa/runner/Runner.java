package com.qa.runner;

import com.qa.cakeTin.CakeTin;

public class Runner {
	
	public static void main(String[] args) {
		
		
//		task
//
//		with the basic constructors created last friday add the following:
//
//		- 2 overloaded constructors (so total of 3 constructors)
//		- Getters and Setters for all fields
//		- toString method
		
		
		// CakeTin is our data type
		// newCake is the name of our variable
		// new CakeTin() means return a new cake object using our constructor
		CakeTin newCake = new CakeTin("Jam", 1, "Beige", true);
		CakeTin cake2 = new CakeTin("Chocolate", 5, "Pink", true);
		CakeTin cake3 = new CakeTin("Chocolate", 3);
		cake3.setColour("brown and white");
		System.out.println(cake3);
	}
	
	// Task
	// Choose an animal that you want to work with (birds, lizards, cat)
	// Create a class called that animal
	// Within the class create at least 4 attributes across different data types
	// create a constructor that creates the animal
	// run the constructor within your runner

}
