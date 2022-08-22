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
		int max = arr[0], maxeh = arr[0];
		int min = arr[0], mineh = arr[0];
		int sum = arr[0];
		
		for(int i = 1; i < arr.length; i++ ) {
			
			maxeh = Math.max(arr[i], maxeh + arr[i]);
			max = Math.max(maxeh, max);
			
			mineh = Math.min(arr[i], mineh + arr[i]);
			min = Math.min(min, mineh);
			
			sum += arr[i];
		}
		if(min == sum) return max;
		
		return Math.max(max, sum - min);
	}

	public static void main(String[] args) {
		System.out.println(maxSumCircularSubarray(new int[] {7,-14,13,-18,11,3}));
	}

}