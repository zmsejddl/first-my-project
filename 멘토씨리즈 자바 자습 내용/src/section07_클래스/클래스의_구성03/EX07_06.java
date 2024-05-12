package section07_클래스.클래스의_구성03;

public class EX07_06 {	//클래스 선언

	public static void main(String[] args) {

		//예제 7-6 필드 사용
		
		EX07_05 c = new EX07_05();	//클래스를 이용해서 객체 생성
		System.out.println("wheel의 개수는 " + c.wheel + "개입니다");	//필드 값 출력
		
		c.wheel = 5;	//c 객체의 데이터인 wheel의 값을 5로 변경
		System.out.println("wheel의 개수는 " + c.wheel + "개입니다");
	}

}
