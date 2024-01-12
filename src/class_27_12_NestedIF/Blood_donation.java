package class_27_12_NestedIF;

import java.util.Scanner;

public class Blood_donation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age of the  person");
		int age = sc.nextInt();
		System.out.println("enter the weight of the  person");
		int w = sc.nextInt();

		if (age >= 25) {
			if (w >= 45) {
				System.out.println("Person is eligible for blood donation");
			} else {
				System.out.println("Person is not eligble for blood donation because his weight is less than 45kgs");
			}
		} else {
			System.out.println("Person age should be more than 25");
		}
	}
}
