package com.qa.model;

public class Movie {
	
	// Creating Fields
	private long movie_id;
	private String title;
	private int runTime;
	private String rating;
	private String genre;
	
	// Constructor
	public Movie(long movie_id, String title, int runTime, String rating, String genre) {
		super();
		this.movie_id = movie_id;
		this.title = title;
		this.runTime = runTime;
		this.rating = rating;
		this.genre = genre;
	}
	
	// Overloaded
	// When pushing to a database, we don't know what the id will be
	public Movie(String title, int runTime, String rating, String genre) {
		super();
		this.title = title;
		this.runTime = runTime;
		this.rating = rating;
		this.genre = genre;
	}
	
	// Getters and Setters
	public long getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(long movie_id) {
		this.movie_id = movie_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	// To String method	
	@Override
	public String toString() {
		return "Movie [movie_id=" + movie_id + ", title=" + title + ", runTime=" + runTime + ", rating=" + rating
				+ ", genre=" + genre + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}		


	
	
}
