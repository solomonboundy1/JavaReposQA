package com.qa.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicTest {
	
	
	// When creating tests we don't have any type of runner
	// Test classes should be created to test our classes in src/main/java
	// If we have a class called PizzaManager.java we should have a test class PizzaManagerTest.java
	
	@Test
	// Just a method with void
	public void addTwoTest() {
		// testing whether 2 + 4 = 6
		
		// Within testing there are 'frameworks' to follow
		
		// Arrange - Creating variables, methods you need to test
		int num1 = 2;
		int num2 = 4;
		int result;
		// Act - Running the code you are testing
		result = num1 + num2;
		// Assert - Checking the return against what it should be
		Assertions.assertEquals(6, result);
		// (We are expecting 6 to be equal to result(num1 + num2))
	}

}
