package section18_스레드.스레드_동기화03;

class AddThread1 implements Runnable {

	private EX18_08 b;
	private String name;
	public AddThread1(String name, EX18_08 b) {
		this.name = name;
		this.b = b;
	}
	
	@Override
	public void run() {
		try {
			for(int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				b.addMoney(1000);
				System.out.println(this.name + " 현재 잔고: " + b.getMoney());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class EX18_09 {

	public static void main(String[] args) {

		//예제 18-9 스레드를 사용한 입금 <메서드 동기화>
		
		EX18_08 b = new EX18_08();
		Thread th1 = new Thread(new AddThread1("1번", b));
		Thread th2 = new Thread(new AddThread1("2번", b));
		th1.start();
		th2.start();
	}

}
