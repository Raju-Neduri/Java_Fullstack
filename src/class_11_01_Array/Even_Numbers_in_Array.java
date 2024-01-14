// Check for Even Numbers in the array and count the even numbers in the array
package class_11_01_Array;

import java.util.Scanner;

public class Even_Numbers_in_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();

		// code to take input of the array
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the value of index " + i + ":");
			a[i] = sc.nextInt();
		}

		// code to print the original order
		System.out.println("The original order of array :");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");

		// Code to check the even numbers in the array
		int evencount = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				evencount++;
				System.out.println(a[i] + " is a even number in the array at index position of " + i);

			}

		}

		System.out.println("\nThe count of even numbers in the array is :" + evencount);

	}

}
