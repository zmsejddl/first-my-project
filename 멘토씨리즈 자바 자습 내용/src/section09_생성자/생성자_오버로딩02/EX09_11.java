package section09_생성자.생성자_오버로딩02;

public class EX09_11 {	//클래스 선언

	//예제 9-11 오버로딩
	
	String title = "제목없음";
	int series = 1;
	int page = 100;
	
	EX09_11() {	//<- 생성자 1
		
	}
	
	EX09_11(String t) {	//<- 생성자 2
		title = t;
	}
	
	EX09_11(String t, int p) {	//<- 생성자 3
		title = t;
		page = p;
	}
	
	EX09_11(int s, String t) {	//<- 생성자 4
		series = s;
		title = t;
	}
	
	
}
