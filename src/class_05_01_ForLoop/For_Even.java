// write a program to print even numbers from 1-50
package class_05_01_ForLoop;

public class For_Even {
	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " Even number");
			}
		}
	}

}
