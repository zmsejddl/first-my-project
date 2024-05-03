package section02_변수와자료형.자료형03;

public class EX02_14 {

	public static void main(String[] args) {

		//예제 2-14 실수형2 <정밀도 확인하기>
		
		double pieDouble = 3.141592653589793;
		float pieFloat = 3.141592653589793f;
		
		System.out.println("double: " + pieDouble);
		System.out.println("float: " + pieFloat);
		
		//반드시 float형이 필요한 경우가 아니라면 
		//실수를 저장하는 변수로는 double형을 사용하는 것을 권장합니다
	}

}
