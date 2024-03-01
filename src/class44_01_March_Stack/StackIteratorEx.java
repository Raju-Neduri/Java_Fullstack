package class44_01_March_Stack;

import java.util.Iterator;
import java.util.Stack;

public class StackIteratorEx {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("c");
		s.push("Java");
		s.push("C++");
		s.push("Python");

		Iterator itr = s.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
