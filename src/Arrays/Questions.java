package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Questions {

	public static int sum(int arr[]) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i]; // sum = sum + arr[i]
		}
		return sum;
	}
	
	public static int max(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int span(int arr[]) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
		}
		return max - min;
	}
	
	public static boolean isElementRepeated(int arr[], int n) {
		
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == n) count++;
			if(count > 1) return true;
		}
		return false;
	}
	
	public static void reverse(int arr[]) {
		int left = 0;
		int right = arr.length - 1;
		
		while(left < right) {
			
			// swap
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
	}
	
	public static int[] inverse(int arr[]) {
		int res[] = new int[arr.length]; 
		
		for(int i = 0; i < arr.length; i++)
			res[arr[i]] = i;
		
		return res;
	} 
	
	public static void display(int arr[]) {
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	
	public static void targetSumPair(int arr[], int target) {
		
		// find all pairs
		for(int sp = 0; sp < arr.length - 1; sp++) {
			
			// move end point
			for(int ep = sp + 1; ep < arr.length; ep++) {
					
				if(arr[sp] + arr[ep] == target)
					System.out.println(arr[sp] + ", " + arr[ep]);
			}
		}
	}
	
	
	public static void targetSumPairOptimised(int arr[], int target) {
		
		Arrays.sort(arr);
		
		int left = 0, right = arr.length - 1;
		
		while(left < right) {
			if(arr[left] + arr[right] < target) {
				left++;
			} else if(arr[left] + arr[right] > target) {
				right--;
			} else { // case when target is equal to pair sum
				System.out.println(arr[left] + ", " + arr[right]);
				right--;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 4};
//		System.out.println(sum(arr));
//		System.out.println(max(arr));
//		System.out.println(span(arr));
//		System.out.println(isElementRepeated(arr, 4));
//		
//		display(arr);
//		reverse(arr);
//		display(arr);
		
		int arr2[] = {4, 1, 0, 2, 3};
		int inv[] = inverse(arr2);
//		display(arr2);
//		display(inv);
//		targetSumPair(arr2, 4);
		
		targetSumPairOptimised(arr2, 4);
	}

}
