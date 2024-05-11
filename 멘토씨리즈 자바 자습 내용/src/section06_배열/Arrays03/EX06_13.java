package section06_배열.Arrays03;

import java.util.Arrays;

public class EX06_13 {

	public static void main(String[] args) {
		
		//예제 6-13 System 클래스를 이용한 깊은 복사
		
		int[] card = {1,6,4,5,3,2};
		int[] newCard = new int[card.length];
		//(복사 대상 배열, 복사 시작 위치, 카피할 배열, 시작 위치, 복사할 길이);
		System.arraycopy(card, 0, newCard, 0, card.length);
		
		System.out.println("card 배열: " + Arrays.toString(card));
		System.out.println("newCard 배열: " + Arrays.toString(newCard));
		
		/*
		 * 해설
		 * 12: newCard 배열에 card 배열의 길이만큼 복사합니다
		 * 14: System 클래스의 arraycopy 메서드를 사용해 배열을 복사합니다
		 * 매개변수로는 복사 대상, 시작 위치, 새로운 배열, 시작 위치, 복사할 길이를 부여합니다
		 */
	}
}
