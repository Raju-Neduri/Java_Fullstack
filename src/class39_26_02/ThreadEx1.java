package class39_26_02;

public class ThreadEx1 implements Runnable {
	public void run() {

		System.out.println("thread is Running:" + Thread.currentThread());
	}

	public static void main(String[] args) {
		ThreadEx1 t = new ThreadEx1();
		Thread obj = new Thread(t);
		obj.start();

	}

}
