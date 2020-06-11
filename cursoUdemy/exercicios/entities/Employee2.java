package entities;

/**
 * @author Daniel
 *
 * 3 de abr de 2020
 */
public class Employee2 {
	
	private String name;
	private double salary;
	private final int id;
	
	public Employee2(String name, double salary, int id) {
		this.name = name;
		this.salary = salary;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}
	
	public void upperIncrease(double percent) {
		setSalary( getSalary() * (1 + percent / 100) );
	}
	
	public String toString() {
		return 	getId()
				+ ", "
				+ getName()
				+ ", "
				+ String.format("%.2f", getSalary());
	}
	
}
