package OOPS;

class Parent {
	int a;
	
	Parent() {
		System.out.println("Parent default constructor");
	}
	
	Parent (int a) {
		System.out.println("Child parameterized constructor");
		this.a = a;
	}
	
	void printA() {
		System.out.println(this.a);
	}
}

class Child extends Parent{
	int b;
	
	
	Child() {
		this(0);
		System.out.println("Child default constructor");
	}
	
	Child(int b) {
		System.out.println("Child parameterized constructor");
		this.b = b;
	}
	
	Child(int a, int b) {
		super(a);
		this.b = b;
	}
	
	void printB() {
		System.out.println(this.b);
	}
	
	void printAll() {
		System.out.println(super.a);
		System.out.println(this.b);
		super.printA();
	}
	
	
}

public class Inheritence {

	public static void main(String[] args) {
		
		Child c = new Child();
//		Child c2 = new Child(1);
		c.printA();
		c.printB();
//		Object
	}
}
