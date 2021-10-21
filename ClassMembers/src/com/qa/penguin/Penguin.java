package com.qa.penguin;

public class Penguin {
	
	// Static = Class specific variable
	// Opposite of static = instanced
	// Each instance of that class has unique values
	
	// If not specific as static, variables are instanced
	// Each instance of this class has unique values
	
	// Up to this point we have been working with CLASSES
	// Now we are working with OBJECTS so variables / methods 
	// do not need to be static
	
	public boolean hasHappyFeet;
	public String name;
	public float height;
	
	// A static variable will be the same across all objects
	//e.g
	public static String animal = "Penguin";
	
	
	public Penguin(boolean hasHappyFeet, String name, float height) {
	super();
	this.hasHappyFeet = hasHappyFeet;
	this.name = name;
	this.height = height;
	}
	
	// created an instanced method that just prints out noot noot
	public void noise() {
		System.out.println("Noot noot");
	}
}
