package Adapters;

public class Utility {
	
	public static void main(String[] args) {
//		QueueUsing2StackEnqueEfficient q = new QueueUsing2StackEnqueEfficient();
		QueueUsing2StacksDequeEfficient q = new QueueUsing2StacksDequeEfficient();
		
		q.add(1);
		q.add(3);
		q.add(2);
		q.add(4);
		q.display();
		System.out.println(q.peek());
		q.remove();
		q.display();
	}
}
