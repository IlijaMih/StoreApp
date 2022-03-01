package model;

import java.time.LocalDate;
import java.util.Date;

import controller.DiscountCalculator;

public abstract class Product {

	private String name;
	private String brand;
	private Double price;
	protected DiscountCalculator discountCalculator;
	
	public Product(String name, String brand, Double price, DiscountCalculator discountCalculator) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.discountCalculator = discountCalculator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	abstract public int getDiscount(LocalDate date);

	@Override
	public String toString() {
		return name + " " + brand;
	}
	
	
}
