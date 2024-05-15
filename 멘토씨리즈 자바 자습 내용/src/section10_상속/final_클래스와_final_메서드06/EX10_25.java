package section10_상속.final_클래스와_final_메서드06;

public class EX10_25 {	//클래스 선언

	//예제 10-25 final 메서드
	
	String title;
	String author;
	
	EX10_25(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	final void info_title() {
		System.out.println("책의 제목은 " + title + "입니다.");
	}
	
	void info_author() {
		System.out.println("책의 저자는 " + author + "입니다");
	}
}
