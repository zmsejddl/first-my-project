package section10_상속.오버라이딩03;

public class EX10_10 extends EX10_07 {	//클래스 선언

	//예제 10-10 super
	
	@Override
	void powerOn() {
		super.powerOn();	//부모 클래스(EX10_07)의 powerOn() 메서드 호출
		System.out.println("아이 러브 삼송");
	}

	
}
