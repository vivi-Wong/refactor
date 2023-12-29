package com.refactor.practice.service;

import com.refactor.practice.model.entity.Rental;

import java.util.List;

public interface CustomerService {
    String calculateCharge(List<Rental> rentals);
}
