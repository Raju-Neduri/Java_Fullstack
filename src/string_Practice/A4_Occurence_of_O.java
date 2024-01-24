//Assignent 4 write a java program to find the first and last occurrence of the letter 'o' in the string "hello,world"
package string_Practice;

public class A4_Occurence_of_O {

	public static void main(String[] args) {
		String s = "Hello, world";
		int n1 = s.indexOf('o');
		int n2 = s.lastIndexOf('o');
		System.out.println("First occurence= " + n1);
		System.out.println("Last occurence= " + n2);

	}

}
