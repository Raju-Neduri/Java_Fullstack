package class_27_12_NestedIF;

import java.util.Scanner;

public class Even_odd_divisble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			if (num % 6 == 0) {
				System.out.println("Number is even it is divisible by 6");
			} else {
				System.out.println("number is even but it is not divisible by 6");
			}
		} else {
			if (num % 9 == 0) {
				System.out.println("Number is odd and it is divisble by 9");
			} else {
				System.out.println("number is odd but it is not divisible by 9");
			}
		}
	}

}
