package section06_배열.다차원_배열04;

public class EX06_15 {

	public static void main(String[] args) {
		
		//예제 6-15 2차원 배열을 이용한 예제 1
		
		int[][] arr = new int[5][5];
		
		int count = 1;
		
		//1부터 25까지 차례대로 배열에 값을 넣는다
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				arr[i][j] = count++;
			}
		}
		//배열 출력하기
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
