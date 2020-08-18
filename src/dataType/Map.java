package dataType;

import java.util.HashMap;

public class Map {
	public static void main(String[] args) {
		
		// put
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("people", "사람");
		map.put("baseball", "야구");
		
		// get
		System.out.println(map);
		System.out.println(map.get("people"));
		
		// containsKey
		System.out.println(map.containsKey("people"));
		
		// remove
		System.out.println(map.remove("people"));
		System.out.println(map);
		
		// size
		System.out.println(map.size());
		
	}
	

}
