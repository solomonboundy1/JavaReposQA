package com.qa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	
	public Movie movieFromResultSet(ResultSet resultSet) throws SQLException{
		Long movie_id = resultSet.getLong("id");
		String title = resultSet.getString("title");
		int runTime = resultSet.getInt("runTime");
		String rating = resultSet.getString("rating");
		String genre = resultSet.getString("genre");
		
		
		return new Movie(movie_id, title, runTime, rating, genre);
		
	}
	
	// CREATE
	public void addMovie(Movie movie) {
		try {
			connection = jdbc.connect();
			statement = connection.createStatement();
			String query = "INSERT INTO movies (title, runTime, rating, genre) VALUES ('" + movie.getTitle() + "', " + movie.getRunTime() + ", '" + movie.getRating() + "', '" + movie.getGenre() + "')";
			statement.executeUpdate(query);
			System.out.println("add movie");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// CREATE USING PREPARED STATEMENTS
	
	public void createPreparedStatement(Movie movie) {
		try {
			connection = jdbc.connect();
			PreparedStatement statement = connection.prepareStatement("INSERT INTO movies (title, runTime, rating, genre) VALUES (?,?,?,?)"); {
			statement.setString(1, movie.getTitle());
			statement.setInt(2, movie.getRunTime());
			statement.setString(3, movie.getRating());
			statement.setString(4, movie.getGenre());
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	// READ
	public Movie readMovie(Long id) {
		try {
			connection = jdbc.connect();
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM movies WHERE id = " + id);{
				resultSet.next();
				return movieFromResultSet(resultSet);
			}
		} catch(SQLException e) {
			System.out.println("Hello");
			
		}
		return null;
	}
	
	
	public Movie readPreparedStatement(Long id) {
		try {
			connection = jdbc.connect();
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM movies WHERE movie_id = ?"); {
			statement.setLong(1, id);
			ResultSet resultSet = statement.executeQuery();
			resultSet.next();
			return movieFromResultSet(resultSet);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	// UPDATE
	
	public Movie update(Movie movie) {
		try {
			connection = jdbc.connect();
			statement = connection.createStatement();
			statement.executeUpdate("UPDATE movie SET title = '" + movie.getTitle() 
			+ "' , runTime = '" + movie.getRunTime() + ", rating = '" + movie.getRating() + "', genre = '" + movie.getGenre() + "' WHERE id = " + movie.getMovie_id());
			return readMovie(movie.getMovie_id());
			
		} catch (SQLException e) {
			System.out.println("Hi");
		}
		return null;
	
	}
	
	public Movie updatePreparedStatement(Movie movie) {
		try {
			connection = jdbc.connect();
			PreparedStatement statement = connection.prepareStatement("UPDATE movies SET title = ?, runTime = ?, rating = ?, genre = ? WHERE movie_id = ?"); {
			statement.setString(1, movie.getTitle());
			statement.setInt(2, movie.getRunTime());
			statement.setString(3, movie.getRating());
			statement.setString(4, movie.getGenre());
			statement.setLong(5, movie.getMovie_id());
			statement.executeUpdate();
			return readPreparedStatement(movie.getMovie_id());
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// DELETE
	
	public Movie delete(Long id) {
		try {
			connection = jdbc.connect();
			statement = connection.createStatement();
			statement.executeUpdate("DELETE FROM movies WHERE movie_id = " + id);
		} catch(SQLException e) {
			System.out.println("Bye");
		}
		return null;
	}
	
	public int deletePreparedStatement(Long id) {
		try {
			connection = jdbc.connect();
			PreparedStatement statement =connection.prepareStatement("DELETE FROM movies WHERE movie_id = ?");
			statement.setLong(1, id);
			return statement.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
}


