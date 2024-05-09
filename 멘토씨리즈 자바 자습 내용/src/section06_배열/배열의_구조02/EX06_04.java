package section06_배열.배열의_구조02;

public class EX06_04 {

	public static void main(String[] args) {

		//예제 6-4 배열 값에서 짝수의 합 구하기
		
		//10개의 배열을 선언
		int[] numbers = new int[10];
		
		//배열에 랜덤 함수를 이용해 값을 입력
		for(int i = 0; i < numbers.length; i++) {
			//랜덤 함수를 이용해 각 배열 위치에 값을 입력
			numbers[i] = (int)(Math.random() * 20) + 1;
		}
		
		//배열 안에서 짝수만 구해서 합 구하기
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			
			if(numbers[i] % 2 == 0) {
				sum += numbers[i];
			}
		}
		
		//출력 해보기
		for(int i = 0; i < numbers.length; i++) {
			//numbers 배열의 랜덤 값 출력
			System.out.print(numbers[i] + " ");
		}
		
		//줄 바꾸기
		System.out.println();
		System.out.println("배열의 짝수들의 합: " + sum);
		
		/*
		 * 해설
		 * 15: 1에서 30사이의 특정 값을 랜덤하게 출력해 주는 함수를 이용합니다
		 * 13, 20, 28: numbers.length는 배열의 길이를 반환합니다.(변경은 할 수 없습니다)
		 */
	}

}
