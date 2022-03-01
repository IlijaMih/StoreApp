package controller;

import java.time.LocalDate;
import java.util.Date;

import model.Product;

public interface DiscountCalculator {

	abstract public int calculateDiscount(Product product, LocalDate date, LocalDate dateOfPurchase);
}
