package string_Practice;

public class Learncoding_StingEX {

	public static void main(String[] args) {
		String a = "RAJU";
		String b = "ramu";

		System.out.println(a.toLowerCase());// lowercase
		System.out.println(b.toUpperCase());// Upper case

		System.out.println(b.concat(a));// Concat
		System.out.println(b.length());// to find length

		String c = "    Vaishu   ";
		System.out.println("\nTrim");
		System.out.println(c.trim());// to trim the extra spaces

		String d = "";
		System.out.println("\nisEmpty");
		System.out.println(d.isEmpty()); // to find is it empty

		System.out.println("\nCharAt");
		System.out.println(a.charAt(2));

		System.out.println(b.indexOf('u'));
		System.out.println(b.replace('u', 'a'));

	}

}
