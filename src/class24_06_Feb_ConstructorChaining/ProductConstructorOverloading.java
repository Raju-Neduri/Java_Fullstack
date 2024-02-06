/*
 * Question: Handling Different Data Types
Create a class Product with attributes productName, price, and quantity.
 Implement constructor overloading with a default constructor initializing productName 
 as "Unknown", price as 0.0, and quantity as 0; a constructor with productName and price; 
 and a constructor with all attributes.
 */

package class24_06_Feb_ConstructorChaining;

class Product {
	String productName;
	float price;
	int quantity;

	public Product() {
		this.productName = "Unknown";
		this.price = 0.0f;
		this.quantity = 0;

	}

	public Product(String productName, float price) {
		this.productName = productName;
		this.price = price;

	}

	public Product(String productName, float price, int quantity) {
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;

	}

	public void productdetails() {
		System.out.println("\nProduct Name:" + productName);
		System.out.println("Price: Rs." + price);
		System.out.println("Quantity:" + quantity + "kgs");

	}

}

public class ProductConstructorOverloading {

	public static void main(String[] args) {
		Product p = new Product();
		Product p1 = new Product("Rice", 80f);
		Product p2 = new Product("Wheat", 50, 100);
		p.productdetails();
		p1.productdetails();
		p2.productdetails();

	}

}
