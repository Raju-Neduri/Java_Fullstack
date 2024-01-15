//example
package logical_Programs;

import java.util.Scanner;

public class ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a positive integer:");
		int n = sc.nextInt();

		if (n <= 0) {
			System.out.println("Please enter a positive integer.");
		} else {
			int sum = findSumOfPrimes(n);
			System.out.println("Sum of prime numbers up to " + n + " is: " + sum);
		}
	}

	private static int findSumOfPrimes(int n) {
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		return sum;
	}

	private static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
