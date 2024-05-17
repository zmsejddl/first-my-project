package section11_다형성과_타입_변환.다형성02;

public class EX11_10 extends EX11_09 {
	
	//예제 11-10 객체를 만들어줄 클래스

	@Override
	void powerOn() {
		super.powerOn();
		System.out.println("아이 러브 삼송");
	}
}
