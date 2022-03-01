package model;

import java.time.LocalDate;
import java.util.Date;

import controller.DiscountCalculator;

public class Appliance extends Product{

	private String model;
	private LocalDate productionDate;
	private float weight;
	
	public Appliance(String name, String brand, Double price, DiscountCalculator discountCalculator) {
		super(name, brand, price, discountCalculator);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public LocalDate getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(LocalDate productionDate) {
		this.productionDate = productionDate;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public int getDiscount(LocalDate dateOfPurchase) {
			return discountCalculator.calculateDiscount(this, null, dateOfPurchase);
	}
}
