package section08_메서드.매개변수와_return02;

public class EX08_16 {

	//예제 8-16 리턴한 값을 변수에 저장하는 메서드 정의
	
	public int score(int[] scores) {
		int result = 0;
		for(int i = 0; i < scores.length; i++) {
			result += scores[i];
		}
		
		return result;
	}
}
