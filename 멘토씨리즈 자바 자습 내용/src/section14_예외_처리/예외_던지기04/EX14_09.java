package section14_예외_처리.예외_던지기04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX14_09 {

	//성격 유형 검사를 위한 메서드
	public static void checkYourSelf(Scanner sc) throws InputMismatchException {
		System.out.println("1. 사람과 어울리는 것이 좋다. 2. 혼자 있는 것이 좋다.");
		System.out.println("선택 >> ");
		int check = sc.nextInt();
		
		//성격 체크 후 출력
		if(check == 1) {
			System.out.println("당신은 ENFP");
		} else {
			System.out.println("당신은 ISFP");
		}
	}
	
	public static void main(String[] args) {

		//예제 14-9 예외 던지기
		
		//스캐너 선언
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("===성격 유형 검사를 시작합니다===");
			
			//메서드 호출
			EX14_09.checkYourSelf(sc);
			
		} catch (InputMismatchException e) {
			System.out.println("키보다 입력이 잘못되었습니다");
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
		System.out.println("프로그램 종료");
	}

	/*
	 * 해설
	 * 9: 예외 발생 시 호출한 대상으로 떠넘깁니다
	 * 12: Scanner로 숫자를 입력합니다
	 * 15~19: 키보드 입력을 처리합니다
	 * 32: 메서드를 호출합니다
	 * 34~36: 예외 처리를 합니다
	 */
}
