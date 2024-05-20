package section15_기본_API_클래스.java_lang패키지02;

public class EX15_03 {

	public static void main(String[] args) {

		//예제 15-3 hashCode() 객체 비교
		
		String str1 = "hello";
		String str2 = "hello";
		String str3 = "apple";
		
		System.out.println("str1 hashCode(): " + str1.hashCode());
		System.out.println("str2 hashCode(): " + str2.hashCode());
		System.out.println("str3 hashCode(): " + str3.hashCode());
		
		/*
		 * 해설
		 * 13~15: String 객체가 가지고 있는 해시코드 값을 출력합니다
		 */
	}

}
