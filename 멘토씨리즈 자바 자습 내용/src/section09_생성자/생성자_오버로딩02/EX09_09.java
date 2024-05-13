package section09_생성자.생성자_오버로딩02;

public class EX09_09 {

	//예제 9-9 생성자 추가
	
	String brand;
	int series;
	String color = "검정색";	//필드 기본값 초기화
	
	EX09_09(String b, int s) {	//매개변수를 2개 받는 생성자
		brand = b;
		series = s;
	}
	
	EX09_09(String b, int s, String c) {	//매개변수를 3개 받는 생성자
		brand = b;
		series = s;
		color = c;
	}
	
	void phoneInfo() {
		System.out.println(color + " " + brand + " " + series);
	}
	
}
