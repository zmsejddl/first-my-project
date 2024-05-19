package section14_예외_처리.예외_처리_문법03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX14_08 {

	public static void main(String[] args) {

		//예제 14-8 finally 문법
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("점수를 입력하세요 >>");
			int score = sc.nextInt();
			if(score >= 60) {
				System.out.println("합격입니다");
			} else {
				System.out.println("아쉽네요. 불합격입니다");
			}
			
		} catch (InputMismatchException e) {
			System.out.println("키보드 입력이 올바르지 않습니다");
			
		} finally {
			sc.close();
			System.out.println("프로그램 종료");
		}
		
		/*
		 * 해설
		 * 16: Scanner로 숫자를 입력합니다
		 * 23~24: 숫자 외 입력 시 예외 처리합니다
		 * 26~29: 예외 유무와 상관없이 실행되며 프로그램을 종료합니다
		 */
	}

}
