package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee3;
import entities.OutsourcerdEmployee;

public class Program7_3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee3> employees = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		Integer quantity = sc.nextInt();
		
		for (int i = 1; i <= quantity; i++) {
			System.out.println("Employee #" + i + " data: ");
			System.out.print("Outsourced (y/n)? ");
			String option = sc.next();
			
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHours = sc.nextDouble();
			
			if (option.equalsIgnoreCase("y")) {
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				employees.add(new OutsourcerdEmployee(name, hours, valuePerHours, additionalCharge));
			}
			else {
				employees.add(new Employee3(name, hours, valuePerHours));
			}
		}
		
		System.out.println("\nPAYMENTS:");
		for (Employee3 employee : employees) {
			System.out.print(employee.toString());
		}
	}

}
