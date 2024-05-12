package section06_배열.다차원_배열04;

import java.util.Scanner;

public class EX06_16 {

	public static void main(String[] args) {
		
		//2차원 배열을 활용한 로또
		
		//당첨 번호 리스트
		int[][] lotto = {{2,6,11,33,42,44},
						{1,6,17,22,24,33},
						{7,16,24,33,42,44},
						{11,27,32,34,43,46},
						{6,17,22,24,33,41}};
		
		//키보드 입력을 받기 위한 스캐너
		Scanner sc = new Scanner(System.in);
		String myNum = "";
		System.out.println("당첨 숫자 6개를 연속으로 입력해주세요. >>");
		myNum = sc.next();
		
		//당첨 여부를 나타내는 변수
		boolean isWin = false;
		
		for(int i = 0; i < lotto.length; i++) {
			//당첨 번호를 만들기 위한 변수
			String lottoNumber = "";
			//한 행의 번호를 더해서 하나의 숫자로 만든다
			for(int j = 0; j < lotto[i].length; j++) {
				lottoNumber += lotto[i][j];
			}
			//문자열은 비교할 때 equals 함수를 사용하여 비교
			if(myNum.equals(lottoNumber)) {
				isWin = true;
				break;
			}
		}
		
		if(isWin) {
			System.out.println(myNum + " 번호 당첨!!");
		} else {
			System.out.println(myNum + " 번호는 당첨되지 못했습니다");
		}
		sc.close();
		
		/*
		 * 해설
		 * 35: 문자열은 객체형 데이터 타입이기 때문에 값을 비교할 때 ==(부등호) 비교가 아닌 equals(비교 대상) 함수를 사용하여 비교합니다.
		 * (같으면 true, 다르면 false)
		 * 46: Scanner는 프로그램 종료 시 닫아주는 것이 좋습니다
		 */
	}
}
