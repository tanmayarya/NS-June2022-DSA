package LinkedList;

public class LinkedList {
	
	private class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
		}
		
		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	} 
	
	private Node head;
	private Node tail;
	private int size;

	private Node left;
	
	
	public void addFirst(int data) {
		Node n = new Node(data);
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
		Node n = new Node(data);
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
		Node n = new Node(data);
		Node temp = this.getNode(idx - 1);
		n.next = temp.next;
		temp.next = n;
		this.size++;
	}
	
	public int removeFirst() {
		if(this.size == 0) return -1;
		int itemGettingRemoved = this.head.data;
		if(this.size == 1) {
			this.tail = null;
		}
		this.head = this.head.next;
		this.size--;
		return itemGettingRemoved;
	}
	
	public int removeLast() {
		if(this.size <= 1) return this.removeFirst();
		
		int itemGettingRemoved = this.tail.data;
		Node secondLastNode = this.getNode(this.size - 2);
		secondLastNode.next = null;
		this.tail = secondLastNode;
		this.size--;
		return itemGettingRemoved;
	}
	
	public int remove(int idx) {
		if(this.size <= 1) return this.removeFirst();
		else if(idx == this.size - 1) return this.removeLast();
		
		Node temp = this.getNode(idx - 1);
		int itemGettingRemoved = temp.next.data;
		temp.next = temp.next.next;
		this.size--;
		return itemGettingRemoved;
	}
	
	public int get(int idx) {
		Node targetNode = this.getNode(idx);
		if(targetNode == null) return -1;
		else return targetNode.data;
	}
	
	public void set(int idx, int data) {
		Node targetNode = this.getNode(idx);
		if(targetNode != null) {
			targetNode.data = data;
		}
	}
	
	private Node getNode(int idx) {
		Node temp = this.head;
		int count = 0;
		while(temp != null && count < idx) {
			count++;
			temp = temp.next;
		}
		
		return temp;
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
	
	public void swap(Node one, Node two) {
		int temp = one.data;
		one.data = two.data;
		two.data = temp;
	}
	
	// tc => O(n^2)
	public void reverseDI() {
		int left = 0, right = this.size - 1;
		
		while(left < right) {
			Node leftNode = getNode(left);
			Node rightNode = getNode(right);
			
			// swap
			this.swap(leftNode, rightNode);
			left++;
			right--;
		}
	}
	
	public void swapHeadTail() {
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
	}
	
	// tc => O(n)
	public void reversePI() {
		Node curr = this.head;
		Node prev = null;
		
		while(curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		this.swapHeadTail();
	}
	
	// tc => O(n)
	public void reversePR() {
		this.reversePR(this.head);
		this.swapHeadTail();
	}
	
	// tc => O(n)
	private void reversePR(Node curr) {
		
		if(curr.next == null) return;
		
		reversePR(curr.next);
//		curr.next.next = curr;
		Node nextNode = curr.next;
		nextNode.next = curr;
		curr.next = null;
				
	}
	
	public void reverseDR() {
		left = this.head;
		reverseDR(this.head, 0);
	}
	
	private void reverseDR(Node right, int ridx) {
		if(right == null) return;
		
		reverseDR(right.next, ridx + 1);
		if(ridx >= this.size / 2) {
			swap(left, right);
			left = left.next;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
