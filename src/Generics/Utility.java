package Generics;

public class Utility {

	public static void main(String[] args) {
//		MyArrayList al = new MyArrayList();
//		al.add(10);
//		al.add(20);
//		System.out.println(al);
//		al.add(30);
//		al.set(1, 50);
//		System.out.println(al);
//		System.out.println(al.remove());
//		
//		System.out.println(al);
		
		GenericArrayList<String> list = new GenericArrayList<>();
		list.add("Hi");
		list.add("Hello");
		list.add("Welcome");
//		list.add(20);
		System.out.println(list);
		
		
	}

}
