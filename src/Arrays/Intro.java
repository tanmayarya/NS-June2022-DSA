package Arrays;

public class Intro {

	public static void main(String[] args) {

		int marks[];
		marks = new int[5];
		
		marks[0] = 6;
		marks[1] = 8;
		marks[2] = 1;
		marks[3] = 4;
		marks[4] = 10;
		
		
		for(int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		
	
		marks[1] = 30;
		
		System.out.println("value of ist index" + marks[1]);
//		System.out.println(marks.length);
		
		int arr[] = {6, 8, 1, 4, 10};
	}

}
