package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountBank;

/**
 * @author Daniel
 *
 * 30 de mar de 2020
 */
public class ExercicioCap9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		AccountBank account;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		String accountHolder = sc.next();
		
		System.out.print("Is there na initial deposit (y/n) ?");
		char option = sc.next().charAt(0);
		
		
		if (option == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initial = sc.nextDouble();
			account = new AccountBank(accountHolder, accountNumber, initial);
		}
		else {
			account = new AccountBank(accountHolder, accountNumber);;
		}
		
		System.out.println("\nAccount data: \n" + account);
		
		System.out.print("\nEnter a deposit value: ");
		account.depositar(sc.nextDouble());
		
		System.out.println("\nUpdated account data:\n" + account);
		
		System.out.printf("\nEnter a withdraw value: ");
		account.sacar(sc.nextDouble());
		
		System.out.println("\nUpdated account data:\n" + account);
			
	}

}
