package class31_14_feb_abstracion;

abstract class Shape {
	public Shape() {
		System.out.println("shape Constructor");
	}

	public static void display() {
		System.out.println("inside the Static method");
	}

	public abstract void area();

	public void shape() {
		System.out.println("Drawing diff shapes");

	}

}

class Circle extends Shape {
	public void area() {

		double r = 3.4, res;
		res = 3.14 * r * r;
		System.out.println("area of Circle: " + res);
	}

}

class Rectangle extends Shape {
	public void area() {
		double l = 4, b = 3.8, res;
		res = l * b;
		System.out.println("Area of Rectangle :" + res);

	}
}

public class AbsractionShapeEX {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.area();
		c.shape();
		c.display();
		System.out.println(" ");
		Rectangle r = new Rectangle();
		r.area();
		r.shape();
		r.display();

	}

}
