package Class37_22_feb_TrywithRes;

public class NullException1 {
	public void NullEx(String s) throws NullPointerException {

		System.out.println(s.length());

	}

	public static void main(String[] args) {
		NullException1 n = new NullException1();
		try {
			n.NullEx(null);

		} catch (NullPointerException e) {
			System.out.println(e);
		}

	}

}
