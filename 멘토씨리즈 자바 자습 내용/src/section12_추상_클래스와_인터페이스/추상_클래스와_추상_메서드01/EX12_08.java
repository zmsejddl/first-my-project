package section12_추상_클래스와_인터페이스.추상_클래스와_추상_메서드01;

public class EX12_08 {

	public static void main(String[] args) {

		//예제 12-8 추상 메서드 오버라이딩 및 재정의
		
		//EX12_05 p = new EX12_05(); <- 에러: 추상 클래스는 직접 객체를 생성할 수 없음
		
		EX12_06 pp = new EX12_06();
		pp.powerOn();
		pp.powerOff();
		
		System.out.println();
		
		EX12_05 tp = new EX12_07();
		tp.powerOn();
		tp.powerOff();
		
		/*
		 * 해설
		 * 12: 자식 객체를 통해 추상 클래스의 일반 메서드를 호출할 수 있습니다
		 * 17: 추상 클래스로 자동 타입 변환도 가능합니다
		 */
	}

}
