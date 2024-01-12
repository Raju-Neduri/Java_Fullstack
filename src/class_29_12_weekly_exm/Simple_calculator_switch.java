
// Q.4. WAP to create simple calculator using switch statement
package class_29_12_weekly_exm;

import java.util.Scanner;

public class Simple_calculator_switch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  first number");
		double num1 = sc.nextDouble();

		System.out.println("Enter  second number");
		double num2 = sc.nextDouble();

		System.out.println("Enter the operation ( +, - , *, / )");
		char operator = sc.next().charAt(0);

		double result;

		switch (operator) {
		case '+':
			result = num1 + num2;
			System.out.println("Addition of two numbers is =" + result);
			break;

		case '-':
			result = num1 - num2;
			System.out.println("Subtraction of two numbers is =" + result);
			break;

		case '*':
			result = num1 * num2;
			System.out.println("Mutiplication of two numbers is =" + result);
			break;

		case '/':
			result = num1 / num2;
			System.out.println("Division of two numbers is =" + result);
			break;

		default:
			System.out.println("Invalid operator");
		}

	}
}
