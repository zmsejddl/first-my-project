package section18_스레드.스레드의_사용02;

//Runnable을 상속
class whiteFlag implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("백기 올려");
		}
	}
}

//스레드 메인

public class EX18_03 {

	public static void main(String[] args) {

		//예제 18-3 Runnable을 상속하는 Thread
		
		Thread write = new Thread(new whiteFlag());
		write.start();
		
		/*
		 * 해설
		 * 4: 인터페이스 Runnable을 상속합니다
		 * 7: 인터페이스 메서드인 run()을 구현하고 무한 반복하면서 "백기 올려"를 출력합니다
		 * 22: 인터페이스 Runnable로 상속하여 만든 스레드는 Thread클래스를 선언할 때 객체를 생성자 파라미터로 전달해야 합니다
		 */
	}

}
