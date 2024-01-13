// 5 write a program to perform addition of natural numbers
package class_13_01_weekly_exam;

import java.util.Scanner;

public class Addition_Of_natural {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number till you want to add");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++)

		{
			sum += i;

		}
		System.out.println("Addition of n natural num :" + sum);
	}

}
