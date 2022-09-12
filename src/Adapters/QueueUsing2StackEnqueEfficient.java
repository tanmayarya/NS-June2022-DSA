package Adapters;

import java.util.Stack;

public class QueueUsing2StackEnqueEfficient {
	
	Stack<Integer> main;
	Stack<Integer> helper;
	
	public QueueUsing2StackEnqueEfficient() {
		main = new Stack<>();
		helper = new Stack<>();
	}
	
	// O(1)
	public void add(int val) {
		main.push(val);
	}
	
	public int remove() {
		if(main.isEmpty()) return -1;
		int valueToRemove;
		
		while(main.size() != 1) {
			helper.push(main.pop());
		}
		valueToRemove = main.pop();
		
		while(!helper.isEmpty()) {
			main.push(helper.pop());
		}
		return valueToRemove;
	}
	
	public int peek() {
		if(main.isEmpty()) return -1;
		int valueToReturn;
		
		while(main.size() != 1) {
			helper.push(main.pop());
		}
		valueToReturn = main.peek();
		
		while(!helper.isEmpty()) {
			main.push(helper.pop());
		}
		return valueToReturn;
	}
	
	public boolean isEmpty() {
		return main.isEmpty();
	}
	
	public int size() {
		return main.size();
	}
	
	public void display() {
		System.out.println(main);
	}
}
