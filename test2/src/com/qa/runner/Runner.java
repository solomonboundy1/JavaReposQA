package com.qa.runner;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Hello");

		int[] classPoints = { 10, 45, -20 };
		betterThanAverage(classPoints, 50);
	}

	public static boolean betterThanAverage(int[] classPoints, int yourPoints) {

		int total = 0;
		for (int i = 0; i < classPoints.length; i++) {
			System.out.println(classPoints[i]);
			total = total + classPoints[i];

		} // end for loop
		System.out.println(total);
		System.out.println("Length is: " + classPoints.length);

		int avg = total / classPoints.length;
		System.out.println(avg);
		if (avg < yourPoints) {
			return true;
		} else {
			return false;
		}
	} // end betterThanAverage function

}
