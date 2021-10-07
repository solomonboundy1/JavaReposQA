package com.qa.demo;

public class SwitchCase {
	//Switch cases allow you to move away from a boolean / true / false conditional
	// conditional checking if number > 21
	// switch cases allow you to program any number of possible outcomes
	
	public static void switchCaseDemo(String lyric) {
		//String lyric = "Doe";
		
		//switch is our keyword
		switch(lyric) {
		
		// Case is the value we're expecting
		// the value ends with a colon
		case "Doe":
			System.out.println("A deer, a female deer");
			break;
			
		case "ray":
			System.out.println("A drop of golden sun");
			break;
			
		case "me":
			System.out.println("A name I call myself");
			break;
		
		default:
			System.out.println("I don't know the rest :(");
			
		}
	}

	public static float taxWorkout(int salary) {
		
		if(salary < 15000) {
			return 0;
		} else if(salary >= 15000 && salary < 19999) {
			return 0.1f;
		} else if(salary >= 20000 && salary < 29999) {
			return 0.15f;
		} else if(salary >= 30000 && salary < 44999) {
			return 0.2f;
		} else {
			//salary greater than45000
			return 0.25f;
		}
		
		
	}
	public static int exactAmount(int salary) {
		if(salary < 15000) {
			System.out.println(salary);
			return salary;
		} else if(salary >= 15000 && salary < 19999) {
			System.out.println((int) (salary * 0.1));
			return (int) (salary * 0.1);
		} else if(salary >= 20000 && salary < 29999) {
			System.out.println((int) (salary * 0.15));
			return (int) (salary * 0.15);
		} else if(salary >= 30000 && salary < 44999) {
			System.out.println((int) (salary * 0.20));
			return (int) (salary * 0.20);
		} else {
			//salary greater than45000
			System.out.println((int) (salary * 0.25));
			return (int) (salary * 0.25);
		}
		
		
		
	}
	public static int salaryResults(int salary) {
		//calculate tax based on salary (0, 0.1, 0.15..)
		float tax = taxWorkout(salary);
		
		
		if(salary < 15000) {
			System.out.println(salary);
			return salary;
		} else {
			System.out.println((int) (salary * tax));
			return (int) (salary * tax);
		}
	}
	
	//public static int exactAmount(int salary) {
//		if(salary < 15000) {
//			return salary;
//		} else if(salary >= 15000 && salary < 19999) {
//			return (int) (salary - (salary * 0.1));
//		} else if(salary >= 20000 && salary < 29999) {
//			return (int) (salary - (salary * 0.15));
//		} else if(salary >= 30000 && salary < 44999) {
//			return (int) (salary - (salary * 0.20));
//		} else {
//			//salary greater than45000
//			return (int) (salary - (salary * 0.25));
//		}
	
	
	
	// change num to string using switch cases
	
	public static String numString(int x) {
		
		switch(x) {
		
		case 1:
			return "one";
			
		case 2:
			return "two";
		case 3:
			return "three";
			
		default:
			return "not a number";
		}
	}
}

