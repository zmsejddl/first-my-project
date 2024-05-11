package section06_배열.Arrays03;

import java.util.Arrays;
import java.util.Comparator;

public class EX06_09 {

	public static void main(String[] args) {
		
		//예제 6-9 Arrays.sort()를 이용한 배열의 내림차순
		
		Integer[] arr = {1,6,2,3,10,7,4,5,8,9};
		
		System.out.println("정렬 전 배열: " + Arrays.toString(arr));
		//배열의 내림차순 정렬
		Arrays.sort(arr, Comparator.reverseOrder());
		System.out.println("내림차순 정렬: " + Arrays.toString(arr));
		
		/*
		 * 해설
		 * 12: 클래스 형태의 정수형 데이터 배열을 선언합니다
		 * 16: Arrays.sort()를 이용해 내림차순으로 정렬합니다.
		 * Comparator 클래스의 reverseOrder() 메서드를 이용해 정렬합니다
		 */
	}
}
