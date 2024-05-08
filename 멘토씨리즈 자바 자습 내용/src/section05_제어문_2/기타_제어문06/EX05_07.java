package section05_제어문_2.기타_제어문06;

public class EX05_07 {

	public static void main(String[] args) {

		//예제 5-7 continue 문 <1에서 100사이의 짝수 구하기>
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i%2 != 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("짝수 합: " + sum);
		
		/*
		 * 해설
		 * 12: continue 문을 만나면 이번 차수의 루프가 종료되며 다음 반복을 실행합니다.
		 * 뒤에 실행문이 남아있어도 실행하지 않습니다.ㄴ
		 */
	}

}
