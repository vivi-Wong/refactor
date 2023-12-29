package com.refactor.practice.model.entity;

import java.util.List;

public class Customer {
		private String name;
		private List<Rental> rentalses;

		public Customer(String name,List<Rental> rentalses) {
			this.name = name;
			this.rentalses = rentalses;
		}


		public String getName() {
			return name;
		}

		public String statement(){
			String result = "Rental Record for " + getName() + "\n";
			for (Rental rentals : rentalses) {
				result += "\t" + rentals.getMovie().getTitle() + "\t" + String.valueOf(rentals.getCharge()) + "\n";
			}
			result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
			result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent enter points";
			return result;
		}

		public double getTotalCharge(){
			double result = 0;
			for (Rental rentals : rentalses) {
				result += rentals.getCharge();
			}
			return result;
		}

		public int getTotalFrequentRenterPoints(){
			int result = 0;
			for (Rental rentals : rentalses) {
				result += rentals.getFrequentRenterPoints();
			}
			return result;
		}
	}
