/*
 * Write a java program using Varargs and 
 * count the number of parameter  in the calling method
 */
package class25_07_feb_Polymorphism;

public class CountVarargs {

	public void show(int... i) {
		int count = 0;
		for (int a : i) {
			count++;
		}
		System.out.println("count:" + count);

	}

	public static void main(String[] args) {
		CountVarargs v = new CountVarargs();
		v.show(10);
		System.out.println(" ");
		v.show(10, 22);
		System.out.println(" ");
		v.show(10, 22, 12, 33, 4, 444, 49949);
		System.out.println(" ");
	}

}
