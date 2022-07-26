package Recursion;

public class Questions4 {
	
	public static int firstIndex(int arr[], int val, int idx) {
		
		if(idx == arr.length) return -1;
		
		if(arr[idx] == val) return idx;
		else return firstIndex(arr, val, idx + 1);
	}
	
	public static int countMazePath(int maze[][], int row, int col) {
		
		// negative base case
		if(row >= maze.length ||col >= maze[0].length) 
			return 0;
		
		// positive base case
		if(row == maze.length - 1 && col == maze[0].length - 1)
			return 1;
		
		int countFromRightBlock = countMazePath(maze, row, col + 1);
		int countFromBottomBlock = countMazePath(maze, row + 1, col);
		
		return countFromRightBlock + countFromBottomBlock;
		
	}
	
	public static void printMazePath(int maze[][], String psf, int row, int col) 
	{
		// negative base case
		if(row >= maze.length ||col >= maze[0].length)
			return;
		
		// positive base case
		if(row == maze.length - 1 && col == maze[0].length - 1) {
			System.out.println(psf);
			return;
		}
		
		printMazePath(maze, psf + "R", row, col + 1);
		printMazePath(maze, psf + "D", row + 1, col);
	}
	
	public static void main(String[] args) {
		int arr[] = {1,1,1,2,3,4,5,6,7,8};
//		System.out.println(firstIndex(arr, 2, 0));
		int maze[][] = new int[3][3];
		
//		System.out.println(countMazePath(maze, 0, 0));
		printMazePath(maze, "", 0, 0);
	}
}
