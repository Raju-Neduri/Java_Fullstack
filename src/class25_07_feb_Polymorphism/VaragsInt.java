package class25_07_feb_Polymorphism;

public class VaragsInt {
	public void show(int... a) {
		for (int i : a) {
			System.out.println(i);

		}

	}

	public static void main(String[] args) {
		VaragsInt v = new VaragsInt();
		v.show(10);
		System.out.println(" ");
		v.show(10, 22);
		System.out.println(" ");
		v.show(10, 22, 12, 33, 4, 444, 49949);
		System.out.println(" ");
	}

}
