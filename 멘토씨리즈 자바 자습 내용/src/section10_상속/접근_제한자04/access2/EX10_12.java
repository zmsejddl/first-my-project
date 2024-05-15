package section10_상속.접근_제한자04.access2;

import section10_상속.접근_제한자04.access1.EX10_11;	//다른 패키지의 클래스를 사용하기 위한 import

public class EX10_12 {	//클래스 선언

	public static void main(String[] args) {

		//예제 10-12 접근 제한자 public
		
		EX10_11 a = new EX10_11(10);
		a.printA();
		
		/*
		 * TIP
		 * 인터페이스는 무조건 public으로 선언되어야 합니다
		 * 이는 회사, 기관 외뷔에서 내부 데이터와 기능을 사용할 수 있도록 소스 코드를 오픈해 주는 오픈 소스 API와 같은 경우를 생각할 수 있습니다
		 */
	}

}
