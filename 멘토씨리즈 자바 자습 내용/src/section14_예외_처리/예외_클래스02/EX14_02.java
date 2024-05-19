package section14_예외_처리.예외_클래스02;

public class EX14_02 {

	public static void main(String[] args) {

		//예제 14-2 NumberFormatException 예외
		
		String str01 = "11";
		String str02 = "11.2";
		
		//정수 형태의 문자열을 정수로 변환
		int num01 = Integer.parseInt(str01);
		
		System.out.println("String to int: " + num01);
		
		//실수 형태의 문자열을 정수로 변환
		int num02 = Integer.parseInt(str02);
		
		System.out.println("String to int: " + num02);
		
		/*
		 * 해설
		 * 18: 정수는 실수를 포함하지 않기 때문에 소수점(.)을 문자로 인식합니다
		 */
	}

}
