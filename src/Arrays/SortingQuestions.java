package Arrays;

import java.util.Arrays;

public class SortingQuestions {
	
	
	public static int findCeilIndex(int arr[], int val) {
		
		int ans = -1, left = 0, right = arr.length - 1;
		
		while(left <= right) {
			int mid = (right + left)/ 2;
			if(arr[mid] >= val) {
				ans = mid; // potential ans
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		
		return ans;
	}
	
	public static int countTriplets(int arr[], int threshold) {
		int count = 0;
		
		Arrays.sort(arr);
		
		for(int i = 2; i < arr.length; i++) {
			int lowerBound = arr[i] - threshold;
			int lowerBoundIdx = findCeilIndex(arr, lowerBound);
			
			int totalElementsToConcider = i - lowerBoundIdx;
			
			//calculating nC2
			count += (totalElementsToConcider * (totalElementsToConcider - 1))/2;
			
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(countTriplets(new int[] {5, 1, 3, 2, 7, 9}, 3));
	}
}
