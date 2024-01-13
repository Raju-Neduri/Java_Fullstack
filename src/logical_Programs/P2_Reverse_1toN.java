//Wap to Print reverse of N to 1 numbers
package logical_Programs;

import java.util.Scanner;

public class P2_Reverse_1toN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt(); // taking input from the user

		for (int i = n; i >= 1; i--) // logic to reverse
		{
			System.out.print(i + " ");
		}
	}

}
