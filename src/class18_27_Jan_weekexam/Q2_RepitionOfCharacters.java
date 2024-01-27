//Q2.Write a java program to identify the repition of a character from a string :"Bookkeeper"
package class18_27_Jan_weekexam;

public class Q2_RepitionOfCharacters {

	public static void main(String[] args) {
		String s = "Bookkeeper";
		int i, j, count;
		char c;

		for (i = 0; i < s.length(); i++) {
			count = 1;
			if (s.charAt(i) != 'n') {
				for (j = i + 1; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						count++;
						s = s.substring(0, j) + 'n' + s.substring(j + 1);
						// to mark the checked character
					}

				}
				System.out.println("Character:" + s.charAt(i) + " count=" + count);

			}
		}
	}

}
