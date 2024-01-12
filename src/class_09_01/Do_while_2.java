package class_09_01;

public class Do_while_2 {

	public static void main(String[] args) {
		int i = 20;
		do {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 50);
	}

}
