package com.qa.demo;

public class OperatorMethods {

	// Operators are ways of manipulating numerical data +
	
	// = Assign value
	// num = 5
	
	// + plus
	// - minus
	// / divide
	// * multiply
	// % modulus
	
	// 10 / 3 = 3
	// remainder 1
	
	// 10 % 3 = 1
	
	// 7 % 2 = 1
	// 8 % 2 = 0
	
	// ++ - increments by 1
	// -- - decrements by 1
	// +=4 - increments by 4
	
	// Adds two nums together
	public static void addNumbers() {
		int num1 = 5;
		int num2 = 8;
		int result = num1 + num2;
		System.out.println(result);
	}
	public static void minusNumbers() {
		
		int num1 = 10;
		int num2 = 7;
		int result = num1 - num2;
		System.out.println(result);
	}
	
	//Method that takes in two nums and adds them
	
	public static int addTwoNums(int num1, int num2) {
		
		int result = num1 + num2;
		return result;
	}
}
