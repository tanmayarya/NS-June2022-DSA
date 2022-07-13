package Bits;

public class BitwiseOperators {
	
	public static int turnIthBitOn(int n, int i) {
		int mask = (1 << (i-1));
		int ans = (n | mask);
		return ans;
	}
	
	public static int turnIthBitOff(int n, int i) {
		int mask = (~(1 << (i-1)));
		return n & mask;
	}
	
	public static int toogleIthBit(int n, int i) {
		int mask = (1 << (i-1));
		return (n ^ mask);
	}
	
	
	public static boolean checkIthBit(int n, int i) {
		int mask = (1 << (i-1));
		return ((n & mask) > 0) ? true : false;
	}
	
	public static void CheckOddEven(int n) {
		if((n & 1) == 0) System.out.println("even");
		else System.out.println("odd");
	}
	
	public static void main(String[] args) {
		System.out.println(turnIthBitOn(13, 2));
		System.out.println(turnIthBitOff(15, 2));
		System.out.println(toogleIthBit(15, 4));
		System.out.println(checkIthBit(15, 5));
		CheckOddEven(5);
	}

}
