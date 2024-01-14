package class_11_01_Array;

import java.util.Scanner;

public class Odd_in_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int count = 0;
		// code for taking input from the user
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the value of the element " + i + ":");
			a[i] = sc.nextInt();
		}

		// code to check code numbers in the array
		for (int i = 0; i < n; i++) {

			if (a[i] % 2 != 0) {
				System.out.println(a[i] + " is the odd number at index of " + i);
				count++;
			}
		}
		System.out.println("The count of odd numbers in the array are :" + count);

	}

}
