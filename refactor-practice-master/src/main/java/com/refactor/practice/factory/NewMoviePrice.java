package com.refactor.practice.factory;

import com.refactor.practice.model.enums.MoviePriceCode;

public class NewMoviePrice implements MoviePrice{
    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
