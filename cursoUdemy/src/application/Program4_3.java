package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Daniel
 *
 * 3 de abr de 2020
 */
public class Program4_3 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Mario");
		list.add("Marcos");
		list.add("Bob");
		list.add("Amanda");
		
		list.add(2, "Anna");
		
		System.out.println(list.size());
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------");
		
		list.removeIf(x -> x.charAt(0) == 'M');
		System.out.println(list);
		
		System.out.println("-------------------");
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("index of Marcos: " + list.indexOf("Marcos"));
		
		System.out.println("-------------------");
		List<String> result = list.stream().filter(name -> name.charAt(0) == 'A').collect(Collectors.toList());
		System.out.println(result);
		
		System.out.println("-------------------");
		
		String name1 = list.stream().filter(x -> x.charAt(0) == 'H').findFirst().orElse(null);
		
		System.out.println(name1);
	}

}
