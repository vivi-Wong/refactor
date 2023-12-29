package com.refactor.practice.model.entity;

public class Rental {
	private Movie movie;
	private int daysRented;

	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public double getCharge(){
		return movie.getCharge(daysRented, movie.getPriceCode());
	}

	public int getFrequentRenterPoints(){
		return movie.getFrequentRenterPoints(daysRented, movie.getPriceCode());
	};
}
