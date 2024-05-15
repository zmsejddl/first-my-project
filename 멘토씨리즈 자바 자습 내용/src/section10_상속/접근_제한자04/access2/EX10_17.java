package section10_상속.접근_제한자04.access2;

import section10_상속.접근_제한자04.access1.*;

public class EX10_17 extends EX10_16 {	//클래스 선언

	//예제 10-17 접근 제한자 protected
	
	void accessTest() {
		super.accessProtected();	//이렇게 접근이 가능합니다
		EX10_16 p1 = new EX10_16();
		//p1.accessProtected(); <- 자식 클래스더라도, 객체로 접근하는 것은 불가능합니다
	}
}
