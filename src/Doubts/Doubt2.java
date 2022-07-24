package Doubts;
import java.util.Arrays;
public class Doubt2 {

	public static int gcd(int a, int b) {
		int dividend = a, divisor = b;
		
		while(dividend % divisor > 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		return divisor;
	}
	
	public static void cb(int arr[]) {

		int res[] = new int[arr.length];
		Arrays.fill(res, -2);
		
		for(int i = 0; i < arr.length; i++) {
			
			for (int j = arr.length - 1; j >= i; j--) {
				if(gcd(arr[i], arr[j]) == 1) {
					res[j] = i;
					if(res[i] != -2) {
						if(i - res[i] > j - i) 
							res[i] = j;
					}
					
				}
			}
		}
		
		for(int i = 0; i < res.length; i++)
			System.out.print(res[i] + 1 + " ");
		
	}
	
	public static void closestBuddy(int arr[]) {
		for(int i = 0; i <arr.length; i++) {
			// check for 1
			if(arr[i] == 1) {
				System.out.print(i + 1 + " ");
				continue;
			}
			
			int lidx = -1;
			int ridx = -1;
			
			//left direction
			for(int j = i - 1; j >= 0; j--) {
				if(gcd(arr[i], arr[j]) == 1) {
					lidx = j;
					break;
				}
			}
			
//			right direction
			for(int j = i + 1; j < arr.length; j++) {
				if(gcd(arr[i], arr[j]) == 1) {
					ridx = j;
					break;
				}
			}
			int ans = -1;
			if(lidx == -1 && ridx == -1) {
				// no solution
				ans = -1;
			} else if(lidx == -1) {
				ans = ridx + 1;
			} else if(ridx == -1) {
				ans = lidx + 1;
			} else { // both are present
				if(i - lidx <= ridx - i) {
					ans = lidx + 1;
				} else {
					ans = ridx + 1;
				}
			}
			System.out.print(ans + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cb(new int[] {3, 21, 7, 7, 21});

	}

}
