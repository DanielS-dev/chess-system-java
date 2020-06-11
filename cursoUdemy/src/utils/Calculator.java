package utils;

/**
 * @author Daniel
 *
 * 29 de mar de 2020
 */
public class Calculator {
	public static final double PI = 3.14159;
	
	public static double circumference(double radius) {
		return 2 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4 * PI * radius * radius * radius / 3;
	}
	
}
