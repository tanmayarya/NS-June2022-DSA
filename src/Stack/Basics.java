package Stack;

import java.util.*;

public class Basics {
	
	public static int evaluatePostfix(String exp) {
		Stack<Integer> st = new Stack<>();
		String elements[] = exp.split(" ");
		for(String element: elements) {
			switch (element.charAt(0)) {
			case '+': {
				int oprnd2 = st.pop();
				int oprnd1 = st.pop();
				st.push(oprnd1 + oprnd2);
				break;
			}
			case '-': {
				int oprnd2 = st.pop();
				int oprnd1 = st.pop();
				st.push(oprnd1 - oprnd2);				
				break;
			}
			case '/': {
				int oprnd2 = st.pop();
				int oprnd1 = st.pop();
				st.push(oprnd1 / oprnd2);				
				break;
			}
			case '*': {
				int oprnd2 = st.pop();
				int oprnd1 = st.pop();
				st.push(oprnd1 * oprnd2);				
				break;
			}
			
			default:
				st.push(Integer.parseInt(element));
			}
		}
		return st.peek();
	}
	
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
//		System.out.println(hasBalancedBrackets("{(a+b)+[c + (d+e)]}"));
//		System.out.println(evaluatePostfix("4 13 5 / +"));
		
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String elements[] = new String[n];
        for(int i = 0; i < n; i++)
        	elements[i] = scn.next();
        Stack<Integer> st = new Stack<>();
		
		for(String element: elements) {
			System.out.println(element + " * ");
			switch (element.charAt(0)) {
			case '+': {
				int oprnd2 = st.pop();
				int oprnd1 = st.pop();
				st.push(oprnd1 + oprnd2);
				break;
			}
			case '-': {
				int oprnd2 = st.pop();
				int oprnd1 = st.pop();
				st.push(oprnd1 - oprnd2);				
				break;
			}
			case '/': {
				int oprnd2 = st.pop();
				int oprnd1 = st.pop();
				st.push(oprnd1 / oprnd2);				
				break;
			}
			case '*': {
				int oprnd2 = st.pop();
				int oprnd1 = st.pop();
				st.push(oprnd1 * oprnd2);				
				break;
			}
			
			default:
				st.push(Integer.parseInt(element));
			}
		}
		System.out.println(st.peek());
		
	}

}
