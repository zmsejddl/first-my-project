package section10_상속.final_클래스와_final_메서드06;

public class EX10_27 {	//클래스 선언

	public static void main(String[] args) {

		//예제 10-27 final 메서드
		
		EX10_26 comicBook = new EX10_26("주머니 괴물", "미상", true);
		comicBook.info_title();
		comicBook.info_author();
		comicBook.info_color();
	}

}
