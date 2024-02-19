package class33_17_Feb_InnerClass;

public class State {
	String name = "Telangana";
	int population = 6000000;

	public void show() {
		System.out.println("Name:" + name + "  Population:" + population);
	}

	class District {
		String dname = "Hyd";
		int population = 1000000;

		public void printData() {
			System.out.println("District:" + dname + "  population:" + population);
		}
	}

	public static void main(String[] args) {
		State s = new State();
		s.show();
		System.out.println(" ");

		State.District d = s.new District();
		d.printData();

	}

}
