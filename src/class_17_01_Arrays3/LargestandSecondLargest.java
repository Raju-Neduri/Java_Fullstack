package class_17_01_Arrays3;

import java.util.Scanner;

public class LargestandSecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();

		int a[] = new int[n];

		for (int k = 0; k < n; k++) {
			System.out.println("Enter element at index " + k + ":");
			a[k] = sc.nextInt();
		}
		int i, j;

		for (i = 0; i < n; i++) {

			for (j = i + 1; j < n; j++) {
				int temp = 0;
				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println(a[n - 1]);
	}

}
