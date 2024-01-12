package class_26_12_IFelse;

import java.util.Scanner;

public class Bonus_Ifelse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the joining year");

		int yr, service;
		double salary, bonus;
		yr = sc.nextInt();
		service = 2023 - yr;

		System.out.println("Enter the salary amount");
		salary = sc.nextDouble();

		if (service >= 5) {
			bonus = (salary * 5) / 100;
			System.out.println("You got :" + bonus + " bonus");
		} else {
			System.out
					.println("No bonus for " + service + "years Experience, because your service is less than 5 years");
		}
	}

}
