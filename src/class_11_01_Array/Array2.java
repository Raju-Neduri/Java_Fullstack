package class_11_01_Array;

import java.util.Scanner;

public class Array2 {
	public static void main(String args[]) {
		int a[] = new int[9];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 8; i++) {
			System.out.println("enter the value");
			a[i] = sc.nextInt();
		}
		for (int j = 0; j <= 8; j++) {
			System.out.println(a[j]);
		}
	}

}
