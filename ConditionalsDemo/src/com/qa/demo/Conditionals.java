package com.qa.demo;

public class Conditionals {
	
	// Conditionals allow developers to check values and make decisions based off of answers.
	// If something is x, do y, else do z
	
	// If Else statement
	
	public static void kettleDemo() {
		
		boolean kettleOn = true;
		
		if(kettleOn == true) {
			System.out.println("kettle is on");
			
		} else {
			System.out.println("kettle is off");
		}
	}
	// I want to know if a number is greater than, equal or less than 10
	public static void numberDemo() {
		
		int number = 20;
		
		if(number > 10) {
			System.out.println("Number greater than 10");
		} else if(number == 10) {
			 
				System.out.println("Number is equal to 10");
		} else if(number <10) {
			System.out.println("Number is less than 10");
		}
	}
	public static void oddEvenDemo() {
		int num = 12;
		
		if(num % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
	}
	
	public static void complexConditionals() {
		
		int number = 15;
		String colour = "red";
		
		if(number < 10 && colour == "red") {
			System.out.println("True!");
		} else {
			System.out.println("False!");
		}
	}
	
	
}


// Conditional Operators
// ==
// > / <
// >= / <=
// !=
// &&
// ||


