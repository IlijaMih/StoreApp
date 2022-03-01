package controller;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

import model.Product;

public class ClothesDiscount implements DiscountCalculator{

	@Override
	public int calculateDiscount(Product product, LocalDate date, LocalDate dateOfPurchase) {
		DayOfWeek day = dateOfPurchase.getDayOfWeek();
		if(day == DayOfWeek.TUESDAY || day == DayOfWeek.WEDNESDAY || day == DayOfWeek.THURSDAY || day == DayOfWeek.FRIDAY || day == DayOfWeek.SATURDAY) {
			return 10;
		}
		return 0;
	}

}
