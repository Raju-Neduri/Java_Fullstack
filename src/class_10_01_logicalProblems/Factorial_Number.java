package class_10_01_logicalProblems;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int res = 1;
		for (int i = 1; i <= num; i++) {
			res = res * i;
		}
		System.out.println("The factorial " + num + " =" + res);
	}

}
