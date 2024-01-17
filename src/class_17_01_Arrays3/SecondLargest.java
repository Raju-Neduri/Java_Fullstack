package class_17_01_Arrays3;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n = sc.nextInt();

		int a[] = new int[n];
		for (int k = 0; k < n; k++) {
			System.out.println("Enter the value for index " + k + ":");
			a[k] = sc.nextInt();
		}

		// code to find largest and second largest
		int firstLargest = 0, secondLargest = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = a[i];
			} else if (a[i] > secondLargest && a[i] != firstLargest) {
				secondLargest = a[i];
			}
		}
		System.out.println("First largest number :" + firstLargest);
		System.out.println("Second largest number :" + secondLargest);
	}

}
