package class28_10_Feb;

class Hotel {
	String name = "Raj hostel";

	public void display() {
		System.out.println("Hostel name is :" + name);

	}

}

class PureVeg extends Hotel {
	String type = "Veg";

	public void display() {
		super.display();
		System.out.println("Hostel type is :" + type);

	}

}

class Sweets extends PureVeg {
	String sweetname = "Laddu";

	public void display() {
		super.display();
		System.out.println("Sweet name is :" + sweetname);

	}

}

public class SuperExample {

	public static void main(String[] args) {
		Sweets s = new Sweets();
		s.display();

	}

}
