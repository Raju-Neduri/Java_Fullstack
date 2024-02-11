package class27_09_feb_Hierarchical;

class Bank {
	String name;
	String address;

	public void set(String name, String address) {
		this.name = name;
		this.address = address;

	}

	public void get() {
		System.out.println("Name:" + name);
		System.out.println("Address: " + address);

	}

}

class ICICI extends Bank {
	int no_of_cust;

	public void accept(int n) {
		no_of_cust = n;

	}

	public void show() {
		System.out.println("No of Customers:" + no_of_cust);
	}

}

class Axis extends Bank {
	int branches;

	public void receive(int b) {
		branches = b;
	}

	public void display() {
		System.out.println("Branches: " + branches);
	}

}

public class BankExample {

	public static void main(String[] args) {
		ICICI i = new ICICI();
		i.set("ICICI", "jammikunta");
		i.get();
		i.accept(100);
		i.show();

		System.out.println();

		Axis a = new Axis();
		a.set("Axis", "Hyderabad");
		a.get();
		a.receive(10);
		a.display();
	}

}
