package OOPS;

public class Polymorphism {

	// function overloading
	static void sum(int a, int b) {
		System.out.println(a + b);
	}
	
	static void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	static void sum(double a, double b) {
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
		sum(1,2);
		sum(1,2,3);
		sum(1.2, 2);
	}
}
