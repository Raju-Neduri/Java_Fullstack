/*Q.2 Create a class named 'Shape' with a method to print "this is shape". 
 * Then create two other classes named Rectangle, Circle inheriting the shape class 
 * both are having a method to print "this is rectangle shape" and "this is circle shape" 
 * respectively. Now call the method of 'Shape' and 'Rectangle' as well as 'Circle' class by using object.

*/
package class27_09_feb_Hierarchical;

class Shape {
	String shape;

	public void show() {

		System.out.println("This is in shape");

	}
}

class Rectangle extends Shape {
	public void display() {

		System.out.println("This is in Rectangle shape");
	}

}

class Circle extends Shape {
	public void get() {

		System.out.println("This is in circle shape");
	}

}

public class ShapeHierarchical {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		r.show();
		r.display();

		Circle c = new Circle();
		c.show();
		c.get();
	}
}