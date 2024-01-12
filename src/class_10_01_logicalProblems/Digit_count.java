package class_10_01_logicalProblems;

import java.util.Scanner;

public class Digit_count {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
		int num = sc.nextInt();
		int i, count = 0, digit;
		while (num != 0) {
			digit = num % 10;
			count++;
			num = num / 10;
		}
		System.out.println("count of numbers=" + count);
	}

}
