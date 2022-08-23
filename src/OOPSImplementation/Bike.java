package OOPSImplementation;

public class Bike implements Vehicle {

	@Override
	public void start() {
		System.out.println("Bike engine started");
	}

	@Override
	public void stop() {
		System.out.println("Bike engine stoped");
	}

	@Override
	public void accelerate(int speed) {
		System.out.println("Bike accelerated by " + speed);
	}

	@Override
	public void brake() {
		System.out.println("Bike brakes");
	}

}
