package section05_제어문_2.do_while문05;

public class EX05_06 {

	public static void main(String[] args) {

		//예제 5-6 do while 문 <1부터 10까지의 합 출력하기>
		
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			i++;
		} while(i <= 10);
		
		System.out.println("합: " + sum);
		
		/*
		 * 해설
		 * 12~15: do-while 문은 최초 1회는 조건 없이 실행됩니다. 
		 * 1회 반복 이후부터 조건에 부합하는지 확인합니다
		 */
	}

}
