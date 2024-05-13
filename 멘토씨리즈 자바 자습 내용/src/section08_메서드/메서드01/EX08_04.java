package section08_메서드.메서드01;

public class EX08_04 {

	//예제 8-4 2개 이상의 메서드 선언하기1
	
	String name;	//조거의 이름
	
	void run() {
		System.out.println("run run run");
	}
	
	void sayName() {
		//필드를 이용해 아래 문장 출력
		System.out.println("제 이름은 " + name + "입니다");
	}
}
