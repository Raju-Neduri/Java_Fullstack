//Wap to print 1 to N numbers by taking input from the users
package logical_Programs;

import java.util.Scanner;

public class P1_1toN_print {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n number to print ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}

}
