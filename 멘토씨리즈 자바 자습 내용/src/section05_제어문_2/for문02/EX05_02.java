package section05_제어문_2.for문02;

public class EX05_02 {

	public static void main(String[] args) {

		//예제 5-2 for 문2 <1부터 100까지의 숫자 중 짝수의 합 출력하기>
		
		int sum = 0;	//합을 저장할 변수
		
		//1부터 100까지 반복
		for(int i = 1; i <= 100; i++) {
			
			//2로 나누어 떨어지면 짝수
			if(i%2 == 0) {
				//짝수의 합을 더한다
				sum += i;
			}
		}
		
		System.out.println("합: " + sum);
	}

}
