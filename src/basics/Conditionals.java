package basics;

public class Conditionals {

	public static void main(String[] args) {

		int a = 25;
		
//		if(a > 20) {
//			System.out.println("a is smaller than 20");
//		}
//		else {
//			System.out.println("a is greater than 20");
//		}
		
//		if(a > 0) {
//			System.out.println("a is positive");
//		} else if(a < 0){
//			System.out.println("a is negative");
//		} else {
//			System.out.println("a is 0");
//		}
		
		// nesting if
//		if(a > 20) {
//			System.out.println("inside 1st if block");
//			if (a > 30) {
//				System.out.println("inside 2nd if block");
//			}
//			else {
//				
//			}
//		} else {
//			if(a < 20) {
//				
//			}
//		}
		
//		if(a > 18) {
//			if(a > 60) {
//				System.out.println("Senior citizen");
//			} else {
//				System.out.println("Adult");
//			}
//		}else {
//			System.out.println("child");
//		}
		
		int day = 1;
		
		switch (day) {
			case 4: {
				System.out.println("Thursday");
				break;
			}
			case 5: {
				System.out.println("Friday");
				break;
			}
			case 6: {
				System.out.println("Saturday");
				break;
			}
			case 7: {
				System.out.println("Sunday");
				break;
			}
			case 1: {
				System.out.println("Monday");
				break;
			}
			case 2: {
				System.out.println("Tuesday");
				break;
			}
			case 3: {
				System.out.println("Wednesday");
				break;
			}
			
			default: {
				System.out.println("invalid day");
			}
		}
		
		
		if(day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		}
		 else if (day == 3) {
				System.out.println("Wednesday");
			}
		 else if (day == 4) {
				System.out.println("Thursday");
			}
		 else if (day == 5) {
				System.out.println("Friday");
			}
		 else if (day == 6) {
				System.out.println("Saturday");
			}
		 else if (day == 7) {
				System.out.println("Sunday");
			}
		 else {
				System.out.println("invalid");
			}
		
		
	
		String s = a >= 18 ? "adult" : "child";
		
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
