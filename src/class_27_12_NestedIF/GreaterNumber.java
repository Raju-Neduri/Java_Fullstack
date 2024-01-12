package class_27_12_NestedIF;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int num = sc.nextInt();
		if (num < 100) {
			if (num > 50) {
				System.out.println("Entered number is greater than 50 and less than 1000");
			}
		} else {
			System.out.println("Entered number is greater than 100");
		}
	}

}
