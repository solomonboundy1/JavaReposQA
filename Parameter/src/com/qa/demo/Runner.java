package com.qa.demo;

public class Runner {
	
	public static void main(String[] args) {
		
		helloReece();
		helloStudent("Solomon");
		printNumber(6);
		printDetails("Solomon", true, 27);
		challenge.luckyNum(27);
		challenge.favSport("Basketball");
		challenge.myFloat(7.6420f);
		challenge.currentAge(true, 31.3282f);
		challenge.currentTemp(27.5f, "warm");
		challenge.favTypes('S', true, 27);
		challenge.addNum(1, 1);
		
		
		
	}

	// Creating a method that prints Hello Reece
	public static String helloReece() {
		System.out.println("Hello Reece");
		return "Hello Reece";
	}
	
	// Creating a method that passes in a name
	public static String helloStudent(String name) {
		System.out.println("Hello " + name);
		return name;
	}
	// Method that takes in a number and prints it
	public static void printNumber(int num) {
		System.out.println("The number is " + num);
		
	}
	
	// I want to create a method that takes in a string (name) bool (likes pineapple on pizza) and int (fav num)
	
	public static void printDetails(String name, boolean pineapplePizza, int favNumber) {
		
		System.out.println("My name is " + name + ", pineapple on pizza is good: " + pineapplePizza + ", my fav number is: " + favNumber);
		
	}
	// create methods that take in the following variables and prints them out:
	// -int
	// -string
	// -float
	// -boolean, float
	// float, String
	// -char, boolean, int
	
	
}
