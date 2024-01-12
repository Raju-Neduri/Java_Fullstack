// Q.1 Take input of age of 3 people by user and determine oldest and youngest among them.
package class_29_12_weekly_exm;

import java.util.Scanner;

public class people_age_old {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first person age");
		int age1 = sc.nextInt();
		System.out.println("Enter the second person age");
		int age2 = sc.nextInt();
		System.out.println("Enter the third person age");
		int age3 = sc.nextInt();

		int oldest, youngest;
		if (age1 >= age2 && age1 >= age3) {
			System.out.println(age1 + " is the oldest");
		} else if (age2 >= age1 && age2 >= age3) {
			System.out.println(age2 + " is the oldest");
		} else {
			System.out.println(age3 + " is the oldest");
		}

		if (age1 <= age2 && age1 <= age3) {
			System.out.println(age1 + " is the Youngest");
		} else if (age2 <= age1 && age2 <= age3) {
			System.out.println(age2 + " is the youngest");
		} else {
			System.out.println(age3 + " is the youngest");
		}

	}
}
