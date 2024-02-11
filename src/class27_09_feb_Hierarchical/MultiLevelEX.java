package class27_09_feb_Hierarchical;

class X {
	public void showX() {
		System.out.println("X Class");
	}

}

class Y extends X {

	public void showY() {
		System.out.println("Y Class");
	}
}

class Z extends Y {

	public void showZ() {
		System.out.println("Z Class");
	}
}

public class MultiLevelEX {

	public static void main(String[] args) {
		Z z = new Z();

		z.showX();
		z.showY();
		z.showZ();

	}

}
