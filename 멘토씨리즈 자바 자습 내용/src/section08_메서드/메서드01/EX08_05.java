package section08_메서드.메서드01;

public class EX08_05 {

	public static void main(String[] args) {

		//예제 8-5 2개 이상의 메서드 선언하기2
		
		EX08_04 jogger = new EX08_04();	//객체 생성
		jogger.name = "김나비";
		jogger.sayName();	//jogger 인스턴스의 sayName() 메서드 호출
		jogger.run();	//jogger 인스턴스의 run() 메서드 호출
	}

}
