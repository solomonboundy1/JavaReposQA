package com.qa.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {
		try {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("please enter a first number");
		
		int scanNum1 = scan1.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("please enter a second number");
		
		int scanNum2 = scan2.nextInt();
		
		Calculator.addNum(scanNum1,scanNum2);
//		Calculator.raisePower(scanNum1,scanNum2);
//		Calculator.divideNum(scanNum1,scanNum2);
//		Calculator.minusNum(scanNum1,scanNum2);
		
		} catch (InputMismatchException e) {
			System.out.println("Please enter a valid number");
		}
	}
	

}
