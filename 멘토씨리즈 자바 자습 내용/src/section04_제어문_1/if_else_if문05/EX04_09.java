package section04_제어문_1.if_else_if문05;

import java.util.Scanner;

public class EX04_09 {

	public static void main(String[] args) {

		//예제 4-9 if-else 문3
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		if(age > 19) {
			System.out.println("성인입니다");
		} else if(age > 13) {
			System.out.println("청소년이다");
		} else if(age > 6) {
			System.out.println("어린이이다");
		} else {
			System.out.println("유아이다");
		}
		
		/*
		 * 해설
		 * 14: age에 저장된 값이 19보다 크면 25행의 문장이 실행되고 if 문을 벗어난다
		 * 16: age에 저장된 값이 19이하이고 13보다 크면 17행의 문장이 실행되고 if 문을 벗어난다
		 * 18: age에 저장된 값이 13이하이고 6보다 크면 19행의 문장이 실행되고 if 문을 벗어난다
		 * 20: age에 저장된 값이 6이하인 경우 21행의 문장이 실행되고 22행으로 이동한다
		 */
	}

}
