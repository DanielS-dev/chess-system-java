package application;

/**
 * @author Daniel
 *
 * 3 de abr de 2020
 */
public class Program4_2 {

	public static void main(String[] args) {
		
		/*int x = 20;
		
		Integer obj = x;
		
		System.out.println(obj);
		
		int y = obj * 2;
		
		System.out.println(y);*/
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		for(String obj : vect) {
			System.out.println(obj);
		}
	}

}
