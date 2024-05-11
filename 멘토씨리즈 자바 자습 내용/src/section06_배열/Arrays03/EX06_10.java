package section06_배열.Arrays03;

import java.util.Arrays;

public class EX06_10 {

	public static void main(String[] args) {
		
		//예제 6-10 얕은 복사
		
		int[] arr01 = {1,2,3};
		
		//배열의 얕은 복사
		int[] arr02 = arr01;
		
		System.out.println("arr01 배열: " + Arrays.toString(arr01));
		
		//arr02 배열 값 변경
		arr02[1] = 10;
		
		//arr01 변경 후 배열 출력
		System.out.println("arr02 배열: " + Arrays.toString(arr01));
		System.out.println("arr01 배열: " + Arrays.toString(arr02));
		
		/*
		 * 해설
		 * 14: 배열과 같이 변수가 값이 아닌 주소를 가질 때는 대입 연산자는 값의 대입이 아니라, 가지고 있는 값의 주소를 공유합니다
		 * 따라서 arr02는 arr01 배열이 위치한 주소 값을 공유하는데 이를 '얕은 복사'라고 합니다
		 * 19: arr02 배열의 값을 변경합니다
		 * 22~23: arr01 값을 변경한 경우 얕은 복사된 arr02 배열의 동일한 위치 값도 변경됩니다
		 */
	}
}
