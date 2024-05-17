package section11_다형성과_타입_변환.클래스에서의_타입_변환01;

public class EX11_08 {

	public static void main(String[] args) {

		//예제 11-8 강제 형 변환 3
		
		EX11_06 b = new EX11_07("윤기");
		b.info();
		b.ride();
		//b.addWheel(); <- 부모 타입으로는 호출 불가
		
		System.out.println();
		
		EX11_07 fwb = (EX11_07) b;	//강제 타입 변환
		fwb.addWheel();	//자식 메서드 사용 가능
		fwb.info();
		fwb.ride();
	}

}
