package dataType;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		
		// add
		ArrayList pitches = new ArrayList();
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		pitches.add(1, "155");
		System.out.println(pitches);
		
		// get
		System.out.println(pitches.get(1));
		
		// size
		System.out.println(pitches.size());
		
		// contains
		System.out.println(pitches.contains("142"));
		System.out.println(pitches.contains("143"));
		
		// remove
		System.out.println(pitches.remove("129"));
		System.out.println(pitches);
		System.out.println(pitches.remove(0));
		System.out.println(pitches);		
		
	}

}
