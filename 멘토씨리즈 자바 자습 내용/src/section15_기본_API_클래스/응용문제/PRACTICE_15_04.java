package section15_기본_API_클래스.응용문제;

import java.util.Scanner;

public class PRACTICE_15_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int matchValue = 0;
		int value = 0;
		
		matchValue = (int)(Math.random() * 30) + 1;
		while(count < 10) {
			System.out.println("맞출 숫자 입력: ");
			value = sc.nextInt();
			count++;
			if(value == matchValue) {
				System.out.println("정답");
				break;
			} else if(count == 10){
				System.out.println("10번 안에 못 맞췄습니다");
				System.out.println("정답은: " + matchValue + "입니다");
			}
		}
		sc.close();
	}
}
