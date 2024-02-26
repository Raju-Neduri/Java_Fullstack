package class39_26_02;

public class ThreadEx2 implements Runnable {
	public void run() {
		System.out.println("My thread is running" + Thread.currentThread());
	}

	public static void main(String[] args) {
		Runnable r = new ThreadEx2();
		Thread t = new Thread(r, "Thread one");
		t.start();
		System.out.println(t.getName());

	}

}
