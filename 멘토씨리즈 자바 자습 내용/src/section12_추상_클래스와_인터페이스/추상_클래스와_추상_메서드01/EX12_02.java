package section12_추상_클래스와_인터페이스.추상_클래스와_추상_메서드01;

public class EX12_02 extends EX12_01 {

	//예제 12-2 추상 클래스
	
	EX12_02(String chef) {
		super(chef);	//부모 클래스(추상 클래스) 생성자 호출
	}

	void makeSource() {
		System.out.println("파스타 소스를 직접 만듭니다");
	}
}
