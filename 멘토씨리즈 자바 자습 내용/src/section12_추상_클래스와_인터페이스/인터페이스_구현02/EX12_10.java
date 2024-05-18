package section12_추상_클래스와_인터페이스.인터페이스_구현02;

public interface EX12_10 {

	//예제 12-10 상수 추가
	
	public static final int MAX_BATTERY_CAPACITY = 100;
	
	abstract void powerOn();	//<- 공통 구현부가 사라짐
	abstract void powerOff();	//<- 공통 구현부가 사라짐
	abstract boolean isOn();	//새로운 메서드 추가
	abstract void watchUtube();	//새로운 메서드 추가
	abstract void charge();	//새로운 메서드 추가
	/*
	 * TIP
	 * 메서드에 public을 명시하지 않아도 자동으로 public이 붙는 것처럼, 
	 * 상수 역시 public static final을 명시하지 않아도 자동으로 작성됩니다
	 */
}
