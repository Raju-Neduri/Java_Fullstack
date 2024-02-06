package class24_06_Feb_ConstructorChaining;

public class Area {

	double pi, res;

	public Area(int side) {
		res = side * side;
		System.out.println("Area of square:" + res);

	}

	public Area(double pi, int r) {
		res = pi * r * r;
		System.out.println("Area of Circle:" + res);

	}

	public Area(int l, int b) {
		res = l * b;
		System.out.println("Area of Rectangle:" + res);

	}

	public Area(float base, float height) {
		res = 0.5 * base * height;
		System.out.println("Area of Rectangle:" + res);

	}

	public static void main(String[] args) {
		Area a1 = new Area(34, 23);
		Area a2 = new Area(7);
		Area a3 = new Area(3.15, 6);
		Area a4 = new Area(3.4f, 0.3f);

	}

}
