package class25_07_feb_Polymorphism;

public class Varargs1 {

	public void show(String... str) {
		for (String s : str) {
			System.out.println(s);

		}

	}

	public static void main(String[] args) {
		Varargs1 v = new Varargs1();
		v.show();
		v.show("Vaishu");
		v.show("Raju", "Ram", "Vaishu");

	}

}
