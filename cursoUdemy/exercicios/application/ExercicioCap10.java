package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee2;

/**
 * @author Daniel
 *
 * 3 de abr de 2020
 */
public class ExercicioCap10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Room[] vectRoom = new Room[10];
		
		System.out.print("How many rooms will be rented ? ");
		int estudantes = sc.nextInt();
		
		for(int i = 0; i < estudantes; i++) {
			System.out.println("Rent #1:");
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Room: ");
			int room = sc.nextInt() - 1;
			
			vectRoom[room] = new Room(name, email);
		}
		
		System.out.println("Busy rooms:");
		for(int i = 0; i < vectRoom.length; i++) {
			if (vectRoom[i] != null) {
				System.out.printf(i + 1 + ": " + vectRoom[i] + "\n");
			}
		}*/
		
		//Exercício usando List
		/*System.out.print("How many employess will be registered ? ");
		int numberEmployees = sc.nextInt();
		
		List<Employee2> listEmployee = new ArrayList<>();
		
		for(int i = 1; i <= numberEmployees; i++) {
			System.out.println("\nEmployee #" + i);
			
			System.out.print("ID: ");
			int id = sc.nextInt();
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			listEmployee.add(new Employee2(name, salary, id));
		}
		
		System.out.print("\nEnter the employee id that will have salary increase : ");
		int idEmployee = sc.nextInt();
		
		Employee2 employee = listEmployee.stream().filter(x -> x.getId() == idEmployee).findFirst().orElse(null);
		
		if (employee != null) {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			employee.upperIncrease(percent);
		}
		else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println("\nList of employees:");
		
		for(Employee2 obj : listEmployee) {
			System.out.println(obj);
		}*/
		
		//Exercício sobre matriz
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(int i =0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == x) {
					System.out.print("Position " + i + "," + j + ":\n");
					if(j > 0) {
						System.out.print("Left: " + mat[i][j -1] + "\n");
					}
					
					if(j < mat[i].length-1) {
						System.out.print("Right: " + mat[i][j + 1] + "\n");
					}
					
					if(i < mat.length-1) {
						System.out.print("Down: " + mat[i + 1][j] + "\n");
					}
					
					if(i > 0) {
						System.out.print("UP: " + mat[i - 1][j]);
					}
				}
			}
		}
	}

}
