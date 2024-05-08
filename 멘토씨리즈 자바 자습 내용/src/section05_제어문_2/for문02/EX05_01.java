package section05_제어문_2.for문02;

public class EX05_01 {

	public static void main(String[] args) {

		//예제 5-1 for 문1 <1부터 10까지의 합 출력하기>
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("합: " + sum);
		
		/*
		 * 해설
		 * 9: 1부터 10까지 합을 저장할 변수 sum을 선언하고 0으로 초기화한다
		 * 11: int형 변수 i를 선언하고 1로 초기화한다
		 * 변수가 10이하가 될 때까지(true인 동안)반복이 이루어지며, 반복이 실행될 때마다 1만큼 증가한다
		 */
	}

}
