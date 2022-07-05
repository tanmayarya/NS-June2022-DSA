package Arrays;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
