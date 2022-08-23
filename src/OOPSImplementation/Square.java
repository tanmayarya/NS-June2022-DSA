package OOPSImplementation;

public class Square extends Shape {

	Square() {
		super(4);
	}
	
	@Override
	public void area() {
		System.out.println("Area of square is side * side");
	}
}
