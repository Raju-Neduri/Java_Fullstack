//write a program to take input of the array elements and check the minimum and maximum
package class_11_01_Array;

import java.util.Scanner;

public class Min_And_Max_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();

		int num[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter element at index " + i + ":");
			num[i] = sc.nextInt();

		}
		int min = num[0];
		int max = num[0];
		for (int i = 1; i <= num.length; i++) {
			if (num.length < min) {
				min = num[i];
			} else if (num.length > max) {
				max = num[i];

			}
		}
		System.out.println();
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
	}

}
