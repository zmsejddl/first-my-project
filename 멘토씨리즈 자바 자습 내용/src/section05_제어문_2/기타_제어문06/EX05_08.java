package section05_제어문_2.기타_제어문06;

import java.util.Scanner;

public class EX05_08 {

	public static void main(String[] args) {

		//예제 5-8 break 문 <숫자 맞추기 게임>
		
		int magicNumber = (int)(Math.random() * 50) + 1;
		Scanner sc = new Scanner(System.in);
		boolean isMatched = false;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("찾는 숫자를 입력 >> ");
			int guess = sc.nextInt();
			
			if(guess == magicNumber) {
				System.out.println((i+1) + "번째에 맞췄습니다!");
				isMatched = true;
				break;
			} else if(guess > magicNumber) {
				System.out.println("맞춰야할 숫자가 더 작습니다");
			} else if(guess < magicNumber) {
				System.out.println("맞춰야할 숫자가 더 큽니다");
			}
		}
		
		if(isMatched = false) {
			System.out.println("정답을 맞추지 못했습니다");
		}
		
		/*
		 * 해설
		 * 22: break 문이 있으면 해당 구문이 있는 루프가 종료됩니다.
		 * 만약 이중 반복문일 경우에는 break 문이 있는 반복문만 종료됩니다
		 */
		
		/*
		 * TIP
		 * continue 문은 반복문을 계속 수행하지만 특정 조건에서 수행문을 제외하고자 하는 경우에 사용하고,
		 * break 문은 반복문을 더 이상 수행하지 않고 빠져나올 때 사용합니다.
		 * continue문은 break문과 달리 반복문을 벗어나지 않습니다
		 */
	
	}

}
