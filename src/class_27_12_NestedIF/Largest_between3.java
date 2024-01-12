package class_27_12_NestedIF;

import java.util.Scanner;

public class Largest_between3 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		a = sc.nextInt();
		System.out.println("enter Second number");
		b = sc.nextInt();
		System.out.println("enter Third number");
		c = sc.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println(a + " is a greater number");
			} else {
				System.out.println(c + " is a greater number");
			}
		} else {
			if (b > c) {
				System.out.println(b + " is a greater number");
			} else {
				System.out.println(c + " is  greater number");
			}
		}
	}
}
