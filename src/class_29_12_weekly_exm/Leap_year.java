// Q.3. WAP to determine whether the year is leap year or not.
package class_29_12_weekly_exm;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = sc.nextInt();

		if ((year % 100 == 0 && year % 400 == 0) || year % 100 != 0 && year % 4 == 0) {
			System.out.println(year + " is a leap year");
		} else
			System.out.println(year + " is not a leap year");
	}

}
