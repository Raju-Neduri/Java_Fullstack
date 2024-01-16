//Wap to print the multiplication of a number
package logical_Programs;

import java.util.Scanner;

public class P8_Muliplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res;
		for (int i = 1; i <= 10; i++) {
			res = n * i;
			System.out.println(n + "x" + i + "=" + res);
		}
		sc.close();
	}

}
