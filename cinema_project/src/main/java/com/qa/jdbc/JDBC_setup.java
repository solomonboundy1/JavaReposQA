package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// This class will contain our database connection stuff
// And methods to do the basic JDBC connection
public class JDBC_setup {
	
	// We need to add our driver, db_url, user, pass
	
	// final - Will never change from this value
	final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	final String DB_URL = "jdbc:mysql://localhost:3306?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			
	
	final String USER = "root";
	final String PASS = "root";
			
	// Connection is a datatype
	
	Connection conn = null;
	
	
	// create a method to allow us to connect to  the database
	// This method will return a Connection object, and is called connect
	public Connection connect() {
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//  Try catches are used to tell Java what to do if an 'exeption' occurs
	// An exception is something that goes wrong. but doesn't break the code
	
	
	public void closeConn() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
