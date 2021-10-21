package com.qa.runner;

import greet.FormalGreeting;

public class Runner {
	
	public static void main(String[] args) {
		
		FormalGreeting fgreet = new FormalGreeting();
		
		System.out.println(fgreet.greet());
	}

}
