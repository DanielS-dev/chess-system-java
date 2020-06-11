package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order2;
import entities.OrderItem2;
import entities.Product2;
import entities.enums.OrderStatus2;

public class ExercicioCap13_2 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		
		System.out.print("Email: ");
		String clientEmail = sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf1.parse(sc.next());
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.next();
		
		System.out.print("How many items to this order ? ");
		Integer quantityItems = sc.nextInt();
		
		Order2 order = new Order2(new Date(), 
				OrderStatus2.valueOf(status));
		
		for(int i = 1; i <= quantityItems; i++) {
			System.out.println("Enter #" + i + "item data:");
			System.out.print("Product name: ");
			String name = sc.next();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			
			OrderItem2 orderItem = new OrderItem2(quantity, 
					new Product2(name, price) );
			
			order.addOrderItem(orderItem);
		}
		
		Client client = new Client(clientName, clientEmail, birthDate, order);
		
		System.out.println(client);
	}

}
