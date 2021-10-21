package com.qa.mythological;


//parent class
// our subclasses will inherit data from this
public class MythologicalCreature {

	// Any attributes or methods we writer in here CAN be inherited by our subclasses
	// Except from PRIVATE attribultes or fields
	
	// Public - Every class within a project has access
	// Private - Only this class has access to it
	// Protected -  This class and subclasses
	// Default (unspecified) - accessible ANYWHERE in your package 
	
	// These are our fields
	public boolean magical;
	
	
	
	// Create a method
	
	public boolean isMagical() {
		return magical;
	}
	
	



	public void setMagical(boolean isMagical) {
		this.magical = isMagical;
	}



	public String magicPower() {
		return "does some power";
	}
}
