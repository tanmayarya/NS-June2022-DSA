package Arrays;

public class Sorting2 {

	public static int[] merge(int a[], int b[]) {
		int res[] = new int[a.length + b.length];
		
		int i = 0, j = 0, k = 0;
		
		while (i < a.length && j < b.length) {
			if(a[i] <= b[j]) {
				res[k] = a[i];
				i++;
				k++;
			} else {
				res[k] = b[j];
				j++;
				k++;
			}
		}
		
		while(i < a.length) {
			res[k] = a[i];
			i++;
			k++;
		}
		
		while(j < b.length) {
			res[k] = b[j];
			j++;
			k++;
		}
		
		return res;
	}
	
	
	
	public static int[] mergeSort(int arr[], int start, int end) {
		// base case
		if(start == end) {
			int res[] = new int[1];
			res[0] = arr[start];
			return res;
		}
		
		int mid = (start + end) / 2;
		
		int firstHalf[] = mergeSort(arr, start, mid);
		int secondHalf[] = mergeSort(arr, mid + 1, end);
		
		
		int res[] = merge(firstHalf, secondHalf);
		return res;
	}
	
	
	public static void swap (int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	public static void partition3Way(int arr[], int pivot) {
		int left = 0, mid = 0, right = arr.length - 1;
		
		while(mid <= right) {
			if(arr[mid] < pivot) {
//				case 1
				swap(arr, mid, left);
				mid++;
				left++;
				
			}else if(arr[mid] == pivot) {
				// case 2
				mid++;
			}else {
				swap(arr, mid, right);
				right--;
			}
		}
		
	}
	
	public static int partition(int arr[], int pivot, int start, int end) {
		int i = start, j = start;
		while(i <= end) {
			if(arr[i] <= pivot) {
				// region 1
				swap(arr, i, j);
				i++;
				j++;
			}else {
				// region 2
				i++;
			}
		}
		return j - 1;
	}
	
	public static void quickSort(int arr[], int start, int end) {
		
		if(start >= end) return;
		
		int pivot = arr[end];
		int pi = partition(arr, pivot, start, end);
		quickSort(arr, start, pi - 1);
		quickSort(arr, pi + 1, end);
	}

	
	public static void display(int arr[]) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,3, 7, 11, 13};
		int b[] = {1, 3, 4, 6, 10, 14, 15, 17};
		
		int c[] = merge(a, b);
//		display(c);

		int arr[] = {1,5,2,9,3,1,7,4};
//		display(mergeSort(arr, 0, arr.length - 1));
		display(arr);
		
		System.out.println(partition(arr, 4, 0, arr.length - 1));
		display(arr);
		
	}

}
