//write a program to find whether the 3 numbers are equal or not

package class_27_12_NestedIF;

import java.util.Scanner;

public class three_numbers {
	public static void main(String[] args) {
		int n1, n2, n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		n1 = sc.nextInt();
		System.out.println("enter Second number");
		n2 = sc.nextInt();
		System.out.println("enter third number");
		n3 = sc.nextInt();

		if (n1 == n2) {
			if (n2 == n3) {
				System.out.println("All three are equal numbers");
			} else {
				System.out.println("First and second numbers are equal");
			}
		} else {
			System.out.println("Three numbers are not equal");
		}

	}

}
