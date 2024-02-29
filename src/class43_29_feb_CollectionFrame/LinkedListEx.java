package class43_29_feb_CollectionFrame;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList ls = new LinkedList();

		ls.add(89);
		ls.add(6.8);
		ls.add("Raj");
		ls.add('c');
		System.out.println("Non generic linkedlist" + ls);

		// Generic
		LinkedList<String> l = new LinkedList();
		l.add("Raju");
		l.add("Vaishu");

		System.out.println("Generic " + l);

	}

}
