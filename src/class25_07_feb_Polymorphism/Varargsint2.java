package class25_07_feb_Polymorphism;

public class Varargsint2 {

	public void show(int... a) {
		int res = 0;
		for (int i : a) {
			res += i;

		}
		System.out.println("addition of method: " + res);

	}

	public static void main(String[] args) {
		Varargsint2 v = new Varargsint2();
		v.show(10);
		System.out.println(" ");
		v.show(10, 22);
		System.out.println(" ");
		v.show(10, 22, 12, 33, 4, 444, 49949);
		System.out.println(" ");
	}

}
