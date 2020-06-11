package entities;

/**
 * @author Daniel
 *
 * 28 de mar de 2020
 */
public class Rectangle {
	public double width;
	public double height;
	
	public double Area() {
		return width * height;
	}
	
	public double Perimeter() {
		return (width + height) * 2;
	}
	
	public double Diagonal() {
		return width * width + height * height;
	}
	
	public String toString() {
		return "AREA = " 
				+ String.format("%.2f", Area())
				+ "\nPERIMETER = " 
				+ String.format("%.2f", Perimeter())
				+ "\nDIAGONAL = " 
				+ String.format("%.2f", Diagonal());
	}
}
