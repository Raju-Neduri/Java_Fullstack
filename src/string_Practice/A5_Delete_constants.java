//Assignment 5 - Write a java program to delete all constants from  the string "Hello, have a good day".
package string_Practice;

public class A5_Delete_constants {

	public static void main(String[] args) {
		String s = "Hello, have a good day";
		String s1 = s.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "");
		System.out.println(s1);

	}

}
