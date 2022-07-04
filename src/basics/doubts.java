package basics;

public class doubts {
	
	public static int reverse(int n) {
		int ans = 0;
		while(n > 0) {
			int rem = n % 10;
			ans = ans * 10 + rem;
			n /= 10;
		}
		
		
		return ans;
	}
	
	public static void main(String[] args) {
		
		reverse(122);
		System.out.println(reverse(12345678));
		
	}
}
