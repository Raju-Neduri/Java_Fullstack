package class_11_01_Array;

import java.util.Scanner;

public class Average_array_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Enter element at index " + i + ":");
			a[i] = sc.nextInt();
		}
		for (int j = 0; j < n; j++) {
			sum = sum + a[j];
		}
		double average = (double) sum / n;
		System.out.println();
		System.out.println("Addition of all numbers =" + sum + "\n");
		System.out.println("Average of all numbers =" + average);

	}

}
