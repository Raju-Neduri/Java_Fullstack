package class34_19_Feb;

interface Drawable {
	public abstract void draw();

}

public class Annonymous2 {

	public static void main(String[] args) {
		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Drawing circle");
			}
		};
	}

}
