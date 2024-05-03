package section02_변수와자료형.형_변환05;

public class EX02_21 {

	public static void main(String[] args) {

		//예제 2-21 형 변환하기
		int num1 = 11;
		double num2 = 3.14;
		double num1Change = (double)num1;
		
		System.out.println("num1: " + num1);
		System.out.println("num1Change: " + num1Change);
		System.out.println(num1Change + num2);
		System.out.println((int)1.23);
		
		//기본 자료형에서 boolean만 제외하고 서로 형 변환이 가능하다
	}

}
