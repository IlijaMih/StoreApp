package controller;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

import model.Product;

public class ApplianceDiscount implements DiscountCalculator{

	@Override
	public int calculateDiscount(Product product, LocalDate date, LocalDate dateOfPurchase) {
		DayOfWeek day = dateOfPurchase.getDayOfWeek();
		if(product.getPrice() > 999 && (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY)) {
		return 7;
		}
		return 0;	
	}

	
}
