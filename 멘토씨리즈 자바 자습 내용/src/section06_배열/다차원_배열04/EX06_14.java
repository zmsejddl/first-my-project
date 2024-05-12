package section06_배열.다차원_배열04;

public class EX06_14 {

	public static void main(String[] args) {
		
		//예제 6-14 각 행에 대한 열의 크기
		
		//행과 열을 지정하여 선언
		int[][] arr = new int[2][3];
		
		arr[0][0] = 1;
		arr[0][1] = 1;
		arr[0][2] = 1;
		
		arr[1][0] = 11;
		arr[1][1] = 12;
		arr[1][2] = 13;
		
		//행의 주소 출력
		System.out.println("2차원 배열: " + arr);
		//1행이 가진 열에 대한 주소 출력
		System.out.println("2차원 배열 1행: " + arr[0]);
		
		//행의 크기 출력
		System.out.println("행의 크기: " + arr.length);
		//각 행의 열 크기 출력
		System.out.println("1행의 열 크기" + arr[0].length);
		System.out.println("2행의 열 크기" + arr[1].length);
		//1행 1열의 값 출력
		System.out.println("arr[0][0] = " + arr[0][0]);
		
		/*
		 * 해설
		 * 26~29: 각 행마다 열의 크기는 다를 수 있습니다
		 */
	}
}
