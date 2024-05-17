package section11_다형성과_타입_변환.클래스에서의_타입_변환01;

public class EX11_05 {

	public static void main(String[] args) {

		//예제 11-5 클래스의 자동 타입 변환 3
		
		EX11_04 dc = new EX11_04("보라색", 6);
		dc.info();
		dc.hanging();
		dc.onTheDesk();
		
		System.out.println();
		
		EX11_03 c = new EX11_04("검은색", 12);
		c.info();
		c.hanging();	//오버라이드한 메서드를 호출합니다
		//c.onTheDesk(); <- 에러
	}

}
