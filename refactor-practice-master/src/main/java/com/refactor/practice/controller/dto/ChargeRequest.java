package com.refactor.practice.controller.dto;

import com.refactor.practice.model.enums.MoviePriceCode;

public class ChargeRequest {
    private MoviePriceCode priceCode;
    private int daysRented;
    private String movieName;

    public MoviePriceCode getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(MoviePriceCode priceCode) {
        this.priceCode = priceCode;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public void setDaysRented(int daysRented) {
        this.daysRented = daysRented;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
