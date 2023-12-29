package com.refactor.practice.model.entity;

import com.refactor.practice.model.enums.MoviePriceCode;
import com.refactor.practice.factory.ChildrenMoviePrice;
import com.refactor.practice.factory.MoviePrice;
import com.refactor.practice.factory.NewMoviePrice;
import com.refactor.practice.factory.RegularMoviePrice;

public class Movie {
		private String title;
		private MoviePriceCode priceCode;

		public Movie(String title, MoviePriceCode priceCode) {
			this.title = title;
			this.priceCode = priceCode;
		}

		public String getTitle() {
			return title;
		}

		public MoviePriceCode getPriceCode() {
			return this.priceCode;
		}

		public MoviePrice getMoviePrice(MoviePriceCode priceCode) {
			switch (priceCode){
				case REGULAR:
					return new RegularMoviePrice();
				case CHILDRENS:
					return new ChildrenMoviePrice();
				case NEW_REALEASE:
					return new NewMoviePrice();
				default:
					throw new IllegalArgumentException("Incorrect Price Code");
			}
		}

		public double getCharge(int daysRented, MoviePriceCode priceCode){
			return getMoviePrice(priceCode).getCharge(daysRented);
		}

		public int getFrequentRenterPoints(int daysRented, MoviePriceCode priceCode) {
			return getMoviePrice(priceCode).getFrequentRenterPoints(daysRented);
		}


}
