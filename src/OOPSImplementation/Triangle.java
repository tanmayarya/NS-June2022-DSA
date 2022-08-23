package OOPSImplementation;

public class Triangle extends Shape {

	public Triangle() {
		super(3);
	}

	@Override
	public void area() {
		System.out.println("Area of triangle is 0.5 * base * height");
	}
}
