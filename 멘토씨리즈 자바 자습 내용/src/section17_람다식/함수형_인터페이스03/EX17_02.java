package section17_람다식.함수형_인터페이스03;

interface CompareNumber {
	int compareTo(int num01, int num02);
}

public class EX17_02 {

	public static void main(String[] args) {

		//예제 17-2 익명 객체 선언을 람다식으로 변경
		
		//인터페이스 객체 선언 시 람다식을 이용해 함수를 구현
		CompareNumber compare = 
			(num01, num02) -> {return num01 > num02 ? 1 : num01 < num02 ? -1 : 0;};
				
		int num01 = 10;
		int num02 = 20;
		int result = compare.compareTo(num01, num02);
		
		if(result > 0) {
			System.out.println("num01이 num02 보다 크다");
		} else if(result < 0) {
			System.out.println("num01이 num02 보다 작다");
		} else {
			System.out.println("num01과 num02 같다");
		}
		
		/*
		 * 해설
		 * 14~15: 람다식을 이용해 함수형 인터페이스 기능을 구현합니다
		 * 19: 함수를 이용해 두 수의 크기를 비교합니다
		 */
	}

}
