package logical_Programs;

import java.util.Scanner;

public class P9_MultiplicationOfTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int i, j, res;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= 10; j++) {
				res = i * j;
				System.out.println(i + "x" + j + "=" + res+"\t");
			}
			System.out.println();
		}
	}

}
