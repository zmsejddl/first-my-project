package section15_기본_API_클래스.java_lang패키지02;

public class EX15_10 {

	public static void main(String[] args) {
		
		//예제 15-10 replace 메서드
		
		String str = "자바 프로그래밍은 어렵지만 자바를 배울수록 재미있습니다";
		//단어 '자바'를 'Java'로 변경
		String newStr = str.replaceAll("자바", "Java");
		
		System.out.println(str);
		System.out.println(newStr);
	}
}
