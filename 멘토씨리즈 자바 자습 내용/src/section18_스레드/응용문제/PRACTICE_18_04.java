package section18_스레드.응용문제;

class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + "초");
		}
	}
}
public class PRACTICE_18_04 {

	public static void main(String[] args) {

		Thread myRunnable = new Thread(new MyRunnable());
		myRunnable.start();
	}

}
