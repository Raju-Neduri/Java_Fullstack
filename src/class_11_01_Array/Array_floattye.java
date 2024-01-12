package class_11_01_Array;

import java.util.Scanner;

public class Array_floattye {

	public static void main(String[] args) {
		float a[] = new float[9];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 8; i++) {
			System.out.println("enter the value");
			a[i] = sc.nextFloat();
		}
		System.out.println();
		for (int j = 0; j <= 8; j++) {
			System.out.println(a[j]);
		}

	}

}
