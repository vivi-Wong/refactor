package com.refactor.practice.controller;

import com.refactor.practice.model.entity.Movie;
import com.refactor.practice.model.entity.Rental;
import com.refactor.practice.controller.dto.ChargeRequest;
import com.refactor.practice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/calculate")
    public String calculateCharge(@RequestBody @Validated List<ChargeRequest> requests) {
        List<Rental> rentals = requests.stream()
                .map(request -> new Rental(new Movie(request.getMovieName(), request.getPriceCode()), request.getDaysRented()))
                .collect(Collectors.toList());
        return customerService.calculateCharge(rentals);
    }
}
