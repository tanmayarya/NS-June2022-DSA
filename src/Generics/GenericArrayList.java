package Generics;

public class GenericArrayList <T> {
	private Object data[];
	private int size;
	private int CAPACITY = 10;
	
	public GenericArrayList() {
		this.data = new Object[CAPACITY];
		this.size = 0;
	}
	
	public void add(T value) {
		if(this.size == this.CAPACITY) {
			this.resize();
		}
		this.data[this.size++] = value;
	}
	
	public T remove() {
		if(this.size == 0) return null;
		this.size--;
		return (T)this.data[this.size];
	}
	
	public T get(int index) {
		return (T)this.data[index];
	}
	
	public void set(int index, T value) {
		this.data[index] = value;
	}
	
	private void resize() {
		Object temp[] = new Object[this.CAPACITY * 2];
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
