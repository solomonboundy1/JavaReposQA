package com.qa.demo;

public class ForLoops {
	
	// For Loops are for when you know how long the loop should go on FOR
	
	// They have four distinct components to make up
	// Initialisation (Initial value)
	// Condition (What it checks for)
	// Iterator (How the value changes)
	// Code block (what do you want to loop)
	
	public void loopDemo() {
		
		// Create a loop that counts to 10
		// keyword 'for'
		for (
				int i = 0; // Initialisation (starting point)
				i < 10; // Condition (When does the loop stop)
				i++ // How does i change
			) {
				System.out.println("Value of i is: " + i);
		}
		
		// Create loop that counts from 10 to 1
		
		for(int x = 10; x > 0; x--) {
			System.out.println("Value of x is: " + x);
		}
		
		
		for(int y = 20; y < 100; y+= 5) {
			
			System.out.println("Value of y is: " + y);
		}
	}
	
	

}
