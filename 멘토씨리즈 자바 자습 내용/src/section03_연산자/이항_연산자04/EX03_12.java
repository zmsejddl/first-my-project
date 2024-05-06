package section03_연산자.이항_연산자04;

public class EX03_12 {

	public static void main(String[] args) {

		//예제 3-12 복합 대입 연산자
		
		int x = 10;
		int y = 1;
		
		y += x;	//y = y + x: -> 1 + 10 = 11
		System.out.println(y);	//11
		
		y *= x;	//y = y * x: -> 11 * 10 = 110
		System.out.println(y);	//110
		
		y %= x;	//y = y % x: -> 110 % 10 = 0
		System.out.println(y);	//0
	}

}
