package com.qa.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.qa.jdbc.JDBC_setup;
import com.qa.model.Movie;

public class MovieDAO {
	
	JDBC_setup jdbc = new JDBC_setup();
	
	// class level variables to use
	//Statement object (JDBC stuff) called statement
	Statement statement;
	Connection connection;
	
	public void addMovie() {
		try {
			connection = jdbc.connect();
			statement = connection.createStatement();
			String query = "INSERT INTO movies (title, runTime, rating, genre) VALUES (\"Resident Evil 4\", 105, \"R\", \"Action Horror\")";
			statement.executeUpdate(query);
			System.out.println("add movie");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
