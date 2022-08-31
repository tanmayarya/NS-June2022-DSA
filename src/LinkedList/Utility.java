package LinkedList;
public class Utility {
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.display();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(100);
		ll.addLast(50);
		ll.display();
		ll.add(40, 2);
//		System.out.println(ll.get(1));
//		ll.set(1, 200);
//		System.out.println(ll);
//		System.out.println(ll.removeFirst());
//		System.out.println(ll.removeFirst());
//		System.out.println(ll.removeFirst());
//		ll.display();
//		System.out.println(ll.removeLast());
		ll.display();
//		ll.reverseDI();
//		ll.reversePI();
//		ll.reversePR();
		ll.reverseDR();
		ll.display();
	}
}
