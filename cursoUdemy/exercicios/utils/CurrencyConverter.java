package utils;

/**
 * @author Daniel
 *
 * 29 de mar de 2020
 */
public class CurrencyConverter {
	
	public static double buyDollars(double price, double quantity) {
		return price * quantity * 1.06;
	}
}
