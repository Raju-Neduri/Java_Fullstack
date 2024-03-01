package class44_01_March_Stack;

import java.util.Stack;

public class Stackexample {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();

		System.out.println(s.empty());
		s.push(10);
		s.push(34);
		s.push(45);
		s.push(100);
		System.out.println(s);
		System.out.println(s.empty());
	}

}
