package Strings;

import java.util.Scanner;

public class Intro {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		String s1 = scn.next();
//		String s2 = scn.next();
//		String s3 = scn.nextLine();
		
		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		
//		System.out.println(s3.charAt(5));
//		
//		System.out.println(s3.substring(1, 8));
//		System.out.println(s3.substring(1,1));
//		System.out.println(s3.substring(1));
//		System.out.println(s3.substring(1, s3.length()));
//		System.out.println(s3.substring(3, s3.length() + 1));
		
		System.out.println("Hello" + " " + "World" + 9);
		System.out.println(10 + 20 + "Hello" + 10 + 20);
		
		String s = "Hey How are you";
		
		char arr[] = s.toCharArray();
		for(int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		
	}
}
