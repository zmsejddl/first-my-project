package section12_추상_클래스와_인터페이스.추상_클래스와_추상_메서드01;

public abstract class EX12_05 {

	//예제 12-5 추상 메서드 오버라이딩 및 재정의
	
	abstract void openingLogo();
	
	void powerOn() {
		openingLogo();	//자식 클래스들이 구현한 오버라이딩 메서드가 호출됨
		System.out.println("핸드폰이 켜집니다");
	}
	
	void powerOff() {
		System.out.println("핸드폰이 꺼집니다");
	}
}
