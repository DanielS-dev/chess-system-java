package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

/**
 * @author Daniel
 *
 * 28 de mar de 2020
 */
public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		//System.out.print("Quantity in stock: ");
		//int quantity = sc.nextInt();
		
		Product product = new Product(name, price);
		
		System.out.println("Product data: " + product);
		
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.AddProducts(quantity);
		
		System.out.println("Update data: " + product);
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.RemoveProducts(quantity);
		
		System.out.println("Update data: " + product);
	}

}
