package class_17_01_Arrays3;

import java.util.Scanner;

public class DescendngOrderSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();

		// code to take input values of array from the user
		int a[] = new int[n];
		for (int k = 0; k < n; k++) {
			System.out.println("Enter the value for the index " + k);
			a[k] = sc.nextInt();
		}
		// code to sort the array into descending order
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				int temp = 0;

				if (a[i] < a[j]) {// 20<52
					temp = a[i];// temp=20
					a[i] = a[j];// a[i}=52
					a[j] = temp;// a[j]=20
				}

			}

			System.out.print(a[i] + " ");
		}
	}
}