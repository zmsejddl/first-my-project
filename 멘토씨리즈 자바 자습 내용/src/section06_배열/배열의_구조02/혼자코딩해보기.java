package section06_배열.배열의_구조02;

public class 혼자코딩해보기 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 30) +1;
		}
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				sum += arr[i];
			}
		}
		
		System.out.println(sum);
	}
}
