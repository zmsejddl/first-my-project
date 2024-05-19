package section13_내부_클래스.내부_클래스의_종류02;

class PrintOut {
	
	//정적 내부 클래스 선언
	public static class Out {
		
		public void println(String str) {
			System.out.println(str);
		}
	}
}

public class EX13_02 {

	public static void main(String[] args) {

		//예제 13-2 정적 내부 클래스 선언하기
		
		String str = "정적 내부 클래스 테스트";
		PrintOut.Out out = new PrintOut.Out();
		out.println(str);
		
		/*
		 * 해설
		 * 3: 외부 클래스를 선언합니다
		 * 6: 정적 내부 클래스를 선언합니다
		 * 14: 메인 클래스를 선언합니다
		 * 21: 외부 클래스 없이 정적 클래스 객체를 생성합니다
		 * 22: 정적 내부 클래스 함수를 호출하여 출력합니다
		 */
	}

}
