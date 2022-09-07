package Stack;

import java.util.Stack;

public class Basics {
	
	public static boolean hasDuplicateBrackets(String exp) {
		
		Stack<Character> st = new Stack<>();
		
		for(int i = 0; i < exp.length(); i++) {
			char currentChar = exp.charAt(i);
			
			if(currentChar == ')') {
				if(st.peek() == '(') return true;
				else {
					while(st.peek() != '(')
						st.pop();
					
					// remove one opening bracket
					st.pop();
				}
				
			} else st.push(currentChar);
		}
		
		return false;
	}
	
	
	public static boolean hasBalancedBrackets(String exp) {
		Stack<Character> st = new Stack<>();
		
		for(int i = 0; i < exp.length(); i++) {
			char currentChar = exp.charAt(i);
			
			if(currentChar == '(' || currentChar == '[' || currentChar == '{') {
				st.push(currentChar);
			} else if(currentChar == ')') {
				if(isComplimentry(st, '(') == false) return false;
			} else if(currentChar == ']') {
				if(isComplimentry(st, '[') == false) return false;
			} else if(currentChar == '}') {
				if(isComplimentry(st, '{') == false) return false;
			}
		}
		if(!st.isEmpty()) return false;
		return true;
	}
	
	public static boolean isComplimentry(Stack<Character> st, char bracket) {
		if(st.isEmpty() || st.peek() != bracket) return false;
		st.pop();
		return true;
	}
	
	
	

	public static void main(String[] args) {
//		Stack<Integer> st = new Stack<>();
//		
//		st.push(12);
//		st.push(1);
//		st.push(2);
//		st.push(3);
//		
//		System.out.println(st);
//		
//		System.out.println(st.pop());
//		System.out.println(st);
//		System.out.println(st.peek());
//		System.out.println(st.size());
//		System.out.println(st.isEmpty());
//		st.clear();
//		System.out.println(st.size());
		
//		System.out.println(hasDuplicateBrackets("((a+b)) = c"));
		System.out.println(hasBalancedBrackets("{(a+b)+[c + (d+e)]}"));
		
	}

}
