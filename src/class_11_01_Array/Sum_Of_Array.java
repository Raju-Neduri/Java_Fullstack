package class_11_01_Array;

import java.util.Scanner;

public class Sum_Of_Array {

	public static void main(String[] args) {
		int i, j, sum = 0;
		int a[] = new int[9];
		Scanner sc = new Scanner(System.in);

		// taking input
		for (i = 0; i <= 8; i++) {
			System.out.println("enter the value");
			a[i] = sc.nextInt();
		}

		// printing order
		for (i = 0; i <= 8; i++) {
			System.out.print(a[i] + " ");
		}

		// code for addition
		for (j = 0; j <= 8; j++) {
			sum = sum + a[j];
		}
		System.out.println("\nAddition of all numbers =" + sum);

	}

}
