package class35_20_feb_WrapperClass;

public class AllDataTypes {

	public static void main(String[] args) {
		int i = 42;
		Integer i1 = i;
		System.out.println("Original " + i);
		System.out.println("Auto Boxing " + i1);

		double d = 3.14;
		Double d1 = d;
		System.out.println("Original " + d);
		System.out.println("Auto Boxing " + d1);

		char c = 'A';
		Character c1 = c;
		System.out.println("Original " + c);
		System.out.println("Auto Boxing " + c1);

		boolean b = true;
		Boolean b1 = b;
		System.out.println("Original " + b);
		System.out.println("Auto Boxing " + b1);
		System.out.println(" ");

		// unboxing

		Integer ib = new Integer(46);
		int x = ib;

		System.out.println("object:" + ib);
		System.out.println("Primitive data type:" + x);

		Double db = new Double(3.24);
		double y = db;
		System.out.println("object:" + db);
		System.out.println("Primitive data type:" + y);

	}

}
