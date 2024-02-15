package class32_15_Feb_Inerface;

interface Flyable {
	void fly_obj();

	default void show() {
		System.out.println("Show method called");
	}
}

class SpaceCraft implements Flyable {

	public void fly_obj() {
		System.out.println("SpaceCraft called");
	}

}

class Airplane implements Flyable {
	public void fly_obj() {
		System.out.println("Airplance called");
	}
}

class Helicopter implements Flyable {
	public void fly_obj() {
		System.out.println("Helicopter called");
	}
}

public class InterfaceFlyable {

	public static void main(String[] args) {

		SpaceCraft s = new SpaceCraft();
		Airplane a = new Airplane();
		Helicopter h = new Helicopter();

		s.fly_obj();
		a.fly_obj();
		h.fly_obj();
		h.show();
	}

}
