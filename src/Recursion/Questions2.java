package Recursion;

public class Questions2 {

	public static int fact(int n) {
		if(n == 1) return 1;
		
		int factnm1 = fact(n-1);
		return n * factnm1;
	}
	
	public static int power(int a, int b) {
		if(b == 0) return 1;
		
		int p = power(a, b - 1);
		return a * p;
	}
	
	public static int powerOptimised(int a, int b) {
		
		if(b == 1) return a;
		
		int powerHalf = powerOptimised(a, b/2);
		
		if(b % 2 == 1) // odd
			return powerHalf * powerHalf * a;
		else return powerHalf * powerHalf;
	}
	
	public static int fibonacci(int n) {
		
		if(n == 0 || n == 1) return n;
		
		int fibnm1 = fibonacci(n - 1);
		int fibnm2 = fibonacci(n - 2);
		
		return fibnm1 + fibnm2;
		
	}
	
	
	
	public static void main(String[] args) {

//		System.out.println(fact(6));
//		System.out.println(power(10, 9));
//		System.out.println(powerOptimised(10, 9));
		System.out.println(fibonacci(50));
	}

}
