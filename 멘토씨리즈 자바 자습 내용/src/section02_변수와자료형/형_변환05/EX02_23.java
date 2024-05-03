package section02_변수와자료형.형_변환05;

public class EX02_23 {

	public static void main(String[] args) {

		//예제 2-23 실수형 간의 형 변환하기
		
		double d1 = 1.0e100; //1.0 x (10의 100승) (float의 최대 범위를 넘음)
		float f1 = (float)d1;
		System.out.println(f1);
		
		double d2 = 1.0e-100; //1.0 x (10의 -100)승) (float의 최소 범위를 넘음)
		float f2 = (float)d2;
		System.out.println(f2);
	}

}
