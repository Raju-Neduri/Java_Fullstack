package string_Practice;

public class String_IndexOF {

	public static void main(String[] args) {
		String s = "India is my my country";
		int x = s.indexOf("is");
		System.out.println(x);

		int x1 = s.indexOf("country");
		System.out.println(x1);

		int x2 = s.indexOf("i", 4);// first 4char not included
		System.out.println(x2);

		int x3 = s.indexOf('o');
		System.out.println(x3);

		int x4 = s.indexOf("my", 10);
		System.out.println(x4);

	}

}
