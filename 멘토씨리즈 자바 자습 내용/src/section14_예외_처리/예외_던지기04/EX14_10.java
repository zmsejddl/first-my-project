package section14_예외_처리.예외_던지기04;

import java.util.Scanner;

public class EX14_10 {

	public static void main(String[] args) {

		//예제 14-10 임의의 예외 처리
		
		Scanner sc = new Scanner(System.in);
		int val = 0;
		while(true) {
			try {
				System.out.println("숫자를 입력하세요(0~50): ");
				val = sc.nextInt();
				
				if(val == -1) {
					break;
				}
				
				if(val < 0 || val > 50) {
					
					//임의의 예외 발생
					throw new Exception("숫자의 허용범위가 아닙니다");
				}
				
			} catch (Exception e) {
				sc.nextLine();	//라인 단위 스트림 쓰기 및 버퍼 기우개용
				System.out.println("에러 메시지: " + e.getMessage());
			}
		}
		
		sc.close();
		System.out.println("프로그램 종료");
		
		/*
		 * 해설
		 * 18: -1이 들어오면 프로그램을 멈춥니다
		 * 25: 예외를 발생시킵니다
		 * 29: 키보드 입력은 마지막에 버퍼가 남기 때문에 비워주어야 합니다
		 * nextLine()은 문자열을 입력받는 기능이지만 버퍼를 지우는 기능도 있습니다
		 * 30: getMessage()는 시스템이 발생하는 예외 메시지를 출력합니다
		 */
	}

}
