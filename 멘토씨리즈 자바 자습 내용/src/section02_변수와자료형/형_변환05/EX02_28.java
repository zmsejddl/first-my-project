package section02_변수와자료형.형_변환05;

public class EX02_28 {

	public static void main(String[] args) {

		//예제 2-28 강제 형 변환2
		
		//double형 -> float형 강제 형 변환(float형 범위 내 값)
		double d1 = 1.1234;
		float f1 = (float) d1;
		System.out.println("[double -> float] d1의 값: " + d1 + ", f1의 값: " + f1);
		
		//double형 -> float형 강제 형 변환(float형 최소값보다 작은 경우)
		double d2 = 1.0e-50;
		float f2 = (float) d2;
		System.out.println("[double -> float] d2의 값: " + d2 + ", f2의 값: " + f2);
		
		//double형 -> float형 강제 형 변환(float형 최대값보다 큰 경우)
		double d3 = 1.0e100;
		float f3 = (float) d3;
		System.out.println("[double -> float] d3의 값: " + d3 + ", f3의 값: " + f3);
		
		//double형 -> float형 강제 형 변환(float형 최대값보다 큰 경우)
		double d4 = 9.123456789;
		float f4 = (float) d4;
		System.out.println("[double -> float] d4의 값: " + d4 + ", f4의 값: " + f4);
	
		/*
		 * 예제를 통해 다음과 같은 결과를 확인할 수 있다
		 * 1. 범위 내 값에서 강제 형 변환을 실행하면 데이터의 손실 없이 변환된다
		 * 2. float형이 가질 수 있는 최소값보다 작은 경우 0.0이 된다
		 * 3. float형이 가질 수 있는 최대값보다 큰 경우 무한대(Infinity)가 된다
		 * 4. float형의 범위 내 값이지만 소수점 아래 값에서는 정밀도에서 차이가 난다
		 */
	}

}
