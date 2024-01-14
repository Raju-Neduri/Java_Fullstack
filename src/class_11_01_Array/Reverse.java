package class_11_01_Array;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Get the size of the array from the user
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		// Declare an array of the specified size
		int[] numbers = new int[size];

		// Get array elements from the user
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			System.out.print("Element " + (i + 1) + ": ");
			numbers[i] = scanner.nextInt();
		}

		// Print the original array
		System.out.println("Original Array: ");
		printArray(numbers);

		// Reverse the array
		reverseArray(numbers);

		// Print the reversed array
		System.out.println("Reversed Array: ");
		printArray(numbers);

		// Close the scanner
		scanner.close();
	}

	// Method to reverse the elements of an array
	private static void reverseArray(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}

	// Method to print the elements of an array
	private static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
