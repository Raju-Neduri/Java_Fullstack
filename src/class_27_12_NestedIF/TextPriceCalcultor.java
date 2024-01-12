package class_27_12_NestedIF;

import java.util.Scanner;

public class TextPriceCalcultor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter age: ");
		int age = scanner.nextInt();

		System.out.print("Is it a weekend? (true/false): ");
		boolean isWeekend = scanner.nextBoolean();

		double ticketPrice;

		if (age < 5 || age >= 65) {
			ticketPrice = 0.0; // Free for children under 5 and seniors 65 and older
		} else if (isWeekend && age >= 5 && age <= 12) {
			ticketPrice = 10.0; // Weekend discount for children aged 5-12
		} else if (isWeekend) {
			ticketPrice = 15.0; // Regular weekend price for adults
		} else {
			ticketPrice = 12.0; // Regular weekday price for adults
		}

		System.out.println("Ticket Price: Rs." + ticketPrice);
	}

}
