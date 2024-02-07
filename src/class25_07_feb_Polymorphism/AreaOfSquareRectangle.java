package class25_07_feb_Polymorphism;

class Area {
	double res;

	public void printarea(int width, int height) {
		res = width * height;
		System.out.println("Area of Rectangle:" + res);
	}

	public void printarea(int side) {
		res = side * side;
		System.out.println("Area of square:" + res);
	}

}

public class AreaOfSquareRectangle {
	public static void main(String[] args) {

		Area a = new Area();
		a.printarea(1, 2);
		a.printarea(2);

	}
}
