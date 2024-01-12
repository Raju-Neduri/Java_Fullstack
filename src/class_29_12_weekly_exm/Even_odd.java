//Q.5. WAP to check whether the given number is even or odd.
package class_29_12_weekly_exm;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("It is an even number");
		} else {
			System.out.println("It is an odd number");
		}
	}

}
