package Mathematics;

import java.util.Arrays;
import java.util.Scanner;

public class Basics {
	
	public static int gcd(int a, int b) {
		int min = a > b ? b : a;
		for(int i = min; i >= 1; i--) {
			if(a % i == 0 && b % i == 0)
				return i;
		}
		return 1;
	}
	
	public static int gcdOptimised(int a, int b) {
		int dividend = a, divisor = b;
		
		while(dividend % divisor > 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		return divisor;
	}
	
	public static int lcm(int a, int b) {
		int gcd = gcdOptimised(a, b);
		return (a*b)/gcd;
	}
	
	public static boolean isPrime(int n) {
		for(int i = 2; i * i <= n; i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
	
	public static void printPrime(int n) {
		for(int num = 2; num <= n; num++) {
			if(isPrime(num)) System.out.println(num);
		}
	}
	
	public static boolean[] sieveOfEratosthenes(int n) {
		boolean sieve[] = new boolean[n + 1];
		Arrays.fill(sieve, true);
		
		sieve[0] = false;
		sieve[1] = false;
		
		for(int i = 2; i * i <= n; i++) {
			// work only if true
			if(sieve[i]) {	// work only if true
				
				for(int j = i * 2; j <= n; j += i) {
					sieve[j] = false;
				}
			}
		}
		return sieve;
	}

	
	public static void displaySieve(boolean sieve[]) {
		for(int i = 0; i < sieve.length; i++) {
			if(sieve[i]) System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
//		int b = scn.nextInt();
		
//		System.out.println(lcm(a, b));
//		System.out.println(isPrime(a));
//		printPrime(a);
		displaySieve(sieveOfEratosthenes(a));
	}
}
