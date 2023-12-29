package com.refactor.practice.factory;



public interface MoviePrice {
    double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented);
}
