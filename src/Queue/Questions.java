package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Questions {
	
	public static void maxOfkSizedWindow(int arr[], int k) {
		
		int start = 0, end = 0;
		Deque<Integer> q = new ArrayDeque<>();
		
		while(end < arr.length) {
			
			// remove smaller elements from end
			while(!q.isEmpty() && q.peekLast() < arr[end])
				q.removeLast();
			
			// add the element at end in the deque
			q.addLast(arr[end]);
			
			if(end - start + 1 < k) {
				end++;
			} else {
				System.out.println(q.peekFirst());
				
				if(q.peekFirst() == arr[start]) 
					q.removeFirst();
				
				start++;
				end++;
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		maxOfkSizedWindow(new int[] {1, 3, -1, -3, 5, 3, 6, 7}, 3);
	}
}
