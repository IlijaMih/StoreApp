package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;

public class Purchase {

	private LocalDate date;
	private LocalDateTime time;
	private Cart cart;
	
	public Purchase(LocalDate date, Cart cart) {
		super();
		this.date = date;
		this.cart = cart;
	}
	
	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}


	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	public Double calculateSubtotalPrice() {
		Double subtotalPrice = 0.0;
		for(int i=0;i<this.getCart().getProducts().size();i++) {
			Product p = this.getCart().getProducts().get(i);
			Double amount = this.getCart().getAmounts().get(i);
			subtotalPrice+=p.getPrice() * amount;
		}
		return subtotalPrice;
	}
	
	public Double calculateDiscount() {
		Double discount = 0.0;
		for(int i=0;i<this.getCart().getProducts().size();i++) {
			Product p = this.getCart().getProducts().get(i);
			Double amount = this.getCart().getAmounts().get(i);
			discount += (p.getPrice() * p.getDiscount(this.getDate()) / 100) * amount;
		}
		return discount;
		}
	
	public Double calculateTotalPrice() {
		Double totalPrice = 0.0;
		for(int i=0;i<this.getCart().getProducts().size();i++) {
			Product p = this.getCart().getProducts().get(i);
			Double amount = this.getCart().getAmounts().get(i);
			totalPrice += (p.getPrice() - p.getPrice() * p.getDiscount(this.getDate()) / 100) * amount;
		}
		return totalPrice;
		}
	
	
}
