package com.qa.demo;

public class tasks {
	
	public static int task1(int num1, int num2, boolean bool) {
		//if you are checking something is true, you can just
		// chuck in the boolean variable e.g if(bool) == if(bool == true)
		if(bool) {
			return num1 + num2;
		} else {
			return num1 * num2;
		}
	}
	
	
	
	public static void task2(int A) {
		if(A > 2000) {
			System.out.println("A");
			// right hand side
			
			if(A > 6000) {
				System.out.println("C");
				//End.
			} else {
				System.out.println("B");
				if(A > 4000) {
					System.out.println("D");
					//End.
				} else {
					System.out.println("E");
					//End.
				}
			}
			
			
		} else {
			System.out.println("1");
			// left hand side
			
			
			if(A > 100) {
				System.out.println("3");
				
				if(A > 600) {
					System.out.println("5");
				} else {
					System.out.println("4");	
					if(A > 500) {
						System.out.println("6");
						// End.
					} else {
						System.out.println("7");
						// End.
					}
				}
					
				
			} else {
				System.out.println("2");
				// End.
			} 
		
		}
		
		
	}
	

}
