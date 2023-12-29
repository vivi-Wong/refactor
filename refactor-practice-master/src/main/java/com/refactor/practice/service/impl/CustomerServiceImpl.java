package com.refactor.practice.service.impl;

import com.refactor.practice.model.entity.Customer;
import com.refactor.practice.model.entity.Rental;
import com.refactor.practice.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public String calculateCharge(List<Rental> rentals) {
        Customer customer = new Customer("user", rentals);
        return customer.statement();
    }
}
