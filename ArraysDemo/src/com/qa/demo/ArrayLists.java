package com.qa.demo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
	
	// ArrayLists are RESIZABLE
	// You can create an array list of 4 items, if you need to add more you can
	// Use inbuilt functions to add, remove, update etc.
	
	// They require importing, they add extra data / memory to your project
	
	// Create an arrayList as a global variable
	
	//String [] pizzaListOld = {"pizza", "cheese"};
	
	//ArrayList<DataType>   nameOfArrayList = new ArrayList<>();
	
	public static ArrayList<String> pizzaList = new ArrayList<>();
	public static ArrayList<String> coloursList = new ArrayList<>();
	public static void arrayListDemo() {
		
		
		
		
		//How we add items to our arrayList
		//ArrayLists use semantic key words
		
		// ArrayListName.function("whatever you want to use)
		
		// to add an element .add()
		pizzaList.add("Meat feast");
		pizzaList.add("Pepperoni");
		pizzaList.add("Hawaiian");
		pizzaList.add("Veggie Volcano");
		
		//to remove an element .remove()
		pizzaList.remove(1);
		
		// to 'get' an element from a list .get(index)
		//WONT WORK BECAUSE NOT AN ARRAY
		
		
		// .set = updates / replaces element at a specific index, takes in two args
		// (index, value)
		pizzaList.set(0,"Pepperoni");
		
		
		// length = .size()
		// returns length/size of an array list
		
		// clear removes everything from the arrayList
		
		// Sorting 
		//Colections.sort sorts alphabetically BUT uppercase first
		Collections.sort(pizzaList);
		System.out.println();
		
		System.out.println(pizzaList);
		
		// Extended Task
		// With the following list of coffee orders, create separate methods
		// that take in parameters and do the following:
		// - Add a new order to the orders array
		// -Return the order
		// - Modify the order (passing in a string)
		// - remove the order from the orders array
		// - add the order to the done orders array
		// - prints out the length of the orders and doneOrders array
		// clears either or both of the arrays
		
		
	}
	

}
