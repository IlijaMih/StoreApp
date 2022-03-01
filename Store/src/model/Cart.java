package model;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<Product> products;
	private List<Double> amounts;

	public Cart() {
		super();
		this.products = new ArrayList<Product>();
		this.amounts = new ArrayList<Double>();
	}

	public List<Product> getProducts() {
		return products;
	}

	public List<Double> getAmounts() {
		return amounts;
	}
	
	
	
	
}
