package class39_26_02;

public class ThreadJoin extends thread {

	public void run() {
		System.out.println("Thread Running: " + Thread.currentThread());
		for (int i = 1; i <= 3; i++) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		ThreadEx4 t1 = new ThreadEx4();
		ThreadEx4 t2 = new ThreadEx4();
		ThreadEx4 t3 = new ThreadEx4();

		t1.setName("one");
		t2.setName("two");
		t3.setName("Three");

		t1.setPriority(8);
		t2.setPriority(7);
		t3.setPriority(3);
		t1.start();
		t2.start();
		t3.start();
	}

}
