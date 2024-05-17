package section12_추상_클래스와_인터페이스.추상_클래스와_추상_메서드01;

public class EX12_03 extends EX12_01 {

	//예제 12-3 추상 클래스
	
	EX12_03(String chef) {
		super(chef);
	}

	void grillStake() {
		System.out.println("스테이크를 맛있게 굽습니다");
	}
}
