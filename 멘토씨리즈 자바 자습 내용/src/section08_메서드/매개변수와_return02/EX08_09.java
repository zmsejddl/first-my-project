package section08_메서드.매개변수와_return02;

public class EX08_09 {

	public static void main(String[] args) {

		//예제 8-9 매개변수가 2개 이상인 메서드 호출
		
		EX08_08 calc = new EX08_08();	//객체 생성
		calc.sum(5, 3);	//calc 인스턴스 sum 메서드 호출
		calc.sum(10, 7);	//calc 인스턴스 sum 메서드 호출
	}

}
