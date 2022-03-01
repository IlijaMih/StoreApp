package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Timer;

public class Cashier {

	private Purchase purchase;

	public Cashier() {
		super();
	}
	
	
	
	public Purchase getPurchase() {
		return purchase;
	}



	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}



	public void printAReceipt(Cart cart, LocalDate dateOfPurchase) {
		
		System.out.println("Date:" + purchase.getTime());
		System.out.println("---Products---");
		System.out.println();
		
		for(int i=0;i<purchase.getCart().getProducts().size();i++) {
			
			Product p = purchase.getCart().getProducts().get(i);
			Double amount = purchase.getCart().getAmounts().get(i);
			
			System.out.println(p);
			
			Double totalPrice = p.getPrice() * amount;
			System.out.println(amount + " x $" + p.getPrice() +" = $"+ totalPrice);
			
			int discount = p.getDiscount(dateOfPurchase);
			
			if(discount != 0) {
				System.out.println("#discount "+discount+"%-$"+ amount * p.getPrice() * discount/100);
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------------");
		System.out.println();
		
		System.out.println("SUBTOTAL:$" + purchase.calculateSubtotalPrice());
		System.out.println();
		
		System.out.println("DISCOUNT:-$" + purchase.calculateDiscount());
		System.out.println();
		System.out.println();
		
		System.out.println("TOTAL:$" + purchase.calculateTotalPrice());
	}
	
	
}
