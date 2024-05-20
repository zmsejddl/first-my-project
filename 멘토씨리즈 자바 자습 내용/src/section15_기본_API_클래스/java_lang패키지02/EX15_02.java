package section15_기본_API_클래스.java_lang패키지02;

public class EX15_02 {

	public static void main(String[] args) {

		//예제 15-2 equals 객체 비교
		
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		
		//문자열 변수 비교
		System.out.println("str1 vs str2: " + (str1.equals(str2)));
		System.out.println("str2 vs str3: " + (str2.equals(str3)));
		
		/*
		 * 해설
		 * 14~15: equals() 메서드를 사용해 값을 비교합니다
		 */
		
		/*
		 * TIP
		 * 객체 비교 equals()는 두 객체가 논리적으로 동일한 객체라면 true를,
		 * 그렇지 않으면 false를 리턴합니다
		 */
	}

}
