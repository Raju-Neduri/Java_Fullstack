//wap to find the given number is prime or not
package logical_Programs;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();

		int i, count = 0;
		if (num > 1) {

			for (i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
					System.out.println(num + " it is divisble by " + i);
				}
			}

			if (count == 2) {
				System.out.println(num + " is a prime number");
			} else
				System.out.println(num + " is a not prime number because the divisble by " + count + " numbers");
		} else {

			System.out.println(num + " is a not prime number");
		}
	}
}