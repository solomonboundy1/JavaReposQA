package com.qa.runner;

import com.qa.demo.ControlFlow;
import com.qa.demo.DiceRoller;
import com.qa.demo.Stack;

public class Runner {
	
	public static void main(String[] args) {
		
		DiceRoller rollDice = new DiceRoller();
		
		ControlFlow newInt = new ControlFlow();
		
		newInt.method2(27);
		
		//ControlFlow.method1();
		//System.out.println(Stack.firstLayer());
		System.out.println(rollDice.totalTotal());
	}

}
