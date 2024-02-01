package class20_01_Feb_Static;

import java.util.Scanner;

class area {
	int length;
	int breadth;

	public int area() {
		return length * breadth;
	}
}

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Rectangle");
		int a = sc.nextInt();
		System.out.println("Enter the breadth of Rectangle");
		int b = sc.nextInt();

		area rectanglearea = new area(a, b);
		System.out.println("Area= " + rectanglearea.area());

	}

}
