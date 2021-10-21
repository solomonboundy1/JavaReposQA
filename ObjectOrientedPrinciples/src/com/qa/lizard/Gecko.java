package com.qa.lizard;

import com.qa.interfaces.Camouflage;
import com.qa.interfaces.Clinbing;

public class Gecko implements Camouflage, Clinbing {
	
	@Override
	public void camouflage() {
		System.out.println("Changes skin to bark");
		
	}
	
	@Override
	public void hide() {
		System.out.println("hides on a tree");
	}

	@Override
	public void stickyHands() {
		// TODO Auto-generated method stub
		
	}

}
