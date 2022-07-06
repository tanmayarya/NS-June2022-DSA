package Arrays;

public class IntroTo2DArrays {
	
	public static void display(int arr[][]) {
		
		// this loop will run for all rows
		for(int row = 0; row < arr.length; row++) {
			
			//print 1 row
			for(int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			// print empty line after each row
			System.out.println();
		}
	}
	
	public static void printZigZag(int arr[][]) {
		for(int row = 0; row < arr.length; row++) {
			
			if(row % 2 == 0) { // even row
				for(int col = 0; col < arr[row].length; col++) 
					System.out.println(arr[row][col]);
			} else {
				// odd row
				for(int col = arr[row].length - 1; col >= 0; col--)
					System.out.println(arr[row][col]);
					
			}
		}
	}
	
	public static void printSpiral(int arr[][]) {
		int minr = 0, maxr = arr.length - 1, minc = 0, maxc = arr[0].length -1;
	
		int valuesLeftToPrint = arr.length * arr[0].length;
		
		while(valuesLeftToPrint > 0) {
			
			// print top wall
			for(int col = minc; col <= maxc; col++) {
				System.out.println(arr[minr][col]);
				valuesLeftToPrint--;
			}
			minr++;
			
			// print right wall
			for(int row = minr; row <= maxr; row++) {
				System.out.println(arr[row][maxc]);
				valuesLeftToPrint--;
			}
			maxc--;
			
			// print bottom wall
			for(int col = maxc; col >= minc; col--) {
				System.out.println(arr[maxr][col]);
				valuesLeftToPrint--;
			}
			maxr--;
			
			// print left wall
			for(int row = maxr; row >= minr; row--) {
				System.out.println(arr[row][minc]);
				valuesLeftToPrint--;
			}
			minc++;
		}
	}

	public static void main(String[] args) {
		int arr[][] = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12}
				};
		
//		display(arr);
//		printZigZag(arr);
		printSpiral(arr);
	}
}
