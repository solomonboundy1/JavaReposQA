package com.qa.demo;

public class Runner {
	// Data Types - What forms of information can Java understand
	// Java is an EXPLICIT language - You need to specify the data it takes in
	
	// JavaScript is IMPLICIT
	// let apple = 5;
	// let number = "hello"
	
	// Java is EXPLICIT
	// String name = "reece"
	// int number = 5;
	
	// There are Two distince groups of data:
	
	// Primitive - smallest form of data Java can understand
	//  - They are actual pieces of data within Java memory e.g.
	// boolean (true false 1 0)
	// byte (very small number, -128 to 127)
	// char (a single character)
	// short (small number -30000 to 30000)
	// int (medium length number)
	// long (long number)
	// float (decimal number)
	// double (long decimal)
	
	// Strings "text" are arrays/objects of chars
	// Complex - collections of primitive data types
	// Complex data types start with capital letters e.g String
	// Primitive data types start with lower case letters e.g int
	
	
	// Java Return Types
	
	// Within java all methods SHOULD (not all) return something
	// When running the method, they should be equal to a value
	
	// printHello() = something
	
	// This method now returns hello
	// void means no data type 
	
	//public static void printHello() {
		//System.out.println("Hello");
		//return "Hello";
	
	//This method now returns a string
	
	//public static String printHello() {
		//System.out.println("Hello");
		//return "Hello";
	
	//Can also do like this below while writing in main
	//System.out.println(printHello());
	
	public static String printHello() {
	//		System.out.println("Hello");
			return "Hello";
	}
	
}
