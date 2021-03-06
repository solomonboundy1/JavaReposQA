package com.qa.main;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class LogDemo {
	
	// Logging is the process of outputting data from the computer to the console
	// System.out.println("some data") <-- logging
	// log4j is a third party 'better' log tool
	
	// First thing to do is create a Logger object
	
	public static Logger newLogger = LogManager.getLogger();
	
	public static void logTest(String name) {
		
		newLogger.info("Hey " + name);
	}

}
