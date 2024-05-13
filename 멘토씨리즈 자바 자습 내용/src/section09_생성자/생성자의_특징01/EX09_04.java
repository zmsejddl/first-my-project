package section09_생성자.생성자의_특징01;

public class EX09_04 {	//클래스 선언

	public static void main(String[] args) {

		//예제 9-4 생성자 추가하고 사용하기
		
		EX09_03 chip = new EX09_03(5000);	//객체 생성 및 필드 초기화
		chip.info();	//객체 메서드 호출
	}

}
