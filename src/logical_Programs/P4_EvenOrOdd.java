package logical_Programs;

import java.util.Scanner;

public class P4_EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if (n == 0) {
			System.out.println("Number is equal to zero");
		} else if (n % 2 == 0) {
			System.out.println(n + " is an even number");
		} else {
			System.out.println(n + " is an odd number");
		}
	}

}
