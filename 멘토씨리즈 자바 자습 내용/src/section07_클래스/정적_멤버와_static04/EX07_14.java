package section07_클래스.정적_멤버와_static04;

public class EX07_14 {	//클래스 선언

	//예제 7-14 인스턴스
	
	static String schoolName = "코리아 고등하교";	//정적 필드 선언
	String studentName;	//인스턴스 필드 선언
	
	static void goToSchool() {	//정적 메서드 선언
		System.out.println("오늘은 학교에 가는 날입니다");
	}
	
	void hello() {	//인스턴스 메서드 선언
		System.out.println("안녕하세요, 제 이름은 " + studentName + "입니다");
	}
}
