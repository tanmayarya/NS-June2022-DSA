package Adapters;

import java.util.Stack;

public class QueueUsing2StacksDequeEfficient {

	Stack<Integer> main;
	Stack<Integer> helper;
	
	public QueueUsing2StacksDequeEfficient() {
		main = new Stack<>();
		helper = new Stack<>();
	}
	
	// O(n)
	public void add(int val) {
		while(!main.isEmpty()) {
			helper.push(main.pop());
		}
		main.push(val);
		while(!helper.isEmpty()) {
			main.push(helper.pop());
		}
	}
	
	// O(1)
	public int remove() {
		return main.pop();
	}
	
	public int peek() {
		return main.peek();
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
