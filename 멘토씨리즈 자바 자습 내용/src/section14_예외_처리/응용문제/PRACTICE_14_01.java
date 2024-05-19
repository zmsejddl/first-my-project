package section14_예외_처리.응용문제;

public class PRACTICE_14_01 {

	public static void main(String[] args) {

		int data = 10;
		double result = 0;
		
		try {
			result = data / 0;
			System.out.println("결과는: " + result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}
	}

}
