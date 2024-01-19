//Wap to find the duplicte element from an array
package class_11_01_Array;

import java.util.Scanner;

public class DuplicateElement {

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
		boolean output = false;
		for (i = 0; i < a.length; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("Duplicate element is =" + a[i] + " at index " + i + " and " + j);
					output = true;
				}

			}
		}
		if (output == false) {
			System.out.println("Duplicate element not found");
		}
	}

}
