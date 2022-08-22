package OOPSImplementation;

public class AcessModifiers {
	protected int a;
	private int test;
	
//	getter
	public int getTest() {
		return this.test;
	}
//	setter
//	public void setTest(int test) {
//		this.test = test;
//	}
	
	
	void printA() {
		System.out.println(this.a);
	}
}
