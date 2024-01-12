//Time of Day Greeting
package class_27_12_NestedIF;

import java.util.Scanner;

public class TimeOfDayGreeting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the hour (0-23): ");
		int hour = scanner.nextInt();

		if (hour >= 0 && hour < 12) {
			System.out.println("Good morning!");
		} else if (hour >= 12 && hour < 18) {
			System.out.println("Good afternoon!");
		} else {
			System.out.println("Good evening!");
		}
	}

}
