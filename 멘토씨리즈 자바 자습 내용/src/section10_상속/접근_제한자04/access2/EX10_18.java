package section10_상속.접근_제한자04.access2;

import section10_상속.접근_제한자04.access1.*;

public class EX10_18 {	//클래스 선언

	//예제 10_18 접근 제한자 protected
	
	void accessTest() {
		EX10_16 p2 = new EX10_16();
		//p2.accessProtected(); 에러
	}
}
