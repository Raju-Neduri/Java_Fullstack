package class19_29_01_Objec;

public class Calculate {
	double cube(int num) {
		return num * num * num;
	}

	static int square(int num) {
		return num * num;
	}

	public static void main(String[] args) {
		Calculate c = new Calculate();
		double res1 = c.cube(5);
		System.out.println("Cube= " + res1);

		int res = square(5);
		System.out.println("square= " + res);
	}

}
