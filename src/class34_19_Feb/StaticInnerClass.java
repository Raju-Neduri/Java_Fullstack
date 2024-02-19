package class34_19_Feb;

public class StaticInnerClass {
	static int data = 30;
	int x = 30; // non Static

	void show() {

		System.out.println("Inside show method:" + x);
	}

	static void display() {
		System.out.println("Inside Static display method");

	}

	static class Inner {
		void msg() {
			display();
			System.out.println("Inside static class:" + data);
		}
	}

	public static void main(String[] args) {
		StaticInnerClass.Inner obj = new StaticInnerClass.Inner();
		obj.msg();
	}

}
