//single try with multiple catch block

package class36_21_Feb_ExceptionHandling;

public class Example3 {

	public static void main(String[] args) {
		int a[] = new int[7];
		try {
			a[7] = 100;

		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (NullPointerException e1) {
			System.out.println(e1);
		} catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println(e2);
		} catch (Exception e) {
			System.out.println(e);

		}
	}

}
