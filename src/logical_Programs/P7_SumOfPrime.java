package logical_Programs;

import java.util.Scanner;

public class P7_SumOfPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int n1 = sc.nextInt();

		System.out.println("Enter the number");
		int n2 = sc.nextInt();

		int i, j, sum = 0;
		for (i = n1; i <= n2; i++) {
			int count = 0;
			for (j = 2; j <= i; j++) {
				if (i % j == 0) {
					count++;

				}
			}

			if (count == 1) {
				System.out.println(i + " is a prime number from " + n1 + " to " + n2);
				sum += i;
			}
		}
		System.out.println("Sum of prime numbers from " + n1 + " to " + n2 + " =" + sum);
	}

}
