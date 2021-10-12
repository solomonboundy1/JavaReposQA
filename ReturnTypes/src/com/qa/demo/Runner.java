package com.qa.demo;

public class Runner {
	public static void main(String[] args) {
		//boo();
		//helloWorld();
		// I'm accessing the class (ReturnTypes).method
		//System.out.println(ReturnTypes.returnInt());
//		System.out.println(ReturnTypes.returnString());
//		System.out.println(ReturnTypes.returnBool());
//		System.out.println(ReturnTypes.returnChar());
//		System.out.println(ReturnTypes.returnFloat());
//		System.out.println(ReturnTypes.returnNothing());
		
		ReturnTypes NewReturnTypes = new ReturnTypes();
		
		System.out.println(NewReturnTypes.returnFloat());
	}

	// Creating a method that prints out hello world
	// getting our main to run that method
	
	// This is what we'd put in MAIN
	
	public static void helloWorld() {
		System.out.println("Hello World");
	}
	
	public static void boo() {
		System.out.println("spooooooooky");	
	}
}
