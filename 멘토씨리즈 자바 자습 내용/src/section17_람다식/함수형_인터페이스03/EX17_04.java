package section17_람다식.함수형_인터페이스03;

interface StrConcat1 {
	String concat(String str1, String str2);
}

public class EX17_04 {

	public static void main(String[] args) {

		//예제 17-4 지역변수 str 사용
		
		final String str = "java";
		StrConcat1 strConcat = (s, v) -> {
			String sentence = str + "! " + s + " " + v;
			return sentence;
		};
		System.out.println(strConcat.concat("Hello", "world"));
	}

	/*
	 * 해설
	 * 3~5: 함수형 인터페이스를 선언합니다
	 * 13: final 문자열 변수를 선언합니다
	 * 14~17: 익명 함수 내부에서 지역변수를 사용해 문자를 생성합니다
	 */
}
