package OOPS;

import OOPSImplementation.AcessModifiers;

class A {
	final int a;
	
	A() {
	a = 10;	
	}
	
	void printA() {
		System.out.println(this.a);
//		a = 20;
	}
	void print() {
		System.out.println("Print of A class");
	}
}

class B extends A{
	int b;
	
	void printB() {
		System.out.println(this.b);
	}
	
	@Override
	void print() {
		// change the definition
		System.out.println("Print of B class");
	}
}


public class Polymorphism extends AcessModifiers{

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
	
	void test() {
		this.a = 20;
//		this.printA() not accessible
	}
	
	public static void main(String[] args) {
//		sum(1,2);
//		sum(1,2,3);
//		sum(1.2, 2);
		
		A obj1 = new A();
		obj1.print();
		
		B obj2 = new B();
		obj2.print();
		
		A obj3 = new B();
		obj3.print();
		obj3.printA();
//		obj3.printB();
//		not allowed
//		B obj4 = new A();
		Parent p = null;
		
//		AcessModifiers acc = new AcessModifiers();
//		acc.a = 20;
	}
}
