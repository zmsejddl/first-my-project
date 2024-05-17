package section12_추상_클래스와_인터페이스.추상_클래스와_추상_메서드01;

public class EX12_04 {

	public static void main(String[] args) {

		//예제 12-4 추상 클래스
		
		//EX12_01 r = new EX12_01(); <- 에러: 추상 클래스는 직접 객체를 생성할 수 없음
		EX12_02 pr = new EX12_02("최연석");
		pr.info();
		pr.makeSource();
		
		System.out.println();
		
		EX12_03 sr = new EX12_03("이현복");
		sr.info();
		sr.grillStake();
		
		/*
		 * TIP
		 * 추상 클래스가 반드시 추상 메서드를 가져야 하는 것은 아닙니다
		 * <EX12_01.java> 코드에서 확인한 추상 클래스를 사용하는 이유는 다음과 같습니다
		 * - 자식 클래스들이 공통으로 가져야 하는 메서드를 가져야 할 때
		 * - 부모 클래스의 객체를 생성할 일이 없을 때
		 */
	}

}
