package basics;

import java.util.Scanner;

public class Functions {
	
	public static int factorial(int n) {
		int nfact = 1;
		
		for(int i = 1; i <= n; i++) {
			nfact *= i;
		}
		
		return nfact;
	}
	
	public static int ncr(int n, int r) {
		int nfact = factorial(n);
		int rfact = factorial(r);
		int nmrfact = factorial(n-r);
		
		int ncr = nfact / (rfact * nmrfact);
		return ncr;
	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = scn.nextInt();
		
		
//		int nfact = 1;
//		
//		for(int i = 1; i <= n; i++) {
//			nfact *= i;
//		}
//		
//		int rfact = 1;
//		
//		for(int i = 1; i <= r; i++) {
//			rfact *= i;
//		}
//		
//		int nmrfact = 1;
//		
//		for(int i = 1; i <= n-r; i++) {
//			nmrfact *= i;
//		}
//		
//		int ncr = nfact / (rfact * nmrfact);
		
		System.out.println(ncr(n, r));
		

	}

}
