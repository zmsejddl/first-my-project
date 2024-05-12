package section06_배열.향상된_for문05;

public class EX06_17 {

	public static void main(String[] args) {
		
		//예제 6-17 향상된 for문
		
		int[] score = {90, 92, 93};
		
		int sum = 0;
		double avg = 0;
		
		for(int val : score) {
			sum += val;
		}
		
		avg = (double) sum/3;
		
		System.out.println("총점: " + sum + ", 평균: " + avg);
		
		/*
		 * 해설
		 * 9: 3개의 값을 지닌 배열을 선언합니다
		 * 14~16: 향상된 for 문을 사용해 배열의 값을 추출합니다
		 * 우측의 배열 값을 좌측의 val 변수에 차례대로 대입해 반복합니다
		 * 18: 합산된 값을 3으로 나누어 평균을 구합니다
		 */
	}
}
