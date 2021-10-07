package com.qa.demo;

public class Scope {
	
	// There are types of Scope
	// What has access to the variables and methods you're creating
	
	// Class level/ Instance Scope - Variables defined INSIDE a class BUT OUTSIDE of methods
	
	// Method/Local Scope - Variables defines INSIDE of methods.
	//And generally only used for that method
	
	//Class level scope variable
	// Accessible to ALL methods within class
	static int numberVar = 123;
	
	public static void methodDemo() {
		System.out.println(numberVar);
	}
	
	public static void conflictingDemo() {
		int numberVar = 20;
		System.out.println(numberVar);
		
	}
	
	
	
	
	
	// Method level or local scope
	
	// These are variables created within a method, that disappear after the method ceases to exist
	//e.g.
	
	public static void localDemo() {
		String password = "unicorn23";
		System.out.println(password);
	}
	public static void printPassword() {
		//impossible
		System.out.println(password);
	}
}
