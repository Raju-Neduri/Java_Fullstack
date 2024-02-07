package class25_07_feb_Polymorphism;

public class MethodOverloading1 {

	double res;
	double sum;

	public void percentage(int m1, int m2, int m3, int m4, int m5) {
		sum = (m1 + m2 + m3 + m4 + m5);
		res = (sum / 500) * 100;
		System.out.println(res);
	}

	public void percentage(int m1, int m2, int m3, int m4, int m5, int m6) {
		sum = (m1 + m2 + m3 + m4 + m5 + m6);
		res = (sum / 600) * 100;
		System.out.println(res);
	}

	public static void main(String[] args) {
		MethodOverloading1 mark = new MethodOverloading1();
		mark.percentage(1, 2, 3, 4, 5);
		mark.percentage(1, 2, 3, 4, 5, 6);

	}

}
