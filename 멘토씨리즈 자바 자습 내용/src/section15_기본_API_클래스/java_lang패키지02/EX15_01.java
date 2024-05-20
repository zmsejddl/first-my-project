package section15_기본_API_클래스.java_lang패키지02;

public class EX15_01 {

	public static void main(String[] args) {

		//예제 15-1 문자열 비교
		
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		
		//문자열 변수 비교
		System.out.println("str1 vs str2: " + (str1 == str2));
		System.out.println("str2 vs str3: " + (str2 == str3));
		
		//각 문자열 변수가 있는 위치의 값을 출력
		System.out.println("str1 hashCode: " + System.identityHashCode(str1));
		System.out.println("str2 hashCode: " + System.identityHashCode(str2));
		System.out.println("str3 hashCode: " + System.identityHashCode(str3));
		
		/*
		 * 해설
		 * 11: 문자열 변수는 객체를 선언할 때 부여합니다
		 * 18~20: 문자열 변수가 메모리에 저장된 각각의 위치를 출력합니다
		 * 위치 값은 실행 시마다 다르게 출력됩니다
		 */
	}

}
