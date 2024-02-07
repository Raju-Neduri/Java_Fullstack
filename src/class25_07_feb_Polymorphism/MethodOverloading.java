package class25_07_feb_Polymorphism;

public class MethodOverloading {

	double res;

	public void addition(int a, int b) {
		res = a + b;
		System.out.println("Addition of int numbers:" + res);

	}

	public void addition(float a, float b) {
		res = a + b;
		System.out.println("Addition of float numbers:" + res);

	}

	public void addition(double a, double b, double c) {
		res = a + b + c;
		System.out.println("Addition of double numbers:" + res);

	}

	public void addition(int a, float b, double c, int d) {
		res = a + b + c + d;
		System.out.println("Addition of all numbers:" + res);

	}

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.addition(7, 8);
		m.addition(5.06f, 9.97f);
		m.addition(8.55d, 0.88d, 9.44d);
		m.addition(6, 5.6f, 1.3d, 8);

	}

}
