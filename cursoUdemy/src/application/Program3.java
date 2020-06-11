package application;

import java.util.Locale;
import java.util.Scanner;

import utils.Calculator;

/**
 * @author Daniel
 *
 * 29 de mar de 2020
 */
public class Program3 {
		
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Cirfumference: %.2f\n", c);
		System.out.printf("Volume %.2f\n", v);
		System.out.printf("PI value: %.2f\n", Calculator.PI);

	}
	

}
