package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle2;
import entities.Shape;
import entities.enums.Color;

public class Program7_5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> shapes = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Cicler (r/c) ? ");
			char option = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if(option == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				shapes.add(new Rectangle2(color, width, height));
			}
			else if (option == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				shapes.add(new Circle(color, radius));
			}
		}
		
		System.out.println("\nSHAPE AREAS:");
		for(Shape shape : shapes) {
			System.out.println(String.format("%.2f", shape.area()));
		}
	}

}
