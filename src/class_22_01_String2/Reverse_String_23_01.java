package class_22_01_String2;

public class Reverse_String_23_01 {

	public static void main(String[] args) {
		String str = "Raju Neduri";
		String s = "";
		int i, len;
		len = str.length();

		for (i = len - 1; i >= 0; i--) {
			s = s + str.charAt(i);

		}
		System.out.println("original order = " + str);
		System.out.println("Reversed Order = " + s);
	}

}
