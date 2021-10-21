package com.qa.runner;

import com.qa.penguin.Penguin;

public class Runner {
	
	public static void main(String[] args) {
		Penguin paulie = new Penguin(true, "Paulie", 3.0f);
		Penguin patricia = new Penguin(false, "Patricia", 2.8f);
		
		System.out.println(paulie.name);
		System.out.println(patricia.name);
		System.out.println(Penguin.animal);
		
	}

}
