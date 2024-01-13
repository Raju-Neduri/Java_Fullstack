package class_13_01_weekly_exam;

import java.util.Scanner;

public class Armstrong2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check whether prime or not");
		int n = sc.nextInt();

		if (n <= 1) {
			System.out.println(n + " is not prime number because it is equal 1 or less than 1");
		}
		for (int i = 2; i <= n; i++) {
			if (n % 2 == 0) {
				System.out.println(n + " is not a Prime number");
				break;
			}

			if (n == i) {
				System.out.println(n + " is Prime number ");

			}

		}

	}
}
