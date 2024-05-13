package section09_생성자.생성자_오버로딩02;

public class EX09_07 {	//클래스 선언

	//예제 9-7 생성자 매개변수 부족
	
	String brand;
	int series;
	String color = "검정색";	//필드 기본값 초기화
	
	EX09_07(String b, int s, String c) {
		brand = b;
		series = s;
		color = c;
	}
	
	void phoneInfo() {
		System.out.println(color + " " + brand + " " + series);
	}
}
