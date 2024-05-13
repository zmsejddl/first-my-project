package section09_생성자.생성자의_특징01;

public class EX09_06 {	//클래스 선언

	public static void main(String[] args) {

		//예제 9-6 매개변수 2개로 객체 생성하기
		
		EX09_05 p1 = new EX09_05("김자바", 20);
		EX09_05 p2 = new EX09_05("이코딩", 40);
		
		p1.introduce();
		p2.introduce();
	}

}
