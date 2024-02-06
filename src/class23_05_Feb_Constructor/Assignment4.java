/*
 * 4.write a java program to create a class called "Rectangle" with width and height attriutes
 * calculate THE area and perimeter  of the rectangle 
 * 
 * 
 * 
 */

package class23_05_Feb_Constructor;

class Rectangle {
	int width, height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int calculateArea() {
		return width * height;
	}

	public int calculatePerimeter() {
		return 2 * (width + height);
	}

	public void show() {
		System.out.println("Area of Rectangle: " + calculateArea());
		System.out.println("Perimeter of Rectangle: " + calculatePerimeter());
	}
}

public class Assignment4 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(20, 30);
		r.show();

	}

}
