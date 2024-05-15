package section10_상속.final_클래스와_final_메서드06;

public class EX10_26 extends EX10_25 {	//EX10_25 클래스를 상속받는 자식 클래스 EX10_26

	//예제 10-26 final 메서드
	
	boolean isColor;
	
	EX10_26(String title, String author, boolean isColor) {
		super(title, author);
		this.isColor = isColor;
	}

	/*
	 * @Override
	void info_title() {	//부모 클래스에서 final로 선언된 메서드를 오버라이딩 시도하면
							에러가 발생합니다
		System.out.println("이 만화책의 제목은 " + title + "입니다.");
	}
	 */
	
	@Override
	void info_author() {	//이 메서드는 Override가 가능합니다
		System.out.println("이 만화책의 저자는 " + author + "입니다.");
	}
	
	void info_color() {
		if(isColor) {
			System.out.println("이 만화책은 컬러입니다");
		} else {
			System.out.println("이 만화책은 흑백입니다");
		}
	}

}
