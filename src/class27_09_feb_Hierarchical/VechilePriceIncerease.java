/*
 * Q.3 WAP to show increased price of Two Wheeler and Four Wheeler. Vehicle is base which is showing base price, For Twowheeler increased price is 2% of basePrice and for Four Wheeler increased price is 4% of base price.
 */

package class27_09_feb_Hierarchical;

class Vechicle {
	double basePrice;

	public void set(double basePrice) { // Accepting base price
		this.basePrice = basePrice;
	}

	public void get() {
		System.out.println("Base of the vechile is :" + basePrice);
	}

}

class TwoWheeler extends Vechicle {
	double finalPrice;

	public void increasedPrice() {
		finalPrice = basePrice + (basePrice * 0.02);
		System.out.println("New updated price of a Two Wheeler is:" + finalPrice);
	}

}

class FourWheeler extends Vechicle {
	double finalPrice;// we can use same variable name in different classes

	public void increasedPrice() {
		finalPrice = basePrice + (basePrice * 0.04);
		System.out.println("New updated price of a four Wheeler is:" + finalPrice);
	}

}

public class VechilePriceIncerease {

	public static void main(String[] args) {
		TwoWheeler t = new TwoWheeler();
		t.set(25000);
		t.get();
		t.increasedPrice();
		System.out.println(" ");

		FourWheeler f = new FourWheeler();
		f.set(30000);
		f.get();
		f.increasedPrice();

	}

}
