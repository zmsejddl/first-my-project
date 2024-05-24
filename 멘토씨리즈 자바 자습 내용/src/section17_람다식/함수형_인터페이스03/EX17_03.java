package section17_람다식.함수형_인터페이스03;

//두 문자을 결합하는 함수 생성
interface StrConcat {
	String concat(String str1, String str2);
}

public class EX17_03 {

	public static void main(String[] args) {

		//예제 17-3 지역변수 str 재정의 시 오류
		
		String str = "";
		
		StrConcat strConcat = (s, v) -> {
			//지역변수 재정의 시 오류
			str = s + v;
			return str;
		};
		
		/*
		 * 해설
		 * 4~6: 함수형 인터페이스를 선언합니다
		 * 14: 문자열 변수를 선언합니다
		 * 18: 익명 함수 내에서 지역변수 수정 시 오류가 발생하며 지역변수는 final 처리됩니다
		 */
	}

}
