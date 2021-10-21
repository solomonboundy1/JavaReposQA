package com.qa.cakeTin;

//This will be used to create CAKES
//You'd create objects of the same name from a class
//cake -> cake

public class CakeTin {
	
	// Class level variables for our cake
	// The attributes / fields of our class
	
	// public is the accessibility of a variable
	// Anything with the package can access it
	
	public String filling;
	public int tiers;
	public String colour;
	public boolean icing;
	
	// A constructor to create a cake object from our class
	// This is the method we will be calling from our main
	
	public CakeTin(String filling, String colour, boolean icing) {
		super();
		this.filling = filling;
		this.colour = colour;
		this.icing = icing;
	}
	
	
	public CakeTin(String filling, int tiers) {
		super();
		this.filling = filling;
		this.tiers = tiers;
	}


	//No return type AND the exact name of the class
	public CakeTin(String filling, int tiers, String colour, boolean icing) {
		
		// What we need inside is to define the properties of our cake
		super();
		this.filling = "coffee cream";
		this.tiers = 2;
		this.colour = "beigey brown";
		this.icing = false;
	}


	public String getFilling() {
		return filling;
	}


	public void setFilling(String filling) {
		this.filling = filling;
	}


	public int getTiers() {
		return tiers;
	}


	public void setTiers(int tiers) {
		this.tiers = tiers;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public boolean isIcing() {
		return icing;
	}


	public void setIcing(boolean icing) {
		this.icing = icing;
	}


	@Override
	public String toString() {
		return "CakeTin [filling=" + filling + ", tiers=" + tiers + ", colour=" + colour + ", icing=" + icing + "]";
	}

}
