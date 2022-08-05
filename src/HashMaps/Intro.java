package HashMaps;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class Intro {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		
		System.out.println(map1);
		// add
		map.put("Tanmay", 90);
		map.put("Nikhil", 90);
		map.put("gaurav", 85);
		map.put(null, null);
		
		System.out.println(map);
		
		// set or update
		map.put("Tanmay", 50);
		System.out.println(map);
		
		// remove
		map.remove("Nikhil");
		System.out.println(map);
		
		
		// get
		int data = map.get("Tanmay");
		System.out.println(data);
		
		int data2 = map.getOrDefault("Shiv", 0);
		System.out.println("data2 is " + data2);
		
		
		System.out.println(map.containsKey("Tanmay "));
		
		// size
		System.out.println(map.size());
		
		
		String arr[] = {"abc", "def"};
		
//		for(int i = 0; i < arr.length; i++) {
//			String element = arr[i];
//			
//			System.out.println(element);
//		}
		
//		for(String element : arr) {
//			System.out.println(element);
//		}
		
		 for(Entry<String, Integer> entry: map.entrySet()) {
			 System.out.println(entry.getKey() + " -> " + entry.getValue());
		 }
		 
		 for(String k : map.keySet()) {
			 System.out.println(k);
		 }
		 
		 map.forEach((k, v) -> {
			 System.out.println(k + "<->" + v);
		 });
	}

}
