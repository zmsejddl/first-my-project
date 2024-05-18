package section12_추상_클래스와_인터페이스.인터페이스_구현02;

public interface EX12_09 {

	//예제 12-9 인터페이스 선언
	
	abstract void openingLogo();
	abstract void powerOn();	//<- 공통 구현부가 사라짐
	abstract void powerOff();	//<- 공통 구현부가 사라짐
	abstract void charge();	//새로운 메서드 추가
	
	/*
	 * TIP
	 * interface 안에서 abstract 키워드는 생략할 수 있습니다
	 * interface라는 뜻이 내부 모든 메서드가 abstract라는 의미를 내포하고 있기 때문입니다
	 */
}
