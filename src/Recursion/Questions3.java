package Recursion;

public class Questions3 {
	
	public static void printReverse(int arr[], int idx) {
		if(idx == arr.length) return;
		
		printReverse(arr, idx + 1);
		System.out.println(arr[idx]);
	}
	
	
	public static int max(int arr[], int idx) {
		if(idx == arr.length - 1) 
			return arr[idx];
		
		int maxAhead = max(arr, idx + 1);
		return Math.max(maxAhead, arr[idx]);
	}
	
	public static int lastIndex(int arr[], int val, int idx) {
		if(idx == arr.length) return -1;
		
		int ansFromArrayStartingAtNextIdx = lastIndex(arr, val, idx + 1);
		
		if(ansFromArrayStartingAtNextIdx == -1) { // val was not present
			if(arr[idx] == val) return idx; // found val at idx
			else return -1; // didn't find any ans
		} else { // val is present
			return ansFromArrayStartingAtNextIdx;
		}
	}
	
	
	public static void main(String[] args) {

		int arr[] = {1,1,1,2,3,4,5,6,7,8};
//		printReverse(arr, 0);
//		System.out.println(max(arr, 0));
		System.out.println(lastIndex(arr, 1, 0));
		
	}

}
