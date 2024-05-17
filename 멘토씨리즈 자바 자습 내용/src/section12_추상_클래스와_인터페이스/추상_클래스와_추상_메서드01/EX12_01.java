package section12_추상_클래스와_인터페이스.추상_클래스와_추상_메서드01;

public abstract class EX12_01 {

	//예제 12-1 추상 클래스
	
	String chef;
	
	EX12_01(String chef) {
		this.chef = chef;
	}
	
	void info() {
		System.out.println("이 레시피는 " + chef + " 셰프님의 레시피입니다");
	}
}
