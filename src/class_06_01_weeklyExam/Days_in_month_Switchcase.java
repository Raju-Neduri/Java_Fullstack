// 2 Wap to find no of days in a month using switch case statement
package class_06_01_weeklyExam;

import java.util.Scanner;

public class Days_in_month_Switchcase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month between 1-12");
		int month = sc.nextInt();

		switch (month) {
		case 1:
			System.out.println("31 days in the month");
			break;

		case 2:
			System.out.println("28 or 29 days in the month based on year");
			break;
		case 3:
			System.out.println("31 days in the month");
			break;
		case 4:
			System.out.println("30 days in the month");
			break;
		case 5:
			System.out.println("31 days in the month");
			break;
		case 6:
			System.out.println("30 days in the month");
			break;
		case 7:
			System.out.println("31 days in the month");
			break;
		case 8:
			System.out.println("31 days in the month");
			break;
		case 9:
			System.out.println("30 days in the month");
			break;
		case 10:
			System.out.println("31 days in the month");
			break;
		case 11:
			System.out.println("30 days in the month");
			break;
		case 12:
			System.out.println("31 days in the month");
			break;
		default:
			System.out.println("Invalid month");

		}
	}

}
