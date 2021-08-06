package io.javabrains.ratingsdataservice.model;

public class Rating {

	private String movieId;
	private double rating;

	public Rating() {
		super();
	}

	public Rating(String movieId, double rating) {
		this.movieId = movieId;
		this.rating = rating;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
