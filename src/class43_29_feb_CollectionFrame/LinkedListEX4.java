package class43_29_feb_CollectionFrame;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEX4 {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(80);
		l.add(30);
		l.add(null);
		l.add(220);
		System.out.println("Elements from second list :" + l);

		ListIterator itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
