package class34_19_Feb;

interface Data {
	void getData();
}

public class AnnoumousInnerQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data d = new Data() {
			public void getData() {
				System.out.println("get Data is calling");

			}
		};
		d.getData();

	}

}
