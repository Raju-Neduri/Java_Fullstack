package string_Practice;

public class String_LastIndexOF {

	public static void main(String[] args) {

		// Java String lastIndexOf() method example
		String s1 = "this is index of example";// there are 2 's' characters in this sentence
		int index1 = s1.lastIndexOf('s');// returns last index of 's' char value
		System.out.println(index1);// 6

		// Java String lastIndexOf(int ch, int fromIndex) Method Example
		int index = s1.lastIndexOf('s', 5);
		System.out.println(index);// Here, we are finding the last index from the string by specifying fromIndex.

		// Java String lastIndexOf(String substring) Method Example
		int index2 = s1.lastIndexOf("is");
		System.out.println(index2); // It returns the last index of the substring.

		// Java String lastIndexOf(String substring, int fromIndex) Method Example
		String str = "This is last index of example";
		int index3 = str.lastIndexOf("of", 25);
		System.out.println(index3);
		index3 = str.lastIndexOf("of", 10);
		System.out.println(index3); //

	}

}
