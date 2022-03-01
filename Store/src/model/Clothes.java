package model;

import java.time.LocalDate;
import java.util.Date;

import controller.DiscountCalculator;

public class Clothes extends Product{

	private Size size;
	private String color;
	
	public Clothes(String name, String brand, Double price, DiscountCalculator discountCalculator) {
		super(name, brand, price, discountCalculator);
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int getDiscount(LocalDate dateOfPurchase) {
			return discountCalculator.calculateDiscount(this, null, dateOfPurchase);
	}
}
