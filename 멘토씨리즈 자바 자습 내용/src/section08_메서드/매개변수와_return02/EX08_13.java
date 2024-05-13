package section08_메서드.매개변수와_return02;

public class EX08_13 {

	public static void main(String[] args) {

		//예제 8-13 매개변수를 배열로 받는 메서드 호출
		
		int nums[] = {100, 200};	//배열 생성
		EX08_12 calc = new EX08_12();	//EX08_12 객체 생성
		calc.sum(nums);	//calc 인스턴스의 sum 메서드 호출
	}

}
