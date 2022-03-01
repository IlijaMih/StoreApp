package model;

import java.time.LocalDate;
import java.util.Date;

import controller.DiscountCalculator;

public class Food extends Product{

	private LocalDate expirationDate;
	
	public Food(String name, String brand, Double price, DiscountCalculator discountCalculator) {
		super(name, brand, price, discountCalculator);
		
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Override
	public int getDiscount(LocalDate dateOfPurchase) {
		return discountCalculator.calculateDiscount(this, this.expirationDate, dateOfPurchase);
		
	}

	
}
