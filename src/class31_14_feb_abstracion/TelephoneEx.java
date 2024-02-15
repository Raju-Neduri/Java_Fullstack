package class31_14_feb_abstracion;

abstract class Telephone {
	final public void showCompany() {
		System.out.println("Nokia");
	}

	public static void showAddress() {
		System.out.println("Hyderabad");

	}

	abstract void price();

	abstract void model();

}

class Mobile extends Telephone {
	public void price() {
		System.out.println("30000");
	}

	public void model() {
		System.out.println("Model Lastest 100");
	}

	public void type() {
		System.out.println("Wire less");
	}

}

class Landline extends Telephone {
	public void price() {
		System.out.println("30000");
	}

	public void model() {
		System.out.println("Model 10");
	}

	public void type() {
		System.out.println("Wired");
	}
}

public class TelephoneEx {

	public static void main(String[] args) {

		Landline l = new Landline();
		l.showCompany();
		Landline.showAddress();
		l.price();
		l.model();
		l.type();
		System.out.println(" ");

		Mobile m = new Mobile();
		l.showCompany();
		Mobile.showAddress();
		m.price();
		m.model();
		m.type();

	}

}
