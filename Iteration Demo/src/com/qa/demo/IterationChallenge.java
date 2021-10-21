package com.qa.demo;

public class IterationChallenge {
	
	public static void task1() {
		
		for(int A = 100; A <= 200; A++) {
			
			System.out.println("A");
		}
	
				
	}
	public static void task2() {
		
		for(int A = 100; A<= 200; A++) {
			if(A%2 ==0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}
	public static void task3() {
		for(int i = 0; i < 10; i++) {
			//System.out.println("1");
				for (int x = 0; x < 10; x++) {
					System.out.println("i: " + i + " x: " + x);
				}
					}
//		for(int two = 0; two < 10; two++) {
//			System.out.println("2");
//		}
//		for(int three = 0; three < 10; three++) {
//			System.out.println("3");
//		}
//		for(int four = 0; four < 10; four++) {
//			System.out.println("4");
//		}
//		for(int five = 0; five < 10; five++) {
//			System.out.println("5");
//		}
//		for(int six = 0; six < 10; six++) {
//			System.out.println("6");
//		}
//		for(int seven = 0; seven < 10; seven++) {
//			System.out.println("7");
//		}
//		for(int eight = 0; eight < 10; eight++) {
//			System.out.println("8");
//		}
//		for(int nine = 0; nine < 10; nine++) {
//			System.out.println("9");
//		}
//		for(int ten = 0; ten < 10; ten++) {
//			System.out.println("10");
//		}
//
	}
	public static void task4() {
		for(int one = 0; one < 1; one++) {
			System.out.println("1");
		}
		for(int two = 0; two < 2; two++) {
			System.out.println("2");
		}
		for(int three = 0; three < 3; three++) {
			System.out.println("3");
		}
		for(int four = 0; four < 4; four++) {
			System.out.println("4");
		}
		for(int five = 0; five < 5; five++) {
			System.out.println("5");
		}
		for(int six = 0; six < 6; six++) {
			System.out.println("6");
		}
		for(int seven = 0; seven < 7; seven++) {
			System.out.println("7");
		}
		for(int eight = 0; eight < 8; eight++) {
			System.out.println("8");
		}
		for(int nine = 0; nine < 9; nine++) {
			System.out.println("9");
		}
		for(int ten = 0; ten < 10; ten++) {
			System.out.println("10");
		}

	}
	public static int task5(int i) {
		
		int a = i / 10;
		int b = i%10;
		
		int result = a + b;
		return result;
				
		 
	}
	public static void task6(float cost, float amountPaid) {
		
		float change = amountPaid - cost;
		
		// Initialise all variables
		
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int two = 0;
		int one = 0;
		int fiftyPence = 0;
		int twentyPence = 0;
		int tenPence = 0;
		int fivePence = 0;
		int twoPence = 0;
		int onePence = 0;
		
		// while there is more change than 20, add another 20
		while(change > 20f) {
			twenty++;
			change -= 20;
		}
		
		while(change > 10f) {
			ten++;
			change -=10;
		}
		
		while(change > 5) {
			five++;
			change -= 5;
		}
		
	}
	


	
}
