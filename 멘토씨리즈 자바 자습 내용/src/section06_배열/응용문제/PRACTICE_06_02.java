package section06_배열.응용문제;

public class PRACTICE_06_02 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		
		System.out.println("짝수들의 합: " + sum);
	}
}
