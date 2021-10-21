package com.qa.demo;

public class Arrays {
	
	// Arrays are lists of data, and contain multiple pieces of data that can be accessed
	// Java Arrays MUST contain collections of like values (int, String, char, boolean etc)
	
	// Strings are just arrays of chars
	// "Hello World" = 'H', 'e', 'l', 'l', 'o' etc
	// Arrays are immutable, the length and data type of an array CANNOT be changed
	// But the values in the array can
	// Arrays are like trains, a train mid journey must be all passengers and the amount of cars cannot change
	// But the people getting on the train can
	
	// There are a few ways of creating them
	// Specify the DATA TYPE
	// Specify the name
	
	public void arrayDemo() {
		
		// Create an array of colours
		// String colour = "red";
		//[] denotes an array
		
		//String[] colourArray;
		
		String[] colourArray = {"Red", "Blue", "Green", "Yellow"};
		// Creating an empty array but specifying the length of it
		//int[] favNumsArray = new int[4];
		
		
		String[] nameArray = {"Solomon", "John", "Jane", "Joe"};
		char[] favLetter = {'a', 'b', 'c', 'd'};
		int[] favNum = {2, 3, 4, 5};
		boolean[] bool = {true, false, true, false};
		
		
		
		// Manipulating arrays / indexing
		
		// With Java, arrays are indexed at 0
		// The first element of an array is marked 0
		
		
		System.out.println(colourArray[1]);
	}
	public void arrayLoop() {
		
		String[] foodArray = {"Pizza", "Lasagna", "Pad Thai", "Toad in the hole"};
		
		// print out every food in the array
		
		for(int i = 0; i <= 3; i++) {
			System.out.println("Value of i is: " + i);
		
		// will iterate over the array and print out	
			System.out.println(foodArray[i]);
		}
		
		// Task
		// Create an array of 1 - 10 numbers
		// Using a for loop print out the square of each of those numbers
		
		// Stretch
		// Create a second empty array of length 10
		// within the original for loop assign the squared values
		
		
		// Stretchier Goal
		// Do the same but put the numbers in reverse
	}	
	public void squareNum() {
			
		int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] numArray2 = {4, 5, 7, 8, 6, 9, 3, 5, 2, 3};
		int[] numArray3 = new int[numArray2.length];
		for(int i = 0; i < 10; i++) {
			
			//System.out.println(numArray[i] * numArray[i]);
		}
		for(int i = 0; i < 10; i++) {
			numArray2[i] = numArray[i] * numArray[i];
			
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(numArray2[i]);
		}
		for(int i = 9; i > -1; i--) {
			System.out.println(numArray2[i]);
		
		}
	
		for(int i=0; i<numArray3.length; i++) {
			
			numArray3[i] = numArray2[numArray2.length-1-i];
			System.out.println(numArray3[i]);
		}
	
	
	}
	public void enhancedForLoop() {
		
		String[] pizzas = {"Pepperoni", "Meat Feast", "Hawaiian", "Calzone", "Veggie"};
		
		// If I wanted to iterate through the list
		
		for(int i = 0; i < pizzas.length; i++) {
			System.out.println(pizzas[i]);
		}
		for(String pizza : pizzas) {
			System.out.println(pizza);
		}
	}
	// you can use an enhanced for each loop
	// for command word
	// data type and stand in variable : array
	
}

