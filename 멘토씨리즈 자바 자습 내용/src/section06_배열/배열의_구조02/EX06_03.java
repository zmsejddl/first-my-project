package section06_배열.배열의_구조02;

public class EX06_03 {

	public static void main(String[] args) {

		//예제 6-3 배열 선언과 초기값
		
		//5개의 공간을 가지는 배열 선언
		int[] intArray = new int[5];
		String[] strArray = new String[5];
		
		//5개의 값을 가지는 배열 선언
		int[] varArray = {1,2,3,4,5};
		
		//intArray의 첫 번째 값 출력
		System.out.println("intArray[0] = " + intArray[0]);
		//intArray의 두 번째 값 출력
		System.out.println("intArray[1] = " + intArray[1]);
		
		//strArray의 첫 번째 값 출력
		System.out.println("strArray[0] = " + strArray[0]);
		//strArray의 두 번째 값 출력
		System.out.println("strArray[1] = " + strArray[1]);
		
		//varArray의 첫 번째 값 출력
		System.out.println("varArray[0] = " + varArray[0]);
		//varArray의 두 번째 값 출력
		System.out.println("varArray[1] = " + varArray[1]);
		
		/*
		 * 해설
		 * 10: 5개의 공간을 가진 정수형 배열을 선언합니다
		 * 11: 5개의 공간을 가진 문자열 배열을 선언합니다
		 * 14: 배열에 값을 부여하면서 개수 만큼의 공간을 부여합니다
		 */
	}

}
