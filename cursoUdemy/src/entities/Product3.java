package entities;

/**
 * @author Daniel
 *
 * 31 de mar de 2020
 */
public class Product3 {
	
	private String name;
	private double price;
	
	public Product3(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
