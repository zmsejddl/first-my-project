package section02_변수와자료형.형_변환05;

public class EX02_25 {

	public static void main(String[] args) {

		//예제 2-25 자동 형 변환1
		
		int num1 = 14;
		double num2 = 3.14;
		
		//double num4 = num1; -> num1을 자동으로 double로 형 변환 해줌
		//int num3 = (double)num2 -> 자동 형 변환을 할 수 없는 역방향! 컴파일 에러 발생!
		int num4 = (int) num2;
		
		System.out.println(num4);
	}

}
