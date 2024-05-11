package section06_배열.Arrays03;

import java.util.Arrays;

public class EX06_11 {

	public static void main(String[] args) {
		
		//예제 6-11 새로운 배열을 생성하여 복사
		
		int[] card = {1,6,4,5,3,2};
		int[] newCard = new int[card.length];
		
		//새로운 배열에 기존 내용 삽입
		for(int i = 0; i < card.length; i++) {
			newCard[i] = card[i];
		}
		
		System.out.println("card 배열: " + Arrays.toString(card));
		System.out.println("newCard 배열: " + Arrays.toString(newCard));
		
		/*
		 * 해설
		 * 11: card 배열을 선언합니다
		 * 12: card 배열을 복사할 배열을 선언합니다
		 * 15~17: 반복문을 사용해 새로운 배열에 기존 배열 값을 입력합니다
		 */
	}
}
