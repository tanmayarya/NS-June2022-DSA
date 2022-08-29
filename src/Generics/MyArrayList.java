package Generics;

// add, remove, get, set, size
public class MyArrayList {
	private int data[];
	private int size;
	private int CAPACITY = 10;
	
	public MyArrayList() {
		this.data = new int[CAPACITY];
		this.size = 0;
	}
	
	public void add(int value) {
		if(this.size == this.CAPACITY) {
			this.resize();
		}
		this.data[this.size++] = value;
	}
	
	public int remove() {
		if(this.size == 0) return -1;
		this.size--;
		return this.data[this.size];
	}
	
	public int get(int index) {
		return this.data[index];
	}
	
	public void set(int index, int value) {
		this.data[index] = value;
	}
	
	private void resize() {
		int temp[] = new int[this.CAPACITY * 2];
		for(int i = 0; i < this.data.length; i++) {
			temp[i] = this.data[i];
		}
		this.data = temp;
		this.CAPACITY *= 2;
	}
	
	@Override
	public String toString() {
		String res = "[ ";
		for(int i = 0; i < this.size; i++) {
			res += data[i] + " ";
		}
		res += ']';
		return res;
	}
	
}
