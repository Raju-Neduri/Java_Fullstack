package Class37_22_feb_TrywithRes;

public class ThrowsException {
	public void divison(int num) throws ArithmeticException {
		int res = num / 0;
		System.out.println(res);
	}

	public static void main(String[] args) {
		ThrowsException t = new ThrowsException();
		try {
			t.divison(10);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

}
