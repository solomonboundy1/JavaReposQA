package com.qa.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.qa.scans.NameScan;

public class Runner {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Bob", "Trevor", "Steve", "Gary");
	    names.stream()
	            .forEach(x -> System.out.println("Hello " + x));

	    }
	
//	Scanner nameScan = new Scanner(System.in);
//	System.out.println("Enter name: ");
//	
//	String name = nameScan.nextLine();
//	
//	NameScan names = new NameScan();
//	
//	names.greeting(name);

//	}
}