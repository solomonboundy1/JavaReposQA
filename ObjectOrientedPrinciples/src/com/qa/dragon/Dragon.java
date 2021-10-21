package com.qa.dragon;

import com.qa.lizard.Lizard;

// Extending abstract classes works the same way as parent classes
public class Dragon extends Lizard {
	
	private String breathType;
	private boolean canFly;
	private String name;
	private int wingSpan;
	
	
	public Dragon(String breathType, boolean canFly, String name, int wingSpan) {
		super();
		this.breathType = breathType;
		this.canFly = canFly;
		this.name = name;
		this.wingSpan = wingSpan;
		
		// Encapsulation - The idea that data should be accessible of least privilege
		// Only stuff that needs to know the data, should know it
		
		// What methods can change data
		// What methods can read data
		// What the data can be changed to
		// If the data should be changable at all
		
		// We achieve this through getters and setters.
		
		
	}


	public String getBreathType() {
		return breathType;
	}


	public void setBreathType(String breathType) {
		this.breathType = breathType;
	}


	public boolean isCanFly() {
		return canFly;
	}


	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		
		if (name == "charizard") {
			System.out.println("Don't do that, we'll get sued");
			this.name = "charlie";
		} else {
			this.name = name;
		}
	}


	public int getWingSpan() {
		return wingSpan;
	}


	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}


	@Override
	public void sleep() {
		System.out.println("Lounges on a pile of gold");
		
	}


	@Override
	public String toString() {
		return "Dragon [breathType=" + breathType + ", canFly=" + canFly + ", name=" + name + ", wingSpan=" + wingSpan
				+ "]";
	}
	

}
