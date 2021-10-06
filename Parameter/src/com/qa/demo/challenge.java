package com.qa.demo;

public class challenge {
	
	public static void luckyNum(int firstnum) {
		System.out.println("My lucky num is: " + firstnum);
	}
	public static void favSport(String sport) {
		System.out.println("My favourite sport is: " + sport);
	}
	public static void myFloat(float flt) {
		System.out.println("My float num is: " + flt);
	}
	public static void currentAge(boolean overTwenty, float realAge) {
		System.out.println("Are you over 20 years old? " + overTwenty + ", My age is: " + realAge);
	}
	public static void currentTemp(float temp, String warmCold) {
		System.out.println("The current temperature is: " + temp + ", it is " + warmCold);	
	}
	public static void favTypes(char typeChar, boolean typeBool, int typeInt) {
		System.out.println("My favourite character is: " + typeChar + ", my fav bool is: " + typeBool + ", my fav number is: " + typeInt);
	}
	public static void addNum(int firstInt, int secondInt) {
		System.out.println( firstInt + " + " + secondInt + " = " + (firstInt + secondInt));
	}

}
