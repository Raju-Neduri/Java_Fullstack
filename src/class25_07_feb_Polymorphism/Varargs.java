package class25_07_feb_Polymorphism;

public class Varargs {

	public void show(String... str) {
		System.out.println("Show method invoked");

	}

	public static void main(String[] args) {
		Varargs v = new Varargs();
		v.show();
		v.show("Raju", "Ram", "Vaishu");

	}

}
