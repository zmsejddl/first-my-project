package section18_스레드.프로세스와_스레드01;

public class EX18_01 {

	public static void main(String[] args) {

		//예제 18-1 스레드 기본 예제
		
		String threadName = Thread.currentThread().getName();
		System.out.println("현재 스레드 이름: " + threadName);
		
		/*
		 * 해설
		 * 9: 현재 실행 중인 스레드의 이름을 반환합니다
		 * 10: 스레드 이름을 출력합니다
		 */
		
		/*
		 * TIP
		 * 프로그램: 프로그래밍 코드의 집합체를 의미합니다
		 * 프로세스: 프로그램의 한 단위를 말하며 실행 중인 프로그램으로 메모리에 독립적으로 저장되어 실행됩니다
		 * 스레드: 프로그램 내에서 동작하는 작업 단위를 말하며 스레드를 통해 동시에 여러가지 작업을 할 수 있습니다
		 */
	}

}
