package class_10_01_logicalProblems;

import java.util.Scanner;

public class Amstrong_Number {
	public static void main(String args[]) {
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
			num1 = digit ^ count + num1;
			// num1=(Math.pow(digit,count)+num1
			num = num / 10;
		}
		if (num == num1) {
			System.out.println(input + " is a armstrong number");
		} else {
			System.out.println(input + " is not a armstrong number");
		}
	}
}
