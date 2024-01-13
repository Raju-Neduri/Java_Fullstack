package class_11_01_Array;

import java.util.Scanner;

public class Even_Numbers_in_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();

		int a[] = new int[n];
		int i;
		for (i = 0; i < n; i++) {
			System.out.println("Enter the value of index " + i + ":");
			a[i] = sc.nextInt();
		}

		for (i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i] + " is a even number in the array at index position of " + i);
			}

		}

	}

}
