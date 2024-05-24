package section18_스레드.스레드_동기화03;

class AddThread implements Runnable {
	private EX18_06 b;
	private String name;
	public AddThread(String name, EX18_06 b) {
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
		} catch(Exception e) {
			e.printStackTrace();
		}
	}	
}

public class EX18_07 {

	public static void main(String[] args) {

		//예제 18-7 스레드를 사용한 입금
		
		EX18_06 b = new EX18_06();
		Thread th1 = new Thread(new AddThread("1번", b));
		Thread th2 = new Thread(new AddThread("2번", b));
		th1.start();
		th2.start();
		
		/*
		 * 해설
		 * 3: Runnable 인터페이스를 상속해 스레드를 구현합니다
		 * 4: EX16_06 클래스를 선언합니다
		 * 5: 스레드에 사용할 name 변수를 선언합니다
		 * 6: 생성자를 통해 필요한 데이터를 받습니다
		 * 14: 10번 반복합니다
		 * 15: 스레드를 잠시 중단합니다. (시간 단위는 1/1000초)
		 * 16: 금액을 추가합니다
		 * 17: 입금하기 전, 잔고를 출력합니다
		 * 32~35: 스레드를 생성하여 실행합니다
		 */
	}

}
