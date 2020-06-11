package entities;

/**
 * @author Daniel
 *
 * 28 de mar de 2020
 */
public class Student {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public String verificarNota() {
		double media = nota1 + nota2 + nota3;
		
		if (media >= 60.00) {
			return pass(media);
		}else {
			return failed(media);
		}
	}
	
	private String pass(double media) {
		return "FINAL GRADE = " 
				+ String.format("%.2f", media)
				+ "\nPASS";
	}
	
	private String failed(double media) {
		return "FINAL GRADE = "
				+ String.format("%.2f", media)
				+ "\nFAILED"
				+ "\nMISSING "
				+ String.format("%.2f", 60.00 - media)
				+ " POINTS";
	}
}
