package OOPS;

import java.util.Arrays;


class CollegeStudent {
	int marks;
	int attendance;
	
	public void printInfo() {
		System.out.println(marks + ", " + this.attendance);
	}
}

public class ComparableAndComparator {

	public static void main(String[] args) {
//		Student students[] = new Student[5];
//		for(int i = 0; i < students.length; i++) {
//			students[i] = new Student();
//			students[i].rollno = i + 1;
//		}
//		Arrays.sort(students);
//		for(int i = 0; i < students.length; i++) {
//			students[i].printInfo();
//		}
		
		CollegeStudent students[] = new CollegeStudent[5];
		for(int i = 0; i < students.length; i++) {
			students[i] = new CollegeStudent();
			students[i].marks = (int)(Math.random() * 100);
			students[i].attendance = (int)(Math.random() * 100);
		}
		
		
//		Arrays.sort(students, 
//				(a, b) -> { return  a.marks - b.marks; });
		
		Arrays.sort(students, (a, b) -> {
			if(a.marks < b.marks) return 1;
			else if(a.marks > b.marks) return -1;
			else return 0;
		});
		
		
		for(int i = 0; i < students.length; i++) {
			students[i].printInfo();
		}
		

	}

}
