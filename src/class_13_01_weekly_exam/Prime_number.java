// 4. Wap to check given number is prime or not
package class_13_01_weekly_exam;

import java.util.Scanner;

public class Prime_number {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int i, count = 1;

		if (num == 1 || num == 0) {
			System.out.println(num + "is not a prime number");

		}

		for (i = 2; i <= num; i++) {
			if (num % 2 == 0) {
				System.out.println(num + " is not a prime number");
				break;
			}
			if (num == i) {
				System.out.println(num + " is prime");
			}

		}
	}

}
