package section08_메서드.매개변수와_return02;

public class EX08_19 {

	public static void main(String[] args) {

		//예제 8-19 return으로 메서드 빠져나가기
		
		int money = 10000;
		
		EX08_18 bus = new EX08_18();	//EX08_18 객체 생성
		bus.take(money);	//bus 인스턴스의 take 메서드 호출
	}

}
