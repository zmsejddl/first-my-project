package section06_배열.Arrays03;

import java.util.Arrays;

public class EX06_12 {
	
	public static void main(String[] args) {
		
		int[] card = {3,1,4,5,10};
		
		//배열의 깊은 복사 - Arrays.copyOf(배열, 복사 범위)
		int[] newCard = Arrays.copyOf(card, card.length);
		
		System.out.println("card 배열: " + Arrays.toString(card));
		
		//card 배열 값 변경
		card[1] = 10;
		
		//card 변경 후 배열 출력
		System.out.println("card 배열: " + Arrays.toString(card));
		System.out.println("newCard 배열: " + Arrays.toString(newCard));
		
		/*
		 * 해설
		 * 12: newCard 배열에 card 배열의 길이만큼 복사합니다.
		 * Arrays.copyOf() 기능은 기존 배열 위치가 아닌 새로운 배열을 생성한 후 반환합니다
		 * 17: card 배열의 2번째 값을 변경합니다
		 * 20~21: 한쪽이 변경돼도 영향을 받지 않습니다
		 */
	}
}
