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
		display(c);

		int arr[] = {1,5,2,9,3,1,7};
		display(mergeSort(arr, 0, arr.length - 1));
		display(arr);
	}

}
