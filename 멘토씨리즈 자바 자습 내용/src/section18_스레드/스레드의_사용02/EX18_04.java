package section18_스레드.스레드의_사용02;

public class EX18_04 {

	public static void main(String[] args) {

		//예제 18-4 Runnable을 상속하는 Thread
		
		//Runnable 인터페이스를 익명 객체로 처리
		Runnable white = () -> {
			while(true) {
				System.out.println("백기 올려");
			}
		};
		
		Thread whiteFlag = new Thread(white);
		whiteFlag.start();
	}

}
