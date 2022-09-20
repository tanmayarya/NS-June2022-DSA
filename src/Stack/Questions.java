package Stack;

import java.util.*;

public class Questions {
	
	public static int[] nextGreaterElement(int arr[]) {
		
		int res[] = new int[arr.length];
		Stack<Integer> st = new Stack<Integer>();
		
		res[res.length - 1] = -1;
		st.push(arr[arr.length - 1]);
		
		for(int i = arr.length - 2; i >= 0; i--) {
			while(!st.isEmpty() && st.peek() < arr[i]) {
				st.pop();
			}
			if(st.isEmpty()) res[i] = -1;
			else res[i] = st.peek();
			
			st.push(arr[i]);
		}
		return res;
	}
	
	public static int largestAreaHistogram(int arr[]) {
		
		int maxArea = Integer.MIN_VALUE;
		Stack<Integer> st = new Stack<>();
		st.push(-1);
		
		for(int i = 0; i < arr.length; i++) {
			while(st.peek() != -1 && arr[st.peek()] >= arr[i]) {
				int idxPoped = st.pop();
				int area = (i - st.peek() - 1) * arr[idxPoped];
				maxArea = Math.max(maxArea, area);
			}
			st.push(i);	 
		}
		
		while(st.peek() != -1) {
			int idxPoped = st.pop();
			int area = (arr.length - st.peek() - 1) * arr[idxPoped];
			maxArea = Math.max(maxArea, area);	
		}
		
		return maxArea;
	}
	
	public static void main(String[] args) {
		int arr[] = {2,1,5,3,4,6,1,3};
		System.out.println(largestAreaHistogram(arr));
	}
}
