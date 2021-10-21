package com.qa.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.qa.demo.Add;
import com.qa.demo.Basic;

import com.qa.demo.Blackjack;
import com.qa.demo.Calc;
import com.qa.demo.Divide;
import com.qa.demo.Minus;
import com.qa.demo.Multiply;
import com.qa.demo.Temperature;


public class NewTest {
	
	Basic basicObject = new Basic();
	Calc newCalc = new Calc();
	Blackjack newBlackjack = new Blackjack();
	Temperature newTemperature = new Temperature();
	
	
	
	@Test
	public void fiveFour() {
		
		int num1 = 5;
		int num2 = 4;
		int result;
		
		result = num1 * num2;
		
		Assertions.assertEquals(20, result);
		
		
	}
	
//	@Test
//	public String oddOrEven() {
//		
//		String test1;
//		int num1 = 1;
//		String result;
//		
//		if(num1 % 2 == 0) {
//			
//			result = "even";
//		} else {
//		result = "odd";
//		} 
//		return result;
//		
//		String result = test1;
//		Assertions.assertEquals("odd", result);
//	}
	
	@Test
	public void helloWorld() {
		// Arrange
		String testString;
		
		// Act
		testString = basicObject.helloWorld();
		System.out.println(testString);
		
		Assertions.assertEquals("Hello World", testString);
	}
	
	@Test
	public void subtractTwoNumsTest() {
		
		// Arrange
		int result;
		int x = 10;
		int y = 5;
		
		result = basicObject.subtractTwoNums(x, y);
		
		// Assert
		// return true IF result = x - y
		Assertions.assertTrue(result == x - y);
		
	}
	
	@Test
	public void addNumsTest() {
		
		// Arrange
		int result;
		int x = 10;
		int y = 5;
		
		result = newCalc.addNums(x, y);
		Assertions.assertTrue(result == x + y);
	
	}
	
	@Test
	public void minusNumsTest() {
		
		// Arrange
		int result;
		int x = 10;
		int y = 5;
		
		result = newCalc.minusNums(x, y);
		Assertions.assertTrue(result == x - y);
	
	}
	
	@Test
	public void multiplyNumsTest() {
		
		// Arrange
		int result;
		int x = 10;
		int y = 5;
		
		result = newCalc.multiplyNums(x, y);
		Assertions.assertTrue(result == x * y);
	
	}
	
	@Test
	public void divideNumsTest() {
		
		// Arrange
		int result;
		int x = 10;
		int y = 5;
		
		result = newCalc.divideNums(x, y);
		Assertions.assertTrue(result == x / y);
	
	}
	
	@Test
	public void blackjackTestPlayer() {
		
		int result;
		result = newBlackjack.play(22, 20);
		Assertions.assertEquals(result, 20);
	}
	
	@Test
	public void blackjackTestDealer() {
		
		int result;
		result = newBlackjack.play(20, 22);
		Assertions.assertEquals(result, 20);
	}
	
	@Test
	public void blackjackTestBothBust() {
		
		int result;
		result = newBlackjack.play(22, 22);
		Assertions.assertEquals(result, 0);
	}
	@Test
	public void blackjackTest() {
		
		int result;
		result = newBlackjack.play(20, 19);
		Assertions.assertEquals(result, 20, 19);
	}
	
	@Test
	public void fahrenheitToCelsius() {
		
		float result = newTemperature.convertFahrenheitToCelsius(32);
		
		Assertions.assertEquals(0, result);
	}
	

	@Test
	public void celsiusToFahrenHeit() {
		
		float result = newTemperature.convertCelsiusToFahrenheit(0);
		
		Assertions.assertTrue(result == (9 / 5) * (0) + 32);
	}
	
	@Test
	public void kelvinToCelcius() {
		
		float result = newTemperature.convertKelvinToCelsius(600);
		
		Assertions.assertTrue(result == 600 - 273);
		
	}
	
	@Test
	public void celciusToKelvin() {
		
		float result = newTemperature.convertCelsiusToKelvin(600);
		
		Assertions.assertTrue(result == 600 + 273);
		
	}
	
	// When writing unit tests, ALL tests should run separate to each other
		// Tests shouldn't run in a particular order, the tests should pass the same way when ran in any order
		// JUnit partially randomises the running order of tests
		
		// Important when considering how to setup for tests
		
		// Say we needed a method to run BEFORE ALL of the tests
		
		// BeforeALL method should be static
		
	@BeforeAll
	public static void runsFirst() {
		System.out.println("This annotation makes this method runs first, before anything else");
	}
	
	@AfterAll
	public static void teardown() {
		System.out.println("Used for tearing down, stopping any processes that are running because of tests");
	}
	
	@BeforeEach
	public void beforeEachTest() {
		
		System.out.println("Simplest use for this is separating each test");
		
	}
	
	@AfterEach
	public void afterEachTest() {
		System.out.println("after each test");
	}
}
