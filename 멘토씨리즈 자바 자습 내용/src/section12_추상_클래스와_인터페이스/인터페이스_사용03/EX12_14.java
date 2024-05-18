package section12_추상_클래스와_인터페이스.인터페이스_사용03;

public class EX12_14 {

	public static void main(String[] args) {

		//예제 12-14 다형성
		
		EX12_13 jimin = new EX12_13(new EX12_11());
		jimin.turnOnPhone();
		for(int i = 1; i < 6; i++) {
			jimin.watchUtube();
			
			if(i % 3 == 0) {
				jimin.chargePhone();
			}
		}
		
		jimin.buyNewPhone(new EX12_12());
		jimin.turnOnPhone();
		
		for(int i = 1; i < 5; i++) {
			jimin.watchUtube();
			
			if(i % 3 == 0) {
				jimin.chargePhone();
			}
		}
	}

}
