//Wap to to find the second largest number in the array
package class_11_01_Array;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();

		int a[] = new int[n];
		for (int k = 0; k < a.length; k++) {
			System.out.println("enter the value for index " + k + " :");
			a[k] = sc.nextInt();
		}
		// code to sort the array
		int i, j;
		for (i = 0; i < a.length; i++) {
			for (j = i + 1; j < a.length; j++) {
				int temp = 0;
				if (a[i] < a[j]) { // 82<393
					temp = a[i];// temp=82
					a[i] = a[j];// a[i]=1
					a[j] = temp;// a[j]=1
				}

			}
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("second largest number in the array is :" + a[1]);
	}
}