package OOPS;
import Recursion.Questions2;

class Student {
	String name;
	int rollno;
	static int count;
	
	static {
		System.out.println("inside static block");
		count = 0;
	}
	
	
	Student() {
		System.out.println("Running constructor");
		this.name = "";
		this.rollno = 0;
		count++;
		System.out.println(count);
	}
	
	public void nonStaticMethod() {
		printCount();
		this.printInfo();
	}
	
	public void printInfo() {
		System.out.println("----------------------------");
		System.out.println("Name is " + this.name);
		System.out.println("Rollno is " + this.rollno);
		System.out.println("total count is " + count);
		System.out.println("----------------------------");
		printCount();
	}
	
	public static void printCount() {
		 System.out.println(count);
//		printInfo(); 
	}
}


public class Basics {
	
	 class Example {
		
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
//		s1.count = 10;
//		System.out.println(s2.count);
//		Student.count = 30;
		s1.name = "Tanmay";
		s1.rollno = 20;
		s1.printInfo();
		s2.printInfo();
		Student s3 = new Student();
		s1.name = "Rajat";
		s1.printInfo();
		s1.printCount();
		Student.printCount();
//		Student.printInfo(); does not exist
		
		System.out.println(Questions2.fact(5));
	}
	

}
