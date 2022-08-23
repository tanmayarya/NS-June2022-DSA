package OOPSImplementation;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Car engine started");
	}

	@Override
	public void stop() {
		System.out.println("Car engine stoped");
	}

	@Override
	public void accelerate(int speed) {
		System.out.println("car accelerated by " + speed);
	}

	@Override
	public void brake() {
		System.out.println("Car brakes");
	}

}
