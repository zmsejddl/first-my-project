package section02_변수와자료형.형_변환05;

public class EX02_26 {

	public static void main(String[] args) {

		//예제 2-26 자동 형 변환2
		
		int i = 100;
		char c = 'a';
		int j = c; //char형에서 int형으로 자동 변환
		double d = i; //int형에서 double형으로 자동 변환
		
		System.out.println("int형 변수 j의 값: " + j);
		System.out.println("double형 변수 d의 값: " + d);
		
		//실수형은 소수점까지 표현하기 때문에 정수형보다 표현 범위는 크다고 할 수 있다
		//다만, 값의 크기는 정수형이 더 클 수 있으므로 형 변환하는 경우 오차가 발생할 수 있다
	}

}
