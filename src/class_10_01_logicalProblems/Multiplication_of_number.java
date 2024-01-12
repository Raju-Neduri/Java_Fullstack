package class_10_01_logicalProblems;

import java.util.Scanner;

public class Multiplication_of_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		if (n > 0) {
			for (int i = 1; i <= 10; i++)
				System.out.println(n * i);

		}

		else {
			System.out.println("Entered number less than or equal to 1");
		}
	}

}
