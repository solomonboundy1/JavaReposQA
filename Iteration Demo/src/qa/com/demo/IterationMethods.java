package qa.com.demo;

import java.util.Random;

public class IterationMethods {

	// While - Does the code while a boolean / other statement is true
	// Do-While - Does the code at least once THEN checks the condition
	// For - Does the code FOR a set number of iterations
	
	public static void whileDemo() {
		
		int housePlants = 0;
		// while is our keyword, acts like an if statement
		while(housePlants < 10) {
			System.out.println("Current number of plants: " + housePlants);
			System.out.println("Grab another!");
			housePlants++;
		}
		
		System.out.println("Final number of plants: " + housePlants);
		
	}
	
	public static void doWhileDemo() {
		
		int hoursSlept = 0;
		//runs once at least
		do {
			System.out.println("Hours slept: " + hoursSlept);
			hoursSlept++;
		} while (hoursSlept > 7);
		
		//Will NOT run
		while(hoursSlept> 7 ) {
			System.out.println("Hours slept: " + hoursSlept);
			hoursSlept++;
		};
	}
	
	//Task - Create a method that takes in a starting amount of money (200?)
	// - The same amount of money is deducted every time (30)
	// - When the total money left goes under a different value (50?), the loop stops
	// - And prints out "stop spending money!!"
	
//		public static void bank() {
//			int funds = 200;
//			
//			
//			while(funds > 19) {
//				System.out.println("Balance: " + funds);
//				funds = funds - 30;
//				
//			}
//			System.out.println("stop spending money!!");
//		}
	
	public static int randomAmount() {
		
		int num = 40;
		
		return new Random().nextInt(num);
		
	}
	public static void randomBank() {
		int funds = 200;
		
		
		
		while(funds > 10) {
			System.out.println("Balance: " + funds);
			funds -= randomAmount();
			
			
		}
		System.out.println("stop spending money!!");
	}

}

