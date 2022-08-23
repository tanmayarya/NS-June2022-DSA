package OOPSImplementation;

public abstract class Shape {

	private int side;
	
	public Shape(int side) {
		this.setSide(side);
	}
	
	public abstract void area();

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
}
