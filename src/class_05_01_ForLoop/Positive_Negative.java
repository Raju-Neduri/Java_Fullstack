package class_05_01_ForLoop;

import java.util.Scanner;

public class Positive_Negative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();

		for (int i = 1; i <= 1; i++) {
			if (number > 0) {
				System.out.println(" the number is positive");
			} else if (number < 0) {
				System.out.println("it is a negative");
			} else
				System.out.println("it is zero");
		}
	}

}
