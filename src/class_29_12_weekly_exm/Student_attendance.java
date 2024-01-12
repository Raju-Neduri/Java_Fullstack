/*
 * Q.2 A student will not be allowed to sit in exam if his/her attendance is less than 75.
Take following input from user
1.Number of classes held
2.Number of classes attended.
And print Percentage of class attended is student is allowed to sit in exam or not.
*/
package class_29_12_weekly_exm;

import java.util.Scanner;

public class Student_attendance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of classes held");
		double held = sc.nextInt();

		System.out.println("Enter the no of classes attended");
		double attend = sc.nextInt();

		double percentage = (attend / held) * 100;

		if (percentage >= 75) {
			System.out.println(
					"student is allowed to sit in the class because the attendance percentage is " + percentage);
		} else
			System.out.println(
					"student is not allowed to sit in the class because the attendance percentage is " + percentage);

	}
}
