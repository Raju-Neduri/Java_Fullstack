// 3.  write a to check person is eligible for voting or not using switch statement
package class_06_01_weeklyExam;

import java.util.Scanner;

public class Person_eligible_voting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you above 18+ (Yes/No)");
		String input = sc.next();

		switch (input) {
		case "yes":
			System.out.println("Eligble for voting");
			break;
		case "Yes":
			System.out.println("Eligble for voting");
			break;
		case "No":
			System.out.println("You are not Eligble for voting");
			break;
		case "no":
			System.out.println("You are not Eligble for voting");
			break;
		default:
			System.out.println("Invalid entry");
		}

	}

}
