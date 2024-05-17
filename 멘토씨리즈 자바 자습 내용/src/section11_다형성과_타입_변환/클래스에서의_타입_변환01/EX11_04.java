package section11_다형성과_타입_변환.클래스에서의_타입_변환01;

public class EX11_04 extends EX11_03 {

	//예제 11-4 클래스의 자동 타입 변환 3
	
	EX11_04(String color, int months) {
		super(color, months);
	}

	@Override
	void hanging() {
		System.out.println(color + " 달력을 벽에 걸기 위해 고리가 추가로 필요합니다");
	}

	void onTheDesk() {
		System.out.println(color + " 달력을 책상에 세울 수 있습니다");
	}
}
