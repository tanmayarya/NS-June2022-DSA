package Arrays;

public class KadaneAlgo {
	
	public static int kadane(int arr[]) {
		int meh = arr[0], max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(meh < 0) {
				meh = arr[i];
			} else {
				meh = meh + arr[i];
			}	
			if(max < meh) max = meh;		
		}
		return max;
	}
	
	public static int negativeKadanes(int arr[]) {
		int minEndHere = arr[0], min = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(minEndHere < 0) {
				minEndHere = minEndHere + arr[i];
			} else minEndHere = arr[i];
			
			if(minEndHere < min) min = minEndHere;
		}
		
		return min;
	}
	
	public static int maxSumCircularSubarray(int arr[]) {
		
		int arraySum = 0;
		for(int i = 0; i < arr.length; i++) 
			arraySum += arr[i];
		
		int doubleArray[] = new int[arr.length * 2];
		
		for(int i = 0; i < arr.length; i++) {
			doubleArray[i] = arr[i];
			doubleArray[arr.length + i] = arr[i];
		}
		
		int negativeWindow = negativeKadanes(doubleArray);
		if(negativeWindow > 0) return arraySum;
		else return arraySum - negativeWindow;
		
	}

	public static void main(String[] args) {
		System.out.println(maxSumCircularSubarray(new int[] {7,-14,13,-18,11,3}));
	}

}
