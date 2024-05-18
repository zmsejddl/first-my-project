package section12_추상_클래스와_인터페이스.인터페이스_사용03;

public class EX12_18 {

	public static void main(String[] args) {

		//예제 12-18 다중 인터페이스
		
		EX12_17 bm = new EX12_17();
		
		bm.music();
		bm.sing();
		EX12_15 m = bm;
		EX12_16 s = bm;
	}

}
