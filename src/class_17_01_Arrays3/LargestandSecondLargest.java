package class_17_01_Arrays3;

import java.util.Scanner;

public class LargestandSecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();

		int num[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter element at index " + i + ":");
			num[i] = sc.nextInt();

		}
		int largest = num[0];
		int secondLargest = num[0];
		for (int i = 1; i < n; i++) {
			if (num[i] > largest) {
				largest = num[i];
			}
		}

		for (int j = 1; j < n; j++) {
			if (num[j] > secondLargest) {
				if (secondLargest != largest) {
					secondLargest = num[j];
				}
			}
		}
		System.out.println();
		System.out.println("Largest: " + largest);
		System.out.println("Second largest: " + secondLargest);
	}

}
