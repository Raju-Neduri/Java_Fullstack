package class39_26_02;

public class ThreadEx4 extends Thread {
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

		t1.start();
		t2.start();
		t3.start();
	}

}
