package HashMaps;

import java.util.HashMap;
import java.util.Map.Entry;

public class Questions {
	
	public static void charWithMaxFreq(char arr[]) {
		char ans = ' ';
		int max = 0;
		// make freq map
		HashMap<Character, Integer> fmap = new HashMap<>();
		
		for(char ch : arr) {
			if(fmap.containsKey(ch)) {
				int initialFreq = fmap.get(ch);
				fmap.put(ch, initialFreq + 1);
			} else {
				fmap.put(ch, 1);
			}
		}
		
		
		for(Entry<Character, Integer> entry : fmap.entrySet()) {
			if(entry.getValue() > max) {
				max = entry.getValue();
				ans = entry.getKey();
			}
		}
		
		 System.out.println(ans + " -> " + max);;
	}

	public static void main(String[] args) {
		charWithMaxFreq(new char[] {'a', 'b', 'c','a', 'b', 'b'});
	}

}
