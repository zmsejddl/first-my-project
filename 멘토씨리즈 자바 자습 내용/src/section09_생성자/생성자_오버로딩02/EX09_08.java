package section09_생성자.생성자_오버로딩02;

public class EX09_08 {	//클래스 선언

	public static void main(String[] args) {

		//예제 9-8 매개변수 부족 컴파일 오류
		
		EX09_07 p1 = new EX09_07("갤럭시", 1, "흰색");
		EX09_07 p2 = new EX09_07("아이폰", 2);	//컴파일 오류
		
		/*
		 * TIP
		 * 자바에서 오버로딩은 생성자에 국한되지 않고, 메서드에도 적용된다
		 */
	}

}
