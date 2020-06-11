package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;
import utils.CurrencyConverter;

/**
 * @author Daniel
 *
 * 28 de mar de 2020
 */
public class ExerciciosCap8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Exercício 1
		/*Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle widht and height:");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle);*/
		
		//Exercício 2
		/*Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("\nEmployee: " + employee);
		
		System.out.print("Which percentage to increase salary ? ");
		employee.increaseSalary(sc.nextDouble());
		
		System.out.println("\nUpdate data: " + employee);*/
		
		//Exercício 3
		/*Student student = new Student();
		
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		System.out.println(student.verificarNota());*/
		
		//Exercício final de fixação
		/*System.out.printf("What is the dollar price ? ");
		double price = sc.nextDouble();
		
		System.out.printf("How many dollars will be bought ? ");
		double quantity = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.buyDollars(price, quantity));*/
		
	}

}
