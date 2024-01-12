package class_27_12_NestedIF;

import java.util.Scanner;

public class Positive_Negative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		if (num != 0) {
			if (num > 0) {
				System.out.println("Number is postive number ");
				if (num < 100) {
					System.out.println("Number is less than 100");
				} else if (num >= 100 && num < 1000) {
					System.out.println("Number is with in the range of 100 to 1000");
				} else if (num >= 1000 && num <= 10000) {
					System.out.println("Number is with in the range of 1000 to 10000");
				} else {
					System.out.println("Number is greater than 10000");
				}
			}
		} else {
			System.out.println("Number is 0 which is neither positive or nor negative");
		}
	}

}
