package class_17_01_Arrays3;

import java.util.Scanner;

public class MinAndMaxArrayEx {

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
		for (int i = 1; i < n; i++) {
			if (num[i] > max) {
				max = num[i];
			} else if (num[i] < min) {
				min = num[i];

			}
		}
		System.out.println();
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
	}

}
