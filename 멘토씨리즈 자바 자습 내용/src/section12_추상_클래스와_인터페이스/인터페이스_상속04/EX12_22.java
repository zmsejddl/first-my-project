package section12_추상_클래스와_인터페이스.인터페이스_상속04;

public class EX12_22 implements EX12_21 {

	//예제 12-22 인터페이스 상속
	
	@Override
	public void sing() {	//EX12_19 인터페이스의 추상 메서드
		System.out.println("마이크에 대고 노래를 부릅니다");
	}

	@Override
	public void music() {	//EX12_20 인터페이스의 추상 메서드
		System.out.println("마이크에 장착된 스피커로 반주가 나옵니다");
	}

	@Override
	public void connect() {	//EX12_21 인터페이스의 추상 메서드
		System.out.println("핸드폰과 블루투스 연결이 되었습니다");
	}

}
