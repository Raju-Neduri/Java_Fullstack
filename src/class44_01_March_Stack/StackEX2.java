package class44_01_March_Stack;

import java.util.Stack;

public class StackEX2 {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();

		System.out.println(s.empty());
		s.push(10);
		s.push(34);
		s.push(45);
		s.push(100);
		s.push(20);
		System.out.println(s);
		System.out.println(s.empty());

		System.out.println(s.pop()); // removing
		System.out.println(s.peek()); // show top element but doesn't removing.
		System.out.println(s);
		System.out.println(s.search(10));
		System.out.println("Size of the stack:" + s.size());
		System.out.println(s);

	}

}
