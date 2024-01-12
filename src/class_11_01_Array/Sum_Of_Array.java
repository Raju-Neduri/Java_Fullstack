package class_11_01_Array;

import java.util.Scanner;

public class Sum_Of_Array {

	public static void main(String[] args) {
		int i, j, sum = 0;
		int a[] = new int[9];
		Scanner sc = new Scanner(System.in);
		for (i = 0; i <= 8; i++) {
			System.out.println("enter the value");
			a[i] = sc.nextInt();
		}
		for (j = 0; j <= 8; j++) {
			sum = sum + a[j];
		}
		System.out.println("Addition of all numbers =" + sum);

	}

}
