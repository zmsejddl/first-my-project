package section14_예외_처리.예외_클래스02;

public class EX14_01 {

	public static void main(String[] args) {

		//예제 14-1 NullPointException 예외
		
		//배열을 변수를 만들기만 하고 선언하지 않음
		String[] strArray = null;
		
		//생성되지 않은 배열을 출력하려고 함
		System.out.println("strArray[0] = " + strArray[0]);
	}

}
