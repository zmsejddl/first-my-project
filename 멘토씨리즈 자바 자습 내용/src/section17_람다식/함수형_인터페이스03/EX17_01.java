package section17_람다식.함수형_인터페이스03;

interface Compareumber {
	int compareTo(int num01, int num02);
}

public class EX17_01 {

	public static void main(String[] args) {

		//예제 17-1 익명 함수 선언하여 비교하기
		
		//인터페이스 객체를 익명 클래스 선언으로 정의
		Compareumber compare = new Compareumber() {
			
			//메서드 구현
			@Override
			public int compareTo(int num01, int num02) {
				return num01 > num02 ? 1 : num01 < num02 ? -1 : 0;
			}
		};
		
		int num01 = 10;
		int num02 = 20;
		//두 수를 비교해 결과를 반환
		int result = compare.compareTo(num01, num02);
		//비교에 대한 결과를 출력
		if(result > 0) {
			System.out.println("num01이 num02 보다 크다");
		} else if(result < 0) {
			System.out.println("num01이 num02 보다 작다");
		} else {
			System.out.println("num01과 num02 같다");
		}
		
		/*
		 * 해설
		 * 14~21: 인터페이스를 익명함수로 선언하고 메서드를 구현합니다
		 * 26: 두 수를 비교해 결과를 반환합니다
		 * 28~34: 결과를 출력합니다
		 */
	}

}
