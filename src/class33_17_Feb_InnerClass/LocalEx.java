package class33_17_Feb_InnerClass;

public class LocalEx {
	String name = "Telangana";
	int population = 6000000;

	public void show() {
		System.out.println("Name:" + name + "  Population:" + population);
	}

	class District {
		String dname = "Hyd";
		int population = 1000000;

		public void printData() {
			show();

			System.out.println("District:" + dname + "  population:" + population);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
