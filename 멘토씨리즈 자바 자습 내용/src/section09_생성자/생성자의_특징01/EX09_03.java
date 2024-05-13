package section09_생성자.생성자의_특징01;

public class EX09_03 {	//클래스 선언

	//예제 9-3 생성자 추가하고 사용하기
	
	int price;
	
	EX09_03(int p) {	//직접 선언한 생성자
		price = p;	//매개변수로 받은 값을 필드 price에 대입
	}
	
	void info() {
		System.out.println("과자의 가격은 " + price + "원입니다");
	}
}
