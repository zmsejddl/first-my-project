package section12_추상_클래스와_인터페이스.추상_클래스와_추상_메서드01;

public class EX12_06 extends EX12_05 {

	//예제 12-6 추상 메서드 오버라이딩 및 재정의
	
	@Override
	void openingLogo() {	//구현하지 않으면 에러 발생
		System.out.println("@@@");
	}

	
}
