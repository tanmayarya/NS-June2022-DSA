package Recursion;

import java.util.ArrayList;

public class Recursion6 {
	
	public static ArrayList<String> getAllSubSequence(String s) {
		
		// base case
		if(s.isEmpty()) {
			ArrayList<String> result = new ArrayList<>();
			result.add("");
			return result;
		}
		
		char firstChar = s.charAt(0);
		String rem = s.substring(1);
		
		ArrayList<String> recResult = getAllSubSequence(rem);
		ArrayList<String> myResult = new ArrayList<String>();
		
		// add all the elements of recResult with empty string
		for(int i = 0; i < recResult.size(); i++) {
			String element = recResult.get(i);
			myResult.add("" + element);
		}
		
		// add all the elements of recResult with first char
		for(int i = 0; i < recResult.size(); i++) {
			String element = recResult.get(i);
			myResult.add(firstChar + element);
		}

		return myResult;
		
	}
	
	public static ArrayList<String> getStairPaths(int n) {
		// positive basecase
		if(n == 0) {
			ArrayList<String> result = new ArrayList<>();
			result.add("");
			return result;
		}
		
		//negative basecase
		if(n < 0) {
			return new ArrayList<String>();
		}
		
		ArrayList<String> list1stepdown = getStairPaths(n- 1);
		ArrayList<String> list2stepdown = getStairPaths(n- 2);
		ArrayList<String> list3stepdown = getStairPaths(n- 3);
		
		ArrayList<String> myResult = new ArrayList<String>();
		
		for(int i = 0; i < list1stepdown.size(); i++) {
			String path = list1stepdown.get(i);
			myResult.add(1 + path);
		}
		
		for(int i = 0; i < list2stepdown.size(); i++) {
			String path = list2stepdown.get(i);
			myResult.add(2 + path);
		}
		
		for(int i = 0; i < list3stepdown.size(); i++) {
			String path = list3stepdown.get(i);
			myResult.add(3 + path);
		}
		
		return myResult;
		
	}

	public static void main(String[] args) {
//		System.out.println(getAllSubSequence("abc"));
		System.out.println(getStairPaths(4));
	}

}
