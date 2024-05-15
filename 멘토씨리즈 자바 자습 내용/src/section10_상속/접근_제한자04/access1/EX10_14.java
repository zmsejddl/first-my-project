package section10_상속.접근_제한자04.access1;

public class EX10_14 {	//클래스 선언

	//예제 10-14 접근 제한자 default
	
	EX10_13 dc = new EX10_13();	//같은 패키지이기 때문에 객체 생성 가능
	void methodA() {
		dc.variableC = 20;	//public으로 선언된 필드도 객체를 통해 접근 가능
	}
}
