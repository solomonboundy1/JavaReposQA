package com.qa.demo;

import java.util.Random;

public class DiceRoller {
	
	// Task - Create a method stack (includes multiple methods) for thr following:
	// - Rolling 4 seperate 6 sided dice and getting the total
	// - 3 seperate six sided dice, returning the total. Rolling 2 eight sided dice, returning that total
	// Adding both totals together
	// roll a 2 sided, 3 sided, 4 sided, 5 sided, 6 sided and 8 sided and adding the total
	
	public int d1() {
		int num = 6;
		
		
		
	return new Random().nextInt(num);
	
	
	}
	
	public int d2() {
		int num = 6;
		
	return new Random().nextInt(num);
	
	}
	
	public int d3() {
		int num = 6;
		
	return new Random().nextInt(num);
	
	}
	
	public int d4() {
		int num = 6;
		
	return new Random().nextInt(num);
	
	}
	
	public int d5(int num) {
		
	return new Random().nextInt(num);
	
	}
	
	public int d6(int num) {
		
	return new Random().nextInt(num);
	
	}

	
	public int d7() {
		int num = 8;
		
	return new Random().nextInt(num);
	}
	
	public int d8() {
		int num = 8;
		
	return new Random().nextInt(num);
	}
	
	public int s2() {
		int num = 2;
		
	return new Random().nextInt(num);
	}
	
	public int s3() {
		int num = 3;
		
	return new Random().nextInt(num);
	}
	
	public int s4() {
		int num = 4;
		
	return new Random().nextInt(num);
	}
	
	public int s5() {
		int num = 5;
		
	return new Random().nextInt(num);
	}
	
	public int s6() {
		int num = 6;
		
	return new Random().nextInt(num);
	}
	
	public int s8() {
		int num = 8;
		
	return new Random().nextInt(num);
	}
	
	public int totalFourSix() {
		int total = d1() + d2() + d3() + d4();
		
		return total;
	}
	
	public int totalThreeSix() {
		
		int num = d1();
		int num2 = d2();
		int num3 = d3();
		
		int total = num + num2 + num3;
		
		return total;
		
	}
	
	public int totalTwoEight() {
		
		int num = d7();
		int num2 = d8();
		
		int total = num + num2;
		
		return total;
				
	}
	
	public int totalTotal() {
		
		int total =  totalTwoEight() + totalThreeSix();
		
		return total;
	}
	
	public int lastTotal() {
		
		int total = s2() + s3() + s4() + s5() + s6() + s8();
		
		return total;
	}

}
