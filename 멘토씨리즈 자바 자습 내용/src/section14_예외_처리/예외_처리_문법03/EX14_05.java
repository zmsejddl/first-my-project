package section14_예외_처리.예외_처리_문법03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX14_05 {

	public static void main(String[] args) {

		//예제 14-5 예외 처리 2
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("점수를 입력하세요: ");
			int score = sc.nextInt();
			
			if(score >= 65) {
				System.out.println("합격입니다");
			} else {
				System.out.println("합격입니다");
			}
			
		} catch (InputMismatchException e) {
			System.out.println("키보드 입력이 잘못되었습니다");
		}
		
		sc.close();
		System.out.println("프로그램 종료");
		
		/*
		 * 해설
		 * 16: Scanner를 통해 정수 타입 값을 입력받아야 합니다.
		 * 정수 외의 값을 입력하면 예외가 발생합니다
		 * 24: Scanner를 통한 키보드 입력이 잘못되면 InputMismatchException 예외가 발생합니다
		 */
	}

}
