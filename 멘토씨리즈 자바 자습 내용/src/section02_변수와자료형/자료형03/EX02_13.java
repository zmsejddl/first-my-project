package section02_변수와자료형.자료형03;

public class EX02_13 {

	public static void main(String[] args) {

		//예제 2-13 실수형1
		
		double marathon = 42.195;
		//float halfMarathon = 21.0975; 구문 오류 발생
		//float는 대문자 'F'나 소문자 'f'를 붙여야 한다
		float halfMarathon = 21.0975f;
		
		System.out.println("마라톤은 " + marathon + "km를 달립니다.");
		System.out.println("하프 마라톤은 " + halfMarathon + "km를 달립니다.");
	}

}
