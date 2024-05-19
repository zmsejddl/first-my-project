package section14_예외_처리.예외_처리_문법03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX14_07 {

	public static void main(String[] args) {

		//예제 14-7 다중 예외 처리
		
		Scanner sc = new Scanner(System.in);
		
		try {
			int[] cards = {4,5,1,2,7,8};
			System.out.println("몇 번째 카드를 뽑이시겠습니까? >>");
			
			int cardIndex = sc.nextInt();
			System.out.println("뽑은 카드 번호는: " + cards[cardIndex]);
			
		} catch (InputMismatchException e) {
			System.out.println("잘못 하셨습니다. 숫자만 가능합니다");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("해당 번호의 카드는 없습니다");
		}
		
		System.out.println("프로그램 종료");
		sc.close();
		
		/*
		 * 해설
		 * 23~25: 배열의 인덱스 선택이 잘못됐을 경우 예외를 처리합니다
		 */
	}

}
