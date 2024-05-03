package section02_변수와자료형.데이터_입력06;

import java.util.Scanner;

public class EX02_30 {

	public static void main(String[] args) {

		//예제 2-30 데이터 입력받기
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나이를 입력해 주세요.");
		int age = scanner.nextInt();	//정수형을 입력 받음
		System.out.printf("내 나이는 %d세 입니다", age);
	}

}
