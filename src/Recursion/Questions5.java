package Recursion;

public class Questions5 {
	
	public static int countStairPaths(int n) {
		
		// positive base case
		if(n == 0) return 1;
		
		// negative base case
		if(n < 0) return 0;
		
		int noOfWaysFromnm1 = countStairPaths(n - 1);
		int noOfWaysFromnm2 = countStairPaths(n - 2);
		int noOfWaysFromnm3 = countStairPaths(n - 3);
		
		return noOfWaysFromnm1 + noOfWaysFromnm2 + noOfWaysFromnm3;
	}
	
	public static void printStairPaths(int n, String psf) {
		if(n == 0){
			System.out.println(psf);
			return;
		}
		if(n < 0) return;
		
		printStairPaths(n - 1, psf + 1);
		printStairPaths(n - 2, psf + 2);
		printStairPaths(n - 3, psf + 3);
	}
	
	public static void toh(int n, char source, char destination, char helper) {
		
		if(n == 0) return;
		
		toh(n - 1, source, helper, destination);
		System.out.println("Move disk " + n + " from " + source + " to " + destination);
		toh(n - 1, helper, destination, source);
	}

	
	public static void main(String[] args) {
//		System.out.println(countStairPaths(8));
//		printStairPaths(8, "");
		toh(3, 'A', 'C', 'B');
	}
}
