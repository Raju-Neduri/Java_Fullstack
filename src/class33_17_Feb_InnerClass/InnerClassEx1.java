package class33_17_Feb_InnerClass;

public class InnerClassEx1 {
	int id = 1;
	String name = "Raju";

	public void show() {
		System.out.println("ID :" + id + "\nName:" + name);
	}

	class Inner {
		int id = 100;
		String name = "vaishu";

		public void show() {
			System.out.println("ID :" + id + "\nName:" + name);
		}

	}

	public static void main(String[] args) {
		InnerClassEx1 t = new InnerClassEx1();
		System.out.println("Outer class  values " + t.id + " " + t.name);
		t.show();
		System.out.println(" ");

		InnerClassEx1.Inner obj = t.new Inner();
		System.out.println("inner class " + obj.id + " " + obj.name);
		obj.show();

	}
}
