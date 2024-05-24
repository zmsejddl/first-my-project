package section18_스레드.스레드의_사용02;

public class EX18_05 {

	public static void main(String[] args) {

		//예제 18-5 멀티 스레드
		
		Runnable blue = () -> {
			while(true) {
				System.out.println("청기 올려");
			}
		};
		
		Runnable white = () -> {
			while(true) {
				System.out.println("백기 올려");
			}
		};
		
		Thread blueFlag = new Thread(blue);
		Thread whiteFlag = new Thread(white);
		
		blueFlag.start();
		whiteFlag.start();
		
		/*
		 * 해설
		 * 21~22: 스레드를 2개 생성합니다
		 * 24~25: 2개의 스레드를 동시에 실행시킵니다
		 */
	}

}
