package class20_01_Feb_Static;

import java.util.Scanner;

public class Area {

	int length, breadth;

	public void accept(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;

	}

	int returnArea() {
		return length * breadth;
	}

	public static void main(String[] args) {
		Area a = new Area();

		int l, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		l = sc.nextInt();
		System.out.println("Enter the breadth");
		b = sc.nextInt();

		a.accept(l, b);
		System.out.println(a.returnArea());
	}
}
