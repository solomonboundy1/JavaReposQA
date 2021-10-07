package com.qa.operators;

import com.qa.demo.OperatorMethods;

public class Runner {
	public static void main(String[] args) {
		
		OperatorMethods.addNumbers();
		OperatorMethods.minusNumbers();
		System.out.println(OperatorMethods.addTwoNums(7, 68));
	}
	
	// Task - Create a calculator
	// New project with a runner class
	// Class that contains methods that can do the following
	// Add, Subtract, Multiply, Divide two numbers
	
	// Stretch Goal - add a raise to the power of method
	// raisePowerOf(4,3) 4 * 4 * 4

}
