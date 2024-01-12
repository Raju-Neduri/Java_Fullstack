package star_Programs;

import java.util.Scanner;

public class Reverse_Right_Half_Pyramid {

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no .of lines ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = i; j <= num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
