// WAp to find the Min and maximum in the array 
package class_17_01_Arrays3;

import java.util.Scanner;

public class MinAndMaxArrayEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");// to get the size of the array
		int n = sc.nextInt();

		// to get the array values
		int num[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter element at index " + i + ":");
			num[i] = sc.nextInt();
		}

		// code to get min and max
		int min = num[0];
		int max = num[0];
		for (int i = 1; i < n; i++) {
			if (num[i] > max) {
				max = num[i];
			} else if (num[i] < min) {
				min = num[i];

			}

		}
		// to print the min and max values
		System.out.println();
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
	}

}
