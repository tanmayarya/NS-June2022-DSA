package OOPS;

import java.util.Stack;

public class ExceptionHandling {
	public static void divide(int a, int b) {
		try {
			if(b == 0) {
				throw new NullPointerException("b can not be 0");
			}
			
			int arr[] = new int[0];
			arr[0] = 1;
			Stack<Integer> st = null;
			st.push(1);
			System.out.println(a/b);
			System.out.println("After the exception");
		}
//		catch (ArithmeticException e) {
//		
//			System.out.println("arithmatic excception is thrown");
//			System.out.println(e.getMessage());
//		} 
//		catch(NullPointerException e) {
//			System.out.println("null pointer excception is thrown");
//			System.out.println(e);
//		}
		catch (Exception e) {
			System.out.println("generic exception");
//			System.out.println(e);
//			e.printStackTrace();
		} 
		finally {
			System.out.println("Inside finally block");
		}
		
		System.out.println("after try catch");
		
	}
	public static void fun() throws Exception {
		
//		divide(0, 0);
		demo();
	}
	
	public static void demo() throws Exception {
//		try {
//			throw new Exception();
//		} catch(Exception e) {
//			
//		}
		Exception e = new Exception();
		throw e;
		
	}
	
	public static void main(String[] args){
//		fun();
	}
}
