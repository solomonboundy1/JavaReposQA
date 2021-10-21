package com.qa.demo;

import java.util.ArrayList;

public class ArrayListTask {
	
	public static ArrayList<String> orders = new ArrayList<>();
	public static ArrayList<String> doneOrders = new ArrayList<>();
	
	public static String takeOrder(String order) {
		
		orders.add(0,order);
		return orders.get(orders.size() - 1);
		
		
	
		
	}
	public static void completeOrder(String done) {
		
		doneOrders.add(orders.get(orders.size() - 1));
		orders.remove(orders.size() -1);
	}
	
	public static void ordersAmount() {
		System.out.println(orders.size());
	}
	
	public static void amountCompleted() {
		System.out.println(doneOrders.size());
	}
	
	public static void clearOrders() {
		orders.clear();
	}
	
	public static void clearCompleted() {
		doneOrders.clear();
	}

	public static void clearAll() {
		orders.clear();
		doneOrders.clear();
	}
}
