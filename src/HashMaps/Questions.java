package HashMaps;

import java.util.HashMap;
import java.util.HashSet;
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

	
	public static void printCommonElements(int arr1[], int arr2[]) {
		
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < arr1.length; i++) {
			int elem = arr1[i];
			set.add(arr1[i]);
		}
		
		for(int elem : arr2) {
			if(set.contains(elem)) {
				System.out.println(elem);
			}
		}
	}
	
	
	public static int longestSubarrayWithSumK(int arr[], int k) {
		
		int ps = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int maxLength = 0;
		
		for(int i = 0; i < arr.length; i++) {
			ps = ps + arr[i];
			if(map.containsKey(ps) == false) {
				map.put(ps, i);
			}
			
			if(map.containsKey(ps - k) == true) {
				// posible solution
				int idxPsMK = map.get(ps - k); 
				if(i - idxPsMK > maxLength) 
					maxLength = i - idxPsMK;
			}
		}
		
		return maxLength;
	}
	
	public static int countSubarraysWithEqual0and1(int arr[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 0);
		int count = 0, ps = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) arr[i] = -1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			// calculate prefix sum
			ps = ps + arr[i];
			
			// check if map contains ps
			if(map.containsKey(ps)) {
				int initalCount = map.get(ps);
				count += initalCount;
				map.put(ps, initalCount + 1);
			}else {
				map.put(ps, 1); // first time
			}
		}
		
		return count;
	}
	
	public static boolean isVovel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}
	
	public static int shortestSubStringWithAllVovels(String s) {
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int start = 0, end = 0, minLength = Integer.MAX_VALUE;
		
		while(end < s.length()) {
			
			// acquire
			while(end < s.length() && map.size() < 5) {
				char ch = s.charAt(end);
				if(isVovel(ch) == true) {
					// add in the hashmap
					int initialCount = map.getOrDefault(ch, 0);
					map.put(ch, initialCount + 1);
				}
				end++;
			}
			
			// check for possible ans
			if(map.size() == 5) { // we have 1 valid ans
				// e - s
				if(end - start < minLength) minLength = end - start;
			}
			
			// Release for optimisation
			while(start < s.length() && map.size() == 5) {
				char ch = s.charAt(start);
				if(isVovel(ch)) {
					int initialCount = map.get(ch);
					if(initialCount == 1) {
						map.remove(ch);
						
						// check for valid ans
						if(end - start < minLength) minLength = end - start;
					}
					else map.put(ch, initialCount - 1);
				}
				start++;
			}
		}
		return minLength;
		
	}
	
	public static void main(String[] args) {
//		charWithMaxFreq(new char[] {'a', 'b', 'c','a', 'b', 'b'});
		
		int arr1[] = {10,1,1,1,12,2,2,4,5,6,8,8,2};
		
		int arr2[] = {1, 2, 3, 4, 4};
		
//		printCommonElements(arr1, arr2);
		
		System.out.println(countSubarraysWithEqual0and1(new int[] {0, 0 ,1, 0, 1, 0, 1 }));
		
		
		
	}

}
