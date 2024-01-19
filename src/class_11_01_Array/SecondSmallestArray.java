//Wap to find the second smallest from an array
package class_11_01_Array;

import java.util.Scanner;

public class SecondSmallestArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();

		int a[] = new int[n];
		for (int k = 0; k < a.length; k++) {
			System.out.println("enter the value for index " + k + " :");
			a[k] = sc.nextInt();
		}
		// code to sort the array
		int i, j;
		for (i = 0; i < a.length; i++) {
			for (j = i + 1; j < a.length; j++) {
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
		System.out.println("second smallest number in the array is :" + a[1]);
	}
}