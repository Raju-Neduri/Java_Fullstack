//Write a Java program to find the index of a given element in an array. If the element is not present, print a message indicating that it is not found.
package class_11_01_Array;

import java.util.Scanner;

public class Finding_element_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array");
		int size = sc.nextInt();

		// taking input using for loop
		int a[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the values of index " + i);
			a[i] = sc.nextInt();
		}

		// printing the array
		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		// code to find the element in the array
		System.out.println("\nenter the value you want to find");
		int x = sc.nextInt();
		boolean found = false;

		for (int i = 0; i < size; i++) {
			if (x == a[i]) {
				System.out.println(x + " value is at index " + i);
				found = true;
			}

		}
		if (found == false) {
			System.out.println("***Entered element not found in the array***");
		}

	}
}
