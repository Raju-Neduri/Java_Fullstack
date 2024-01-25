package class_25_01_ObjectsAndClass;

public class Example2 {
	String name;
	int price;
	boolean available;

	public static void main(String[] args) {
		Example2 fruit1 = new Example2();
		fruit1.name = "mango";
		fruit1.price = 100;
		fruit1.available = false;

		Example2 fruit2 = new Example2();
		fruit2.name = "Strawberry";
		fruit2.price = 150;
		fruit2.available = true;

		Example2 fruit3 = new Example2();
		fruit3.name = "grape";
		fruit3.price = 50;
		fruit3.available = true;

		System.out.println("Fruit 1");
		System.out.println(fruit1.name);
		System.out.println(fruit1.price);
		System.out.println("Available= " + fruit1.available);

		System.out.println("\nFruit 2");
		System.out.println(fruit2.name);
		System.out.println(fruit2.price);
		System.out.println("Available= " + fruit2.available);

		System.out.println("\nFruit 3");
		System.out.println(fruit3.name);
		System.out.println(fruit3.price);
		System.out.println("Available= " + fruit3.available);
	}

}
