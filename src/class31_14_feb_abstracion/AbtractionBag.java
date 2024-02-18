package class31_14_feb_abstracion;

abstract class Bag {
	public Bag() {

		System.out.println("Default Constructor");
	}

	public Bag(int qty) {
		System.out.println("No.of Quantity " + qty);

	}
}

class PaperBag extends Bag {
	public PaperBag(int qty) {
		super(10);
		System.out.println("No.of Quantity " + qty);

	}

	public void show() {
		System.out.println("Calling Paper Bag");

	}

}

public class AbtractionBag {
	public static void main(String[] args) {
		PaperBag p = new PaperBag(5); // Provide the required argument
		p.show(); //
	}
}