package createbean;

import org.springframework.stereotype.Component;

public class Laptop {
	String brand;
	double price;

	public Laptop(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
}
