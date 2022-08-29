package LinkedList;

public class LinkedList {
	
	private class Node {
		int data;
		Node next;
		
		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	} 
	
	Node head;
	Node tail;
	int size;
	
	public void addFirst(int data) {
		Node n = new Node(data, null);
		n.next = this.head;
		this.head = n;
		if(this.size == 0) {
			this.tail = head;
		}
		this.size++;
	}
	
	public void addLast(int data) {
		if(this.size == 0) {
			this.addFirst(data);
			return;
		}
		Node n = new Node(data, null);
		this.tail.next = n;
		this.tail = n;
		this.size++;
	}
	
	public void add(int data, int idx) {
		if(this.size  == 0 || idx == 0) {
			this.addFirst(data);
			return;
		}
		if(idx == this.size) {
			this.addLast(data);
			return;
		}
		Node n = new Node(data, null);
		Node temp = this.get(idx - 1);
		n.next = temp.next;
		temp.next = n;
		this.size++;
	}
	
	public Node get(int idx) {
		return null;
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	@Override
	public String toString() {
		Node temp = head;
		String res = "";
		while(temp != null) {
			res += temp.data + " -> ";
			temp = temp.next;
		}
		res += "null";
		return res;
	}
	

}
