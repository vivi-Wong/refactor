package com.refactor.practice.factory;

public class RegularMoviePrice implements MoviePrice{
    @Override
    public double getCharge(int daysRented) {
        double amount = 2;
        if (daysRented > 2) {
            amount += (daysRented -2) * 1.5;
        }
        return amount;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
