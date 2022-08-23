package OOPSImplementation;

public class Utility {
	static int a;
	public static void main(String[] args) {
		
		AcessModifiers obj = new AcessModifiers();
		obj.a = 20;
//		obj.b = 20;
		obj.printA();
		
		StringBuilder sb = new StringBuilder("Tanmay");
		sb.toString();
		
		Shape triangle = new Triangle();
		triangle.area();
		
		Square square = new Square();
		square.area();
		
		Vehicle car = new Car();
		car.start();
		car.accelerate(20);
		car.stop();
		
		Vehicle bike = new Bike();
		
	}
}
