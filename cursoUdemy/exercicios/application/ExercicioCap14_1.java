package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class ExercicioCap14_1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		System.out.print("Ente the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			
			System.out.print("Individual or company (i/c) ? ");
			char option = sc.next().charAt(0);
			System.out.print("Name: ");
			String nome = sc.next();
			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();
			
			if (option == 'i') {
				System.out.print("Health expenditures: ");
				double gastosSaude = sc.nextDouble();
				
				pessoas.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			}
			else if (option == 'c') {
				System.out.print("Number of emploees: ");
				int funcionarios = sc.nextInt();
				
				pessoas.add(new PessoaJuridica(nome, rendaAnual, funcionarios));
			}
		}
		
		System.out.println("\nTAXES PAID:");
		double totalTaxes = 0.0;
		for(Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
			totalTaxes += pessoa.imposto();
		}
		
		System.out.printf("Total Taxes: $ %.2f", totalTaxes);
	}

}
