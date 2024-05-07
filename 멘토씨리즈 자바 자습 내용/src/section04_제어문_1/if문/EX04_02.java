package section04_제어문_1.if문;

import java.util.Scanner;

public class EX04_02 {

	public static void main(String[] args) {

		//예제 4-2 if 문2
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		
		int age = sc.nextInt();
		if(age > 19) {
			System.out.println("성인입니다");
		}
		System.out.println("프로그램을 종료합니다");
		
		/*
		 * 해설
		 * 11: Scanner 객체를 생성한다. System.in은 입력한 값을 바이트 단위로 읽는 것을 뜻한다
		 * 14: nextInt 메서드를 통해 정수로 입력받아 age 변수에 저장한다
		 * 15~17: age에 저장된 값이 19보다 클 경우 16행의 문장이 실행되며, 19이하면 실행되지 않는다
		 * 18: 18행의 문장은 15행의 조건문의 결과와 관계없이 실행된다
		 */
	}

}
