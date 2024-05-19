package section14_예외_처리.사용자_정의_예외_처리05;

import java.util.Scanner;

public class EX14_12 {

	public static void main(String[] args) {

		//예제 14-12 메인 소스
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("당신의 나이를 입력하세요 >> ");
			int age = sc.nextInt();
			
			if(age < 0) {
				throw new EX14_11("입력이 잘못되었습니다");
			}
			
			if(age > 19) {
				System.out.println("성인입니다");
			} else if(age > 13) {
				System.out.println("청소년입니다");
			} else if(age > 6) {
				System.out.println("어린이입니다");
			} else {
				System.out.println("아동입니다");
			}
		} catch (EX14_11 e) {
			System.out.println(e.getMessage());
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
		
		/*
		 * 해설
		 * 17: 개발자가 만든 EX14_11을 임의로 예외 발생시킵니다
		 * 29~31: 발생한 예외를 처리합니다
		 */
	}

}
