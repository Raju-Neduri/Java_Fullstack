package class25_07_feb_Polymorphism;

public class VarArgs3 {

	public void show(int a, String... str) {
		System.out.println(a);
		for (String s : str) {
			System.out.println(s);

		}

	}

	public static void main(String[] args) {
		VarArgs3 v = new VarArgs3();
		v.show(10, "Raju");
		System.out.println(" ");
		v.show(11, "Raju", "vaishu");
		System.out.println(" ");
		v.show(12, "Ram", "vaishu", "Raju");

	}

}
