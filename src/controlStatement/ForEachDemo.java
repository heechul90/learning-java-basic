package controlStatement;

import java.util.ArrayList;

public class ForEachDemo {
	public static void main(String[] args) {
		
		// for each¹®
		String[] numbers1 = {"one", "two", "three"};
		for (String number: numbers1) {
			System.out.println(number);
		}
		
		// for each¹® ArrayList
		ArrayList<String> numbers2 = new ArrayList<String>();
		numbers2.add("one");
		numbers2.add("two");
		numbers2.add("three");
		
		for (String number: numbers2) {
			System.out.println(number);
		}
	}
}
