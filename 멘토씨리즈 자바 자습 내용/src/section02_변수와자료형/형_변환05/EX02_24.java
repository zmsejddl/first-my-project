package section02_변수와자료형.형_변환05;

public class EX02_24 {

	public static void main(String[] args) {

		//예제 2-24 실수형, 정수형 형 변환하기
		
		//실수형에서 정수형
		double pie = 3.14;
		int pieInt = (int)pie;
		System.out.println(pieInt);
		
		//정수형에서 실수형 (범위 내)
		int num = 100;
		double numD = (double)num;
		float numF = (float)100;
		System.out.println(numD);
		System.out.println(numF);
		
		//정수형에서 실수형 (범위 밖)
		int i = 99999999;
		float f = (float)i;
		System.out.println(f);
	}

}
