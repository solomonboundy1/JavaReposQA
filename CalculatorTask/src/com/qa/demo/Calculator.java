package com.qa.demo;

public class Calculator {
	
	public static void addNum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
	
	public static void minusNum(int num1, int num2) {
		int result = num1 - num2;
		System.out.println(result);
	}
	
	public static void timesNum(int num1, int num2) {
		int result = num1 * num2;
		System.out.println(result);
	}
	
	public static void divideNum(int num1, int num2) {
		int result = num1 / num2;
		System.out.println(result);
	}
	public static void raisePower(int num1, int num2) {
		int result = (int) Math.pow(num1, num2);
		System.out.println(result);
	}
	
	public static void modNum(int num1, int num2) {
		int result = num1 % num2;
		System.out.println(result);
	}

}
