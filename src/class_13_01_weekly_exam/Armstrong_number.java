// 3 write a program to check given number is armstrong or not
package class_13_01_weekly_exam;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
		int num = sc.nextInt();
		int i, count = 0, digit, num1 = 0;
		int input = num;
		while (num != 0) {
			digit = num % 10;
			count++;
			num = num / 10;
		}
		num = input;
		while (num != 0) {
			digit = num % 10;
			num1 += Math.pow(digit, count);
			num = num / 10;
		}
		if (input == num1) {
			System.out.println(input + " is a armstrong number");
		} else {
			System.out.println(input + " is not a armstrong number");
		}

	}

}
