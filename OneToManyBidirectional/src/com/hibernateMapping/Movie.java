package com.hibernateMapping;

public class Movie {
	private int MovieId;
	private String MovieName;
	private int forevenId;
	private Director parentObjects;

	public int getMovieId() {
		return MovieId;
	}

	public void setMovieId(int movieId) {
		MovieId = movieId;
	}

	public String getMovieName() {
		return MovieName;
	}

	public void setMovieName(String movieName) {
		MovieName = movieName;
	}

	public int getForevenId() {
		return forevenId;
	}

	public void setForevenId(int forevenId) {
		this.forevenId = forevenId;
	}

	public Director getParentObjects() {
		return parentObjects;
	}

	public void setParentObjects(Director parentObjects) {
		this.parentObjects = parentObjects;
	}

}
