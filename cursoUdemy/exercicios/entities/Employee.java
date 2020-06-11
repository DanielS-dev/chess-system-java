package entities;

/**
 * @author Daniel
 *
 * 28 de mar de 2020
 */
public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		this.grossSalary *= 1.10;
	}
	
	public String toString() {
		return 	name 
				+ ", $ " 
				+ String.format("%.2f", netSalary());
	}
}
