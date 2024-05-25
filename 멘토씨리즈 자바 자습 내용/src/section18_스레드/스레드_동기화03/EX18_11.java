package section18_스레드.스레드_동기화03;

class AddThread2 implements Runnable {

	private EX18_10 b;
	private String name;
	public AddThread2(String name, EX18_10 b) {
		this.name = name;
		this.b = b;
	}
	
	@Override
	public void run() {
		synchronized (b) {
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
}
public class EX18_11 {

	public static void main(String[] args) {

		//예제 18-11 스레드를 사용한 입금 <블록 동기화>
		
		EX18_10 b = new EX18_10();
		Thread th1 = new Thread(new AddThread2("1번", b));
		Thread th2 = new Thread(new AddThread2("2번", b));
		th1.start();
		th2.start();
		
		/*
		 * 해설
		 * 14: 스레드 실행 코드를 동기화 합니다. 
		 * 동기화 대상 객체인 EX18_10의 인스턴스를 타겟으로 합니다
		 */
	}

}
