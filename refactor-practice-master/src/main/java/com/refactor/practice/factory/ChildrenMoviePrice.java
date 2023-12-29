package com.refactor.practice.factory;


public class ChildrenMoviePrice implements MoviePrice{
    @Override
    public double getCharge(int daysRented) {
        double amount = 1.5;
        if (daysRented > 3) {
            amount += (daysRented -3) * 1.5;
        }
        return amount;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
