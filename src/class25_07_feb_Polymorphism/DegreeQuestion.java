package class25_07_feb_Polymorphism;

class Degree {

	public void getDegree() {
		System.out.println("I got a degree");
	}

}

class Undergraduate extends Degree {
	public void getDegree() {
		System.out.println("I am undergraduate");

	}
}

class Postgraduate extends Degree {
	public void getDegree() {
		System.out.println("I am Postgraduate");

	}
}

public class DegreeQuestion {

	public static void main(String[] args) {
		Degree d1 = new Degree();
		Degree d2 = new Degree();
		Degree d3 = new Degree();

		d1.getDegree();
		d2.getDegree();
		d3.getDegree();

	}

}
