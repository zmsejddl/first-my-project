package section04_제어문_1.if_else문04;

import java.util.Scanner;

public class EX04_06 {

	public static void main(String[] args) {

		//예제 4-6 if-else 문 활용2
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		
		int age = sc.nextInt();
		if(age > 19) {
			System.out.println("성인입니다");
		} else {
			System.out.println("미성년자입니다");
		}
		
		/*
		 * 해설
		 * 15~19: age에 저장된 값이 19보다 크면 16행의 문장이 실행되고 18행의 문장은 실행되지 않는다
		 * age에 저장된 값이 19이하일 경우 16행의 문장이 실행되지 않으며, 18행의 문장이 실행된다
		 */
		
		/*
		 * TIP
		 * if-else 문은 삼항 연산자를 이용하면 보다 간단하게 표현할 수 있다
		 * else는 if 문에서 닫는 중괄호}와 같은 줄에 작성하는 것이 가독성이 좋다
		 */
	}

}
