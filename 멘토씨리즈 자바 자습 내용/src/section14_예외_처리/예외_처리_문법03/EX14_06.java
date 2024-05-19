package section14_예외_처리.예외_처리_문법03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX14_06 {

	public static void main(String[] args) {

		//예제 14-6 예외 처리가 한 개인 경우
		
		Scanner sc = new Scanner(System.in);
		
		try {
			int[] cards = {4,5,1,2,7,8};
			System.out.println("몇 번째 카드를 뽑이시겠습니까? >>");
			
			int cardIndex = sc.nextInt();
			System.out.println("뽑은 카드 번호는: " + cards[cardIndex]);
			
		} catch (InputMismatchException e) {
			System.out.println("잘못 하셨습니다. 숫자만 가능합니다");
		}
		
		System.out.println("프로그램 종료");
		sc.close();
		
		/*
		 * 해설
		 * 15: 배열에 숫자를 입력하여 생성합니다
		 * 16~18: 카드를 뽑을 배열의 위치를 입력합니다.(잘못 입력되었을 경우 20~22행에서 예외 처리 발생)
		 * 19: cardIndex가 배열의 범위를 넘어갈 경우 예외 처리 없이 중단합니다
		 */
	}

}
