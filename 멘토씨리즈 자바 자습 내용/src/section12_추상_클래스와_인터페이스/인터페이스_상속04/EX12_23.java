package section12_추상_클래스와_인터페이스.인터페이스_상속04;

public class EX12_23 {

	public static void main(String[] args) {

		//예제 12-23 인터페이스 상속
		
		System.out.println("---EX12_22 객체---");
		EX12_22 tj = new EX12_22();
		tj.connect();
		tj.music();
		tj.sing();
		
		System.out.println("\n---EX12_22 객체를 EX12_21로 타입 변환---");
		EX12_21 bm = tj;
		bm.connect();
		bm.music();
		bm.sing();
		
		System.out.println("\n---EX12_22 객체를 EX12_19로 타입 변환---");
		EX12_19 m = tj;
		//m.connect(); <- 호출 불가능
		//m.music(); <- 호출 불가능
		m.sing();
		
		System.out.println("\n---EX12_22 객체를 EX12_20으로 타입 변환---");
		EX12_20 s = tj;
		//s.connect(); <- 호출 불가능
		s.music();
		//s.sing(); <- 호출 불가능
	}

}
