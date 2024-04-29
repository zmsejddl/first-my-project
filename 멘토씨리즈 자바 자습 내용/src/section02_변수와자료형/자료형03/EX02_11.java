package section02_변수와자료형.자료형03;

public class EX02_11 {

	public static void main(String[] args) {

		//예제 2-11 정수형 1
		
		byte num1 = 20;
		//byte num5 = 128; 이 구문은 에러가 발생한다
		//byte가 저장할 수 있는 숫자의 범위(-128~127)를 벗어났기 때문이다
		short num2 = 30;
		int num3 = 40;
		long num4 = 50;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}

}
