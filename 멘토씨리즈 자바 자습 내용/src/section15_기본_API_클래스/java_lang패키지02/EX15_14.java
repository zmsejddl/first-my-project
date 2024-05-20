package section15_기본_API_클래스.java_lang패키지02;

public class EX15_14 {

	public static void main(String[] args) {
		
		//예제 15-14 Wrapper 클래스
		
		//정수형 타입 선언
		//생성자를 통한 선언은 JDK 1.9부터 사용하지 않는 것을 권장
		Integer num01 = new Integer(10);
		Integer num02 = Integer.valueOf(10);
		
		//실수형 타입 선언
		Double doubleNum01 = Double.valueOf(30.11);
		
		//문자형 타입 선언
		Character ch = Character.valueOf('A');
		
		System.out.println("정수형1: " + num01);
		System.out.println("정수형2: " + num02);
		System.out.println("실수형: " + doubleNum01);
		System.out.println("문자형: " + ch);
		
		/*
		 * 해설
		 * 11: Wrapper 클래스를 생성자를 통해 선언하는 방식입니다
		 * JDK 1.9부터는 사용하는 것을 권장하지 않습니다
		 */
	}
}
