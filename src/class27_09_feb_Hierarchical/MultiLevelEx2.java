package class27_09_feb_Hierarchical;

class Mul_Shape {
	public void showShape() {
		System.out.println("Class shape: Supermost class");

	}

}

class Mul_Rectangle extends Mul_Shape {
	public void rectangleShow() {
		System.out.println("Inside are  method parent class - Rectangle");
	}
}

class Cube extends Mul_Rectangle {
	public void cubeShow() {
		System.out.println("Inside are  method parent class - cube");
	}
}

public class MultiLevelEx2 {

	public static void main(String[] args) {
		Cube c = new Cube();
		c.showShape();
		c.rectangleShow();
		c.cubeShow();

	}

}
