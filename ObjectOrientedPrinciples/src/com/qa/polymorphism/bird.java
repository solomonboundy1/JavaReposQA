package com.qa.polymorphism;

public class bird {
	
	public String featherColour;
	
	
	


	public void makeNoise() {
		
		System.out.println("Tweet");
	}
	
	public bird(String featherColour) {
		super();
		this.featherColour = featherColour;
	}

}
