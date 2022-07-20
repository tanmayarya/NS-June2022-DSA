package Arrays;

public class Searching {
	
	
	public static int binarySearch(int arr[], int val) {
		
		int left = 0, right = arr.length - 1;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			
			if(arr[mid] == val) {
				return mid;
			} else if(arr[mid] > val) {
				right = mid - 1;
			} else { // arr[mid] < val
				left = mid + 1;
			}
		}
		return -1;
		
	}
	
	
	public static int findFirstOccurence(int arr[], int val) {
		int possibleAnswer = -1;
		
		int left = 0, right = arr.length - 1;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			
			if(arr[mid] == val) {
				possibleAnswer = mid;
				right = mid - 1;
			} else if(arr[mid] > val) {
				right = mid - 1;
			} else { // arr[mid] < val
				left = mid + 1;
			}
		}
		return possibleAnswer;
	}
	
	public static int findLastOccurence(int arr[], int val) {
		int possibleAnswer = -1;
		
		int left = 0, right = arr.length - 1;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			
			if(arr[mid] == val) {
				possibleAnswer = mid;
				left = mid + 1;
			} else if(arr[mid] > val) {
				right = mid - 1;
			} else { // arr[mid] < val
				left = mid + 1;
			}
		}
		return possibleAnswer;
	}

	public static void main(String[] args) {
		int arr[] = {10,20,20,20,50,50,50,50,90, 90};
//		System.out.println(binarySearch(arr, 102));
		System.out.println(findLastOccurence(arr, 20));
	}
}
