package section05_제어문_2.중첩for문03;

public class EX05_03 {

	public static void main(String[] args) {

		//예제 5-3 중첩 for 문 <구구단 출력하기>
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + "X" + j + "=" + (i*j) + "\t");
			}
			System.out.println();	//단 별로 줄바꿈
		}
		
		/*
		 * 해설
		 * 9: 외부 for 문은 시작 값이 2로 진행된다
		 * 10~12: 내부 for 문은 1에서 9까지 반복하며, 내부 for 문이 반복될때마다 외부 for문의 값과 곱하여 출력한다
		 * 13: 내부 for 문이 종료된 후 System.out.println()을 수행하여 라인 변경 후 다시 반복한다
		 */
	}

}
