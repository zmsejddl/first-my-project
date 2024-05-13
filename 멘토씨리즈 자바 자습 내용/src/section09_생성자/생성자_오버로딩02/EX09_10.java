package section09_생성자.생성자_오버로딩02;

public class EX09_10 {	//클래스 선언

	public static void main(String[] args) {

		//예제 9-10 생성자 추가
		
		EX09_09 p1 = new EX09_09("갤럭시", 1, "흰색");
		EX09_09 p2 = new EX09_09("아이폰", 2);
		
		p1.phoneInfo();
		p2.phoneInfo();
	}

}
