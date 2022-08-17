package OOPS;

class Student {
	String name;
	int rollno;
	
	Student() {
		System.out.println("Running constructor");
		this.name = "";
		this.rollno = 0;
	}
	
	public void printInfo() {
		System.out.println("----------------------------");
		System.out.println("Name is " + this.name);
		System.out.println("Rollno is " + this.rollno);
		System.out.println("----------------------------");
	}
	
	
}


public class Basics {

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.name = "Tanmay";
		s1.rollno = 20;
		s1.printInfo();
		s2.printInfo();
		
		s1.name = "Rajat";
		s1.printInfo();
	}
	

}
