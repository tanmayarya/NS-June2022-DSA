package Arrays;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> list = new ArrayList<Integer>();
		// add
		list.add(1);
		list.add(2);
		list.add(null);
		System.out.println(list);
		list.add(1, 10);
		System.out.println(list);
		//remove
		list.remove(0);
		System.out.println(list);
		
		list.set(2, 100);
		System.out.println(list);
		
		// get
		int elementAtidx1 = list.get(1);
		
		
		System.out.println(elementAtidx1);
		
		System.out.println(list.size());
	}

}
