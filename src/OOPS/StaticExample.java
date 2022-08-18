package OOPS;

class OuterClass {
	
	int nonsvar = 10;
	static int statvar = 20;
	
	  static class NestedClass {
		public void fun() {
			statvar = 30;
//			nonsvar = 40; can not access non static data member inside static class
		}
	}
}

public class StaticExample {
	public static void main(String[] args) {
		
		OuterClass obj = new OuterClass();
//		NestedClass a = obj.new NestedClass();
		OuterClass.NestedClass a = new OuterClass.NestedClass();
		
	}
}
