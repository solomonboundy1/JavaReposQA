package com.qa.runner;

import com.qa.demo.lionClass;
import com.qa.demo.tigerClass;

public class Runner {
	
	public static void main(String[] args) {
		
	lionClass king = new lionClass("king", "male", true, 70);
	tigerClass tiger1 = new tigerClass("tiger1", "female", false, 90);
	
	System.out.println(king.hasStripes());
	
	System.out.println(tiger1.hasStripes());
	System.out.println(tiger1);
		
	}

}
