package com.qa.demo;

import java.util.ArrayList;



public class test1 {
	
public String getPizza(int index) {
	
	ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();
		
		Pizza pizzaResult = pizzaList.get(index);
		String pizzaString = pizzaResult.toString();
		System.out.println(pizzaString);
		return pizzaString;
	}

}
