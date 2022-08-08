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
	
	public static void main(String[] args) {
//		charWithMaxFreq(new char[] {'a', 'b', 'c','a', 'b', 'b'});
		
		int arr1[] = {10,1,1,1,12,2,2,4,5,6,8,8,2};
		
		int arr2[] = {1, 2, 3, 4, 4};
		
//		printCommonElements(arr1, arr2);
		
		System.out.println(countSubarraysWithEqual0and1(new int[] {0, 0 ,1, 0, 1, 0, 1 }));
		
		
		
	}

}
