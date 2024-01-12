package class_28_12_SwitchCase;

import java.util.Scanner;

public class Bank_account {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Do you have accont?");
		char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println(
					"which opertion you want to perform Press 1 option-Withrdraw 2.press 2 for check balance and print 3.Press 3 to print Mini statement 4.press 4 to depoist money");
			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Withdraw amount");
				break;
			case 2:
				System.out.println("Check balance and print");
				break;
			case 3:
				System.out.println("Print mini statement");
				break;
			case 4:
				System.out.println("Deposist money in account");
				break;
			default:
				System.out.println("Invaid option");
			}

		} else

		{
			System.out.println("please create the account");
		}

	}
}
