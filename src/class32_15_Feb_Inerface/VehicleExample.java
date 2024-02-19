package class32_15_Feb_Inerface;

interface Vehicle {
	void changeGear(int x);

	void speedUp(int x);

	void applyBrakes(int a);
}

class Bicycle implements Vehicle {
	int speed;
	int gear;

	public Bicycle() {
		System.out.println("Bicycle Constructor");
	}

	public void changeGear(int cg) {
		gear = cg;
		System.out.println("Gear changed to: " + gear);
	}

	public void speedUp(int incr) {
		speed = speed + incr;
		System.out.println("Speed up: " + speed);
	}

	public void applyBrakes(int decr) {
		speed = speed - decr;
		System.out.println("After applying brakes speed:" + speed);
	}
}

class Bike implements Vehicle {
	int speed;
	int gear;

	public Bike() {
		System.out.println("Bike Constructor");
	}

	public void changeGear(int cg) {
		gear = cg;
		System.out.println("Gear changed to: " + gear);
	}

	public void speedUp(int incr) {
		speed = speed + incr;
		System.out.println("Speed up: " + speed);
	}

	public void applyBrakes(int decr) {
		speed = speed - decr;
		System.out.println("After applying brakes speed:" + speed);
	}
}

public class VehicleExample {
	public static void main(String[] args) {
		Bicycle b = new Bicycle();
		b.changeGear(1);
		b.speedUp(10);
		b.applyBrakes(8);
		System.out.println(" ");

		Bike b1 = new Bike();
		b1.changeGear(10);
		b1.speedUp(100);
		b1.applyBrakes(18);
	}
}
