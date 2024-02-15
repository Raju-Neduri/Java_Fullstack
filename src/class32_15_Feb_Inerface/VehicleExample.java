package class32_15_Feb_Inerface;

class vehicle {
	void changeGear(int x);

	void speedUp(int x);

	void applyBrakes(int a);
}

class Bicycle implements vehicle {
	int speed;
	int gear;

	public Bicycle() {
		System.out.println("Bicycle Constructor");

	}

	public void ChangeGear(int cg) {

		gear = cg;
		System.out.println("Gear changed to: " + Gear);
	}

	public void speedUp(int incr) {

		speed = speed + incr;
		System.out.println("Speed up: " + speed);
	}

	public class VehicleExample {

		public static void main(String[] args) {
			
			Bicycle b=new Bicycle();
			b.ChangeGear(0);
		}

}
