package basics;

import java.util.*;

public class Patterns {
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for(int row = 1; row <= n; row++) {
			// print each row
			for(int i = 1; i <= row; i++) {
				System.out.print("*");
			}
			
			// enter new line
			System.out.println();
			
		}
		
	}
}
