package section10_상속.접근_제한자04.access2;

import section10_상속.접근_제한자04.access1.*;	//access1 패키지의 모든 클래스를 사용하기 위한 import

public class EX10_15 {	//클래스 선언

	public static void main(String[] args) {

		//예제 10-15 접근 제한자 default
		
		EX10_13 c = new EX10_13();	
		//c.varialeC = 10; <- 필드가 public이더라도 객체를 생성하지 못하기 때문에
		//사용할 수 없습니다
	}

}
