//Q5.write a java program to find substring of given string.
//(Welcome to AshokIT!!) , Find AshokIT
package class18_27_Jan_weekexam;

public class Q5_FindSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to AshokIT!!";
		String s2 = "AshokIT";
		int index = s.indexOf(s2);

		if (index != -1) {
			System.out.println(s2 + " found at index: " + index);
		} else {
			System.out.println("Substring not found in the main string.");
		}

	}

}
