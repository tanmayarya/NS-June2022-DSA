package Strings;

public class Questions {
	
	public static void printAllSubstrings(String s) {
		for(int start = 0; start < s.length(); start++) {
			
			for(int end = start + 1; end <= s.length(); end++) {
				// print substring
				System.out.println(s.substring(start, end));
			}
		}
	}
	
	public static String toUpperCase(String s) {
		
		String res = "";
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				char upperCasechar = (char)(ch - ('a'- 'A'));
				res += upperCasechar;
			} else {
				res += ch;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String s = "Hello World";
//		printAllSubstrings(s);
		
		String arr[] = s.split("o");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
//		System.out.println(toUpperCase(s));
	}
}
