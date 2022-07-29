package Arrays;

import javax.print.attribute.standard.JobOriginatingUserName;

public class Sorting {
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void bubbleSort(int arr[]) {
		for(int pass = 1; pass < arr.length; pass++) {
			for(int i = 1; i <= arr.length - pass; i++) {
				if(arr[i-1] > arr[i]) {
					swap(arr, i, i-1);
				}
			}
		}
	}
	
	public static void selectionSort(int arr[]) {
		
		for(int pass = 1; pass < arr.length; pass++) {
			int pos = pass - 1;
			int minIdx = pos;
			// find minIdx
			for(int i = pos; i < arr.length; i++) {
				if(arr[i] < arr[minIdx]) {
					minIdx = i;
				}
			}
			swap(arr, minIdx, pos);
		}
	}
	
	public static void insertionSort(int arr[]) {
		
		for(int unsortedStartIdx = 1; unsortedStartIdx < arr.length; unsortedStartIdx++) {
			
			int key = arr[unsortedStartIdx];
			int j = unsortedStartIdx - 1;
			
			// right shift
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	
	public static void display(int arr[]) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int arr[] = {6, 4, 1, 3, 8, 5};
		display(arr);
		insertionSort(arr);
		display(arr);

	}

}
