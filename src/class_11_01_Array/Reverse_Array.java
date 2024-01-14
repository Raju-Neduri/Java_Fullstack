package class_11_01_Array;

import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt(); // taking the size of the array

		int a[] = new int[size];

		// taking array input from the user
		for (int i = 0; i < size; i++) {
			System.out.println("Element " + (i + 1) + ": ");
			a[i] = sc.nextInt();
		}

		// printing the original order
		System.out.println("Here is the original order of the array");
		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		// printing the reverse order
		System.out.println("Here is the reversee order of the array");
		for (int i = size - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

	}
}
