package section09_생성자.생성자의_특징01;

public class EX09_02 {	//클래스 선언

	public static void main(String[] args) {

		//예제 9-2 생성자
		
		EX09_01 chip = new EX09_01();	//객체 생성 및 초기화
		chip.price = 2000;	//객체 필드 설정
		chip.info();	//객체 메서드 호출
	}

}
