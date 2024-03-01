package class43_29_feb_CollectionFrame;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList<Double> ar = new ArrayList<Double>();
		ar.add(50.4);
		ar.add(5.86);
		ar.add(5.8);
		ar.add(9.8);
		ar.add(2.3);
		System.out.println(ar);

		for (Double d : ar) {
			System.out.println(d);
		}
		System.out.println("==============");

		Iterator itr = ar.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
