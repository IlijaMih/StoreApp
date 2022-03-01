package controller;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.Product;

import java.time.temporal.ChronoUnit;

public class FoodAndBeverageDiscount implements DiscountCalculator{

	@Override
	public int calculateDiscount(Product product, LocalDate date, LocalDate dateOfPurchase) {
		long daysBetween = ChronoUnit.DAYS.between(dateOfPurchase, date);
		if(daysBetween <= 5 && daysBetween >=1) {
			return 30;
		}
		if(daysBetween == 0) {
			return 70;
		}
		return 0;
	}


}
