package com.qa.demo;

public class ReturnTypes {
	
	//Primitives - Simpler, single value things 5, a, true, 0
	// Complex - References to multiple primitive data types, such as 'Hello everyone'
	
	// Returns - Methods within java should return SOMETHING
	
	// All this method does is return 36
	// returnInt() = 36
	public static int returnInt() {
		return 36;
	}
	// How to create a method that returns a String
	public static String returnString() {
		return "Hey, this is being returned";
	}
	public static boolean returnBool() {
		return true;
	}
	public static char returnChar() {
		return 'a';
	}
	public static float returnFloat() {
		return 0.212345f;
	}
	public static Object returnNothing() {
		return null;
	}
}
