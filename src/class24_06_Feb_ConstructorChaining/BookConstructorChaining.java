/*
 * * Question: Constructor Chaining in a Simple Class**
   - Create a class `Book` with attributes `title`, `author`, and `pages`. 
   Implement constructor chaining with a default constructor initializing `
   title` as "Unknown", `author` as "Anonymous", and `pages` as 0. 
   Another constructor should allow setting the `title` and `author`,
    and a third constructor should allow setting all attributes.
 */
package class24_06_Feb_ConstructorChaining;

class Book {
	String title;
	String author;
	int pages;

	public Book() {
		this.title = "unknown";
		this.author = "Anonymous";
		this.pages = 0;
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public Book(String title, String author, int pages) {
		this(title, author);
		this.pages = pages;
	}

	public void show() {
		System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
		System.out.println();
	}
}

public class BookConstructorChaining {
	public static void main(String[] args) {
		Book b = new Book();
		Book b1 = new Book("Atomic habits", "James Clear");
		Book b2 = new Book("Atomic habits", "James Clear", 157);

		b.show();
		b1.show();
		b2.show();
	}
}
