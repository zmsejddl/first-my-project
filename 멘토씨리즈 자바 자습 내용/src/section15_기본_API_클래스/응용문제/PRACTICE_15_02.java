package section15_기본_API_클래스.응용문제;

public class PRACTICE_15_02 {

	public static void main(String[] args) {
		
		String sentence1 = "사과";
		String sentence2 = new String("사과");
		String sentence3 = "망고";
		
		System.out.println(sentence1 == sentence2);
		System.out.println(sentence2 == sentence3);
	}
}
