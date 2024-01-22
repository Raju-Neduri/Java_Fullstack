package class_22_01_String2;

public class StringEX1 {

	public static void main(String[] args) {
		String str = new String("Welcome to Ashok IT");
		String str1 = new String("Welcome to Ashok IT");
		System.out.println(str = str1);

		String s = new String("welcome to hyd").intern();
		String s1 = new String("welcome to hyd").intern();
		System.out.println(s == s1);
	}

}
