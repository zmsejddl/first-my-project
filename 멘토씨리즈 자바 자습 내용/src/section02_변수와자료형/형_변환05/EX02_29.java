package section02_변수와자료형.형_변환05;

public class EX02_29 {

	public static void main(String[] args) {

		//예제 2-29 강제 형 변환3
		
		//float형 -> int형 강제 형 변환
		float f1 = 12345.67f;
		int i1 = (int) f1;
		System.out.println("[float-> int] f1의 값: " + f1 + ", i1의 값: " + i1);
		
		//double형 -> int형 강제 형 변환
		double d1 = 12345.678;
		int i2 = (int) d1;
		System.out.println("[double -> int] d1의 값: " + d1 + ", i2의 값: " + i2);
		
		//자동 형 변환은 업 캐스팅(묵시적 형 변환)이라고도 하며, 
		//강제 형 변환은 다운 캐스팅(명시적 형 변환)이라고도 한다
	}

}
