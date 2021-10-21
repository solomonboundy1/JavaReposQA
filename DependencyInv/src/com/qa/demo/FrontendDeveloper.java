package com.qa.demo;

import com.qa.interfaces.Developer;

public class FrontendDeveloper implements Developer {

	@Override
	public void develop() {
		
		writeJavaScript();
		
	}
	
	public void writeJavaScript() {
		
		System.out.println("JavaScript is used everywhere anyway.");
	}
}
