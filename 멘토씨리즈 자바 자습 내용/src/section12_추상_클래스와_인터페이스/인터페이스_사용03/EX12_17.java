package section12_추상_클래스와_인터페이스.인터페이스_사용03;

public class EX12_17 implements EX12_15, EX12_16 {

	//예제 12-17 다중 인터페이스
	
	@Override
	public void music() {
		System.out.println("마이크에 대고 노래를 부릅니다");
	}

	@Override
	public void sing() {
		System.out.println("마이크에 장착된 스피커로 반주가 나옵니다");
	}

	
}
