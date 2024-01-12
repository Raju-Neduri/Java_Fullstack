package star_Programs;

import java.util.Scanner;

public class Square_fill {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no .of lines ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
