package com.qa.lizard;

// Our Abstract class
// If something is an abstract class,
// it can not be instantiated(can't make objects out of it)
// Abstract classes are like recipes for other classes
// Abstract classes are like recipes for other classes

// public abstract class <class name>
public abstract class Lizard {
	
	// we do not have a constructor or fields here
	
	// Is an abstract method
	// no body {} - purpose is to ensure all subclasses have this method
	public abstract void sleep();
	
	// regular method
	public void shedSkin() {
		System.out.println("Skin shedded.. grim");
	}

}
