package class_26_12_IFelse;

import java.util.Scanner;

public class Discount_ifelse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill amount");
		int bill = sc.nextInt();
		float discount;

		if (bill >= 10000) {
			discount = (bill * 10) / 100;
			System.out.println("Discount given is Rs" + discount);
		} else if (bill > 5000 && bill < 10000) {
			discount = (bill * 5) / 100;
			System.out.println("Discount given is Rs" + discount);
		} else if (bill > 1000 && bill < 5000) {
			discount = (bill * 2) / 100;
			System.out.println("Discount given is Rs" + discount);
		} else {
			System.out.println("no discount");
		}

	}

}
