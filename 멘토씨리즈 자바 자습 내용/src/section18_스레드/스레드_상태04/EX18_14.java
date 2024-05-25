package section18_스레드.스레드_상태04;

class AddStackThread extends Thread {
	private EX18_13 storage;
	
	public AddStackThread(EX18_13 storage) {
		this.storage = storage;
	}

	@Override
	public void run() {
		
		//1개씩 넣기
		try {
			while(true) {
				Thread.sleep(1000);
				if(this.storage.getStackCount() == 0) {
					System.out.println("짐 10개 추가");
					this.storage.addStack(10);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class PopStackThread extends Thread {
	private EX18_13 storage;
	public PopStackThread(EX18_13 storage) {
		this.storage = storage;
	}
	
	//1개씩 나르기
	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(1000);
				System.out.println("짐 5개 나르기");
				this.storage.popStack(5);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class EX18_14 {

	public static void main(String[] args) {

		//예제 18-14 저장 클래스 구현
		
		EX18_13 s = new EX18_13();
		AddStackThread add = new AddStackThread(s);
		PopStackThread pop = new PopStackThread(s);
		
		add.start();
		pop.start();
		
		/*
		 * 해설
		 * 3: 짐을 쌓는 스레드를 생성합니다
		 * 16: 스레드 속도를 위해서 1초 지연합니다
		 * 17~20: 짐이 0개일 때 10개를 채웁니다
		 * 28: 짐을 치우는 스레드를 생성합니다
		 * 39: 스레드 속도를 위해서 1초 지연합니다
		 * 41: 짐을 5개씩 나릅니다
		 */
	}

}
