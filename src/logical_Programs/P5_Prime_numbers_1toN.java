//WAP to print prime numbers between  1 to N numbers
package logical_Programs;

import java.util.Scanner;

public class P5_Prime_numbers_1toN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		for (int i = 2; i <= num; i++) {
			int count = 0;
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}

			if (count == 1) {
				System.out.println(i + " is a prime number from 1 to " + num);

			}
		}
	}

}
