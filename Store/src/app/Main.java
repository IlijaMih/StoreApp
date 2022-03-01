package app;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import controller.ApplianceDiscount;
import controller.ClothesDiscount;
import controller.FoodAndBeverageDiscount;
import model.Appliance;
import model.Beverage;
import model.Cart;
import model.Cashier;
import model.Clothes;
import model.Food;
import model.Product;
import model.Purchase;

public class Main {

	public static void main(String[] args) {

		
////////1. PRIMER
		Product t = new Clothes("T-shirt", "TRN", 10.00, new ClothesDiscount());

		Appliance computer = new Appliance("computer", "Asus", 1000.00, new ApplianceDiscount());
		computer.setProductionDate(LocalDate.of(2022, 2, 2));
		
		Appliance laptop = new Appliance("laptop", "Dell", 600.00, new ApplianceDiscount());
		laptop.setProductionDate(LocalDate.of(2022, 2, 2));
		
		Food food = new Food("Apple", "Golden Delicious", 7.0, new FoodAndBeverageDiscount());
		food.setExpirationDate(LocalDate.of(2022, 3, 2));
		
		Beverage milk = new Beverage("milk", "Imlek", 10.0, new FoodAndBeverageDiscount());
		milk.setExpirationDate(LocalDate.of(2022, 2, 27));

		Cart cart = new Cart();
		cart.getProducts().add(t);
		cart.getAmounts().add(3.0);
		cart.getProducts().add(computer);
		cart.getAmounts().add(1.0);
		cart.getProducts().add(laptop);
		cart.getAmounts().add(1.0);
		cart.getProducts().add(food);
		cart.getAmounts().add(2.0);
		cart.getProducts().add(milk);
		cart.getAmounts().add(1.0);
		
		Purchase purchase = new Purchase(LocalDate.of(2022, 2, 27), cart);
		purchase.setTime(LocalDateTime.of(2022, 2, 27, 17, 33, 46));
		
		Cashier cashier = new Cashier();
		cashier.setPurchase(purchase);
		cashier.printAReceipt(cart, purchase.getDate());
		
		//////// 2. PRIMER
	/*	Product t = new Clothes("T-shirt", "TRN", 10.00, new ClothesDiscount());

		Appliance computer = new Appliance("computer", "Asus", 1000.00, new ApplianceDiscount());
		computer.setProductionDate(LocalDate.of(2022, 2, 2));
		
		Appliance laptop = new Appliance("laptop", "Dell", 600.00, new ApplianceDiscount());
		laptop.setProductionDate(LocalDate.of(2022, 2, 2));
		
		Food food = new Food("Apple", "Golden Delicious", 7.0, new FoodAndBeverageDiscount());
		food.setExpirationDate(LocalDate.of(2022, 3, 2));
		
		Beverage milk = new Beverage("Mleko", "Imlek", 10.0, new FoodAndBeverageDiscount());
		milk.setExpirationDate(LocalDate.of(2022, 2, 28));

		Cart cart = new Cart();
		cart.getProducts().add(t);
		cart.getAmounts().add(3.0);
		cart.getProducts().add(computer);
		cart.getAmounts().add(1.0);
		cart.getProducts().add(laptop);
		cart.getAmounts().add(1.0);
		cart.getProducts().add(food);
		cart.getAmounts().add(2.0);
		cart.getProducts().add(milk);
		cart.getAmounts().add(1.0);
		
		Purchase purchase = new Purchase(LocalDate.of(2022, 2, 25), cart);
		purchase.setTime(LocalDateTime.of(2022, 2, 25, 10, 03, 27));
		
		Cashier cashier = new Cashier();
		cashier.setPurchase(purchase);
		cashier.printAReceipt(cart, purchase.getDate());
		*/
		
	}
	

}
